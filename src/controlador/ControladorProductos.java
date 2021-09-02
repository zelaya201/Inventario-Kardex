/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Productos;
import modelos.arregloProducto;
import vistas.modulos.VistaProducto;

/**
 *
 * @author Julio
 */
public class ControladorProductos implements ActionListener {

    private DefaultTableModel md;
    private VistaProducto vProductos;
    private ArrayList<Productos> arrayProductos;

    public ControladorProductos(VistaProducto vProductos) {
        this.vProductos = vProductos;
        md = new DefaultTableModel();
        md.addColumn("Código");
        md.addColumn("Categoría");
        md.addColumn("Proveedor");
        md.addColumn("Producto");
        md.addColumn("Unidad");
        md.addColumn("Cantidad minima");
        md.addColumn("Cantidad maxima");
        md.addColumn("Referencias");
        md.addColumn("Localización");
        this.vProductos.tbProductos.setModel(md);
        this.vProductos.btnProducto.addActionListener(this);
    }

    arregloProducto ap = new arregloProducto();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vProductos.btnProducto) {

            String codigo = this.vProductos.codProducto.getText();
            String categ = this.vProductos.categoriaProd.getText();
            String prove = this.vProductos.proveedor.getText();
            String produ = this.vProductos.productos.getText();
            String unidad = (String) this.vProductos.cbUnidad.getSelectedItem();
            int cantMin = Integer.parseInt(this.vProductos.CantMin.getText());
            int cantMax = Integer.parseInt(this.vProductos.CantMax.getText());
            String ref = this.vProductos.referencias.getText();
            String local = this.vProductos.txtLocalizacion.getText();
            
            Productos p = new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local);
            ap.agregar(p);

            md.setRowCount(0);
            for (int i = 0; i < ap.ta(); i++) {
                Object[] fila = {
                    ap.obtener(i).getCodigoProducto(),
                    ap.obtener(i).getCategorias(),
                    ap.obtener(i).getProveedor(),
                    ap.obtener(i).getProducto(),
                    ap.obtener(i).getUnidades(),
                    ap.obtener(i).getCantMin(),
                    ap.obtener(i).getCantMax(),
                    ap.obtener(i).getReferencia(),
                    ap.obtener(i).getLocalizacion()
                };

                md.addRow(fila);
            }

        }
        limpiar();
    }

    public void limpiar() {
        this.vProductos.codProducto.setText("");
        this.vProductos.categoriaProd.setText("");
        this.vProductos.proveedor.setText("");
        this.vProductos.productos.setText("");
//        Unidades
        this.vProductos.CantMin.setText("");
        this.vProductos.CantMax.setText("");
        this.vProductos.referencias.setText("");
        this.vProductos.txtLocalizacion.setText("");
    }

}
