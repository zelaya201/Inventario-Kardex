/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Movimiento;
import modelos.Productos;
/**
 *
 * @author Adonay
 */
public class ExportPDF {

    public ExportPDF(ArrayList<Productos> listProductos, ArrayList<Movimiento> listMovimientos,int pos, String path) throws FileNotFoundException {
        
        //Direccion donde se guarda el archivo
        String dir = path + "\\" + listProductos.get(pos).getCodigoProducto()+ "_" + listProductos.get(pos).getProducto().toUpperCase().replace(" ", "") + ".pdf";
        
        PdfWriter writer = new PdfWriter(dir);
        PdfDocument pdf = new PdfDocument(writer);
        
        Document documento = new Document(pdf, PageSize.LETTER.rotate());
        documento.setMargins(40, 20, 20, 20);
        Table encabezado = new Table (4).useAllAvailableWidth();
        
        encabezado.setHorizontalAlignment(HorizontalAlignment.CENTER);
        encabezado.setBorder(Border.NO_BORDER);

        encabezado.addCell(new Cell(0, 4).add(new Paragraph("Reporte Kardex - Control de inventario por producto").setItalic().setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.CENTER).setFontSize(16f)));
        encabezado.addCell(new Cell().add(new Paragraph("Articulo: " +  listProductos.get(pos).getProducto()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));        
        encabezado.addCell(new Cell().add(new Paragraph("Cod. Referencia: " + listProductos.get(pos).getCodigoProducto()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph("Cant. Maxima: " + listProductos.get(pos).getCantMax()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph("Ubicación: " + listProductos.get(pos).getLocalizacion()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph("Cant. Minima: " + listProductos.get(pos).getCantMin()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph("Unidad: " + listProductos.get(pos).getUnidades()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph("Proveedor: " + listProductos.get(pos).getProveedor()).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
        encabezado.addCell(new Cell().add(new Paragraph(" ").setTextAlignment(TextAlignment.CENTER)).setBorder(Border.NO_BORDER));
        
        Table table1 = new Table(new float[]{1,1,1,1,1,1,1,1,1}).useAllAvailableWidth();
        table1.setHorizontalAlignment(HorizontalAlignment.CENTER);     
        
        table1.addHeaderCell(new Cell(2, 1).add(new Paragraph("Fecha").setTextAlignment(TextAlignment.CENTER)).setVerticalAlignment(VerticalAlignment.MIDDLE));
        table1.addHeaderCell(new Cell(2, 1).add(new Paragraph("Concepto").setTextAlignment(TextAlignment.CENTER)).setVerticalAlignment(VerticalAlignment.MIDDLE));
        table1.addHeaderCell(new Cell(2, 1).add(new Paragraph("Valor Unitario").setTextAlignment(TextAlignment.CENTER)).setVerticalAlignment(VerticalAlignment.MIDDLE));
        table1.addHeaderCell(new Cell(0, 2).add(new Paragraph("Entradas").setTextAlignment(TextAlignment.CENTER)));  
        table1.addHeaderCell(new Cell(0, 2).add(new Paragraph("Salidas").setTextAlignment(TextAlignment.CENTER)));
        table1.addHeaderCell(new Cell(0, 2).add(new Paragraph("Existencias").setTextAlignment(TextAlignment.CENTER)));
        
        table1.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setTextAlignment(TextAlignment.CENTER)));
        table1.addHeaderCell(new Cell().add(new Paragraph("Valor").setTextAlignment(TextAlignment.CENTER)));
        
        table1.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setTextAlignment(TextAlignment.CENTER)));
        table1.addHeaderCell(new Cell().add(new Paragraph("Valor").setTextAlignment(TextAlignment.CENTER)));
        
        table1.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setTextAlignment(TextAlignment.CENTER)));
        table1.addHeaderCell(new Cell().add(new Paragraph("Valor").setTextAlignment(TextAlignment.CENTER)));
        
        for(Movimiento x : listMovimientos){
            if(x.getProducto().getCodigoProducto().equals(listProductos.get(pos).getCodigoProducto())){
                table1.addCell(new Cell().add(new Paragraph(x.getFecha().toString()).setTextAlignment(TextAlignment.CENTER))); //Fecha
                table1.addCell(new Cell().add(new Paragraph(x.getOperacion() + " - " + x.getTipoMovimiento()).setTextAlignment(TextAlignment.CENTER))); //Concepto
                table1.addCell(new Cell().add(new Paragraph("$ " + x.getvUnitario()).setTextAlignment(TextAlignment.RIGHT))); //Valor unitario
                
                /* ENTRADAS */
                if(x.getTipoMovimiento().equals("Entrada")){
                    table1.addCell(new Cell().add(new Paragraph(String.valueOf(x.getCantidad())).setTextAlignment(TextAlignment.CENTER))); //Cantidad - Entradas
                }else{
                    table1.addCell(new Cell().add(new Paragraph(" "))); //Cantidad - Entradas
                }
                
                if(x.getTipoMovimiento().equals("Entrada")){
                    table1.addCell(new Cell().add(new Paragraph("$ " + x.getvTotal()).setTextAlignment(TextAlignment.RIGHT))); //Valor - Entradas
                }else{
                    table1.addCell(new Cell().add(new Paragraph(" "))); //Valor - Entradas
                }
                
                /* SALIDAS */
                if(x.getTipoMovimiento().equals("Salida")){
                    table1.addCell(new Cell().add(new Paragraph(String.valueOf(x.getCantidad())).setTextAlignment(TextAlignment.CENTER))); //Cantidad - Entradas
                }else{
                    table1.addCell(new Cell().add(new Paragraph(" "))); //Cantidad - Entradas
                }
                
                if(x.getTipoMovimiento().equals("Salida")){
                    table1.addCell(new Cell().add(new Paragraph("$ " + x.getvTotal()).setTextAlignment(TextAlignment.RIGHT))); //Valor - Entradas
                }else{
                    table1.addCell(new Cell().add(new Paragraph(" ").setTextAlignment(TextAlignment.RIGHT))); //Valor - Entradas
                }
                
                /* EXISTENCIAS */
                table1.addCell(new Cell().add(new Paragraph(" - ").setTextAlignment(TextAlignment.CENTER))); //Cantidad - Existencias
                table1.addCell(new Cell().add(new Paragraph(" - ").setTextAlignment(TextAlignment.CENTER))); //Valor - Existencias
          
            }
        }
        
        documento.add(encabezado);
        documento.add(table1);
        documento.close();
        
        try {
            File objetofile = new File (dir);
            Desktop.getDesktop().open(objetofile);
        }catch (IOException ex) {
            System.out.println(ex);
        }
    } 
    
}
