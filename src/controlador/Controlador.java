package controlador;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableCellRenderer;
import modelos.Movimiento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Productos;
import utilidades.CambiaPanel;
import utilidades.ExportPDF;
import vistas.main.Menu;
import vistas.modulos.Home;
import vistas.modulos.VistaKardex;
import vistas.modulos.VistaMovimiento;
import vistas.modulos.VistaProducto;

/**
 *
 * @author Mario Zelaya
 */
public class Controlador extends MouseAdapter implements ActionListener, MouseListener, KeyListener, ItemListener {

    private Menu vMenu;
    private Home vHome;
    private String on = "";
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel md;

    /* PRODUCTOS */
    VistaProducto vProductos;
    ArrayList<Productos> productos = new ArrayList();

    /* REPORTE KARDEX */
    VistaKardex vKardex;
    private int iterador;

    /* MOVIMIENTOS */
    VistaMovimiento vMovimientos;
    ArrayList<Movimiento> movimientos = new ArrayList();
    Productos productoSelected = null;

    public Controlador(Menu vMenu) {
        this.vMenu = vMenu;
        this.vMenu.setControlador(this);
        this.vMenu.iniciar();
        vHome = new Home();
        new CambiaPanel(vMenu.body, vHome);

        Productos p1 = new Productos("001", "FRAGANCIAS", "AVON", "KALOS FOR MEN", "GRAMOS", "12", "30", "F-2", "STAND-2");
        Productos p2 = new Productos("002", "COSMETICOS", "AVON", "CREMA FOR BODY", "GRAMOS", "10", "40", "C-3", "STAND-5");
        Productos p3 = new Productos("003", "MUEBLES", "CARPINTERIA AYALA", "SILLA", "KILOGRAMOS", "16", "39", "M-2", "ALMACEN-2");
        Productos p4 = new Productos("004", "COLLARES", "JOYERIA ELIAS", "QUILATES", "GRAMOS", "5", "25", "J-6", "VITRINA-0");
        Productos p5 = new Productos("005", "FRAGANCIAS", "ORIFLAME", "XTREME 3 PACK", "GRAMOS", "10", "30", "F-2", "STAND-9");

        movimientos.add(new Movimiento("F001", new Date(), "Entrada", "Salida", p1, 2.92, 10, 15.23));
        movimientos.add(new Movimiento("F002", new Date(), "Salida", "Salida", p1, 8.88, 4, 35.23));
        movimientos.add(new Movimiento("F003", new Date(), "Salida", "Entrada", p1, 1.88, 2, 5.23));

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
    }

    public void mostrarModulos(String modulo) {
        if (modulo.equals("mInicio")) {
            vHome = new Home();
            new CambiaPanel(vMenu.body, vHome);
        } else if (modulo.equals("mKardex")) {
            vKardex = new VistaKardex();
            vKardex.setControlador(this);
            on = "Kardex";
            new CambiaPanel(vMenu.body, vKardex);
        } else if (modulo.equals("mMovimientos")) {
            vMovimientos = new VistaMovimiento();
            vMovimientos.setControlador(this);
            on = "Movimientos";
            new CambiaPanel(vMenu.body, vMovimientos);
        } else if (modulo.equals("mProductos")) {
            vProductos = new VistaProducto();
            vProductos.setControlador(this);
            on = "productoActivo";
            new CambiaPanel(vMenu.body, vProductos);
            upTabla(vProductos.tbProductos);
//            mostrarTabla(vProductos.tbProductos);
        }
    }

    public void mostrarDatos(JTable tabla) {

        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) tabla.getCellRenderer(0, 0); //Obtener diseño de la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DecimalFormat id = new DecimalFormat("000000");

        /* PRODUCTOS */
        if (on.equals("Movimientos")) {
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat formateador = new DecimalFormat("0.00", simbolos);

            tabla.getColumnModel().getColumn(0).setCellRenderer(diseño); //Mantener diseño de la tabla por columns
            tabla.getColumnModel().getColumn(1).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(2).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(3).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(4).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(5).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(6).setCellRenderer(diseño);

            for (Movimiento x : movimientos) {
                modelo.addRow(new Object[]{x.getCodigo(), x.getFecha(), x.getTipoMovimiento() + ": " + x.getOperacion(), x.getProducto().getProducto(), "$ " + formateador.format(x.getvUnitario()), x.getCantidad(), "$ " + formateador.format(x.getvTotal())});
            }

            if (modelo.getRowCount() < 1) {
                modelo.addRow(new Object[]{"", "", "Ningún resultado encontrado"});
            }

            tabla.setModel(modelo);
        }
    }

    public void mostrarBusqueda(int i) {
      
        if (on.equals("Kardex")) {

            vKardex.btnExportPDF.setEnabled(true);
            vKardex.lbArticulo.setText(productos.get(i).getCodigoProducto() + " - " + productos.get(i).getProducto());
            vKardex.lbCantMax.setText(String.valueOf(productos.get(i).getCantMax()));
            vKardex.lbReferencia.setText(productos.get(i).getReferencia());
            vKardex.lbCantMin.setText(String.valueOf(productos.get(i).getCantMin()));
            vKardex.lbUbicacion.setText(productos.get(i).getLocalizacion());
            vKardex.lbUnidad.setText(productos.get(i).getUnidades());
            vKardex.lbProveedor.setText(productos.get(i).getProveedor());

            DefaultTableModel modelo1 = (DefaultTableModel) vKardex.tablaDetalles.getModel();
            modelo1.setRowCount(0);

            DefaultTableModel modelo2 = (DefaultTableModel) vKardex.tablaEntradas.getModel();
            modelo2.setRowCount(0);

            DefaultTableModel modelo3 = (DefaultTableModel) vKardex.tablaSalidas.getModel();
            modelo3.setRowCount(0);

            DefaultTableModel modelo4 = (DefaultTableModel) vKardex.tablaExistencias.getModel();
            modelo4.setRowCount(0);

            for (Movimiento x : movimientos) {
                
                if (x.getProducto().getCodigoProducto().equals(productos.get(i).getCodigoProducto())) {
                    modelo1.addRow(new Object[]{x.getFecha(), x.getTipoMovimiento() + " -> " + x.getOperacion(), "$ " + x.getvUnitario()});

                    if (x.getTipoMovimiento().equals("Entrada")) {
                        modelo2.addRow(new Object[]{x.getCantidad(), "$ " + x.getvTotal()});
                    } else {
                        modelo2.addRow(new Object[]{"", ""});
                    }

                    if (x.getTipoMovimiento().equals("Salida")) {
                        modelo3.addRow(new Object[]{x.getCantidad(), "$ " + x.getvTotal()});
                    } else {
                        modelo3.addRow(new Object[]{"", ""});
                    }

                    modelo4.addRow(new Object[]{"", ""});

                }

                vKardex.tablaDetalles.setModel(modelo1);
                vKardex.tablaEntradas.setModel(modelo2);
                vKardex.tablaSalidas.setModel(modelo3);
                vKardex.tablaExistencias.setModel(modelo4);
            }
        }
    }

    public void eventosBotones(ActionEvent e) throws FileNotFoundException {
        if (on.equals("Movimientos") && e.getActionCommand().equals("guardarMovimiento")) {
            if (productoSelected != null && vMovimientos.dcFecha.getDatoFecha() != null && vMovimientos.cbTipo.getSelectedIndex() > 0
                    && vMovimientos.cbOperacion.getSelectedIndex() > 0 && !vMovimientos.tfValorUnitario.getText().isEmpty()
                    && !vMovimientos.tfCantidad.getText().isEmpty() && !vMovimientos.tfValor.getText().isEmpty()) {
                Movimiento movimiento = new Movimiento(vMovimientos.tfCodigo.getText(), vMovimientos.dcFecha.getDatoFecha(),
                        vMovimientos.cbTipo.getSelectedItem().toString(), vMovimientos.cbOperacion.getSelectedItem().toString(), productoSelected,
                        Double.parseDouble(vMovimientos.tfValorUnitario.getText()), Integer.parseInt(vMovimientos.tfCantidad.getText()),
                        Double.parseDouble(vMovimientos.tfValor.getText()));

                if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Inventario Inicial") || vMovimientos.cbTipo.getSelectedItem().toString().equals("Entrada")) {
                    if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Compra")) {
                        productoSelected.getExistencias().push(movimiento);
                    } else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")) {

                    }
                }

                movimientos.add(movimiento);
                // AQUI VA LA ALERTA DE AGREGADO
                mostrarDatos(vMovimientos.tbMovimiento);
            }
        }
        if (on.equals("productoActivo") && e.getActionCommand().equals("guardarProducto")) {
            String codigo = this.vProductos.codProducto.getText();
            String categ = this.vProductos.categoriaProd.getText();
            String prove = this.vProductos.proveedor.getText();
            String produ = this.vProductos.productos.getText();
            String unidad = this.vProductos.cbUnidad.getSelectedItem().toString();
            String cantMin = this.vProductos.CantMin.getText();
            String cantMax = this.vProductos.CantMax.getText();
            String ref = this.vProductos.referencias.getText();
            String local = this.vProductos.txtLocalizacion.getText();

            Productos p = new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local);
            productos.add(p);

            mostrarTabla(vProductos.tbProductos);
        }

        if (on.equals("Kardex") && e.getActionCommand().equals("exportPDF")) {

            String path = "";

            JFileChooser file = new JFileChooser();
            file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int request = file.showSaveDialog(vKardex);

            if (request == JFileChooser.APPROVE_OPTION) {
                path = file.getSelectedFile().getPath();
                new ExportPDF(productos, movimientos, iterador, path);
                vKardex.tfBusqueda.setText("");
                limpiar();
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Inicio")) {
            mostrarModulos("mInicio");
        } else if (ae.getActionCommand().equals("Productos")) {
            mostrarModulos("mProductos");
            mostrarTabla(vProductos.tbProductos);
        } else if (ae.getActionCommand().equals("guardarProducto")) {
            try {
                eventosBotones(ae);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ae.getActionCommand().equals("Kardex")) {
            mostrarModulos("mKardex");
        } else if (ae.getActionCommand().equals("Movimientos")) {
            mostrarModulos("mMovimientos");
        } else if (ae.getActionCommand().equals("guardarMovimiento")) {
            try {
                eventosBotones(ae);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ae.getActionCommand().equals("exportPDF")) {
            try {
                eventosBotones(ae);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (on.equals("Kardex")) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCodigoProducto().equals(vKardex.tfBusqueda.getText() + ke.getKeyChar())) {
                    mostrarBusqueda(i);
                    iterador = i;
                    break;
                } else {
                    limpiar();
                }
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ae) {

    }

    public void mostrarTabla(JTable tabla) {
        md = (DefaultTableModel) tabla.getModel();
        md.setRowCount(0);
        for (int i = 0; i < productos.size(); i++) {
            Object[] fila = {
                productos.get(i).getCodigoProducto(),
                productos.get(i).getCategorias(),
                productos.get(i).getProveedor(),
                productos.get(i).getProducto(),
                productos.get(i).getUnidades(),
                productos.get(i).getCantMin(),
                productos.get(i).getCantMax(),
                productos.get(i).getReferencia(),
                productos.get(i).getLocalizacion()
            };
            md.addRow(fila);
        }
        if (md.getRowCount() < 1) {
            md.addRow(new Object[]{"", "", "Ningún resultado encontrado"});
        }

        tabla.setModel(md);

        limpiar();
    }

    public void limpiar() {

        if (on.equals("productoActivo")) {
            this.vProductos.codProducto.setText("");
            this.vProductos.categoriaProd.setText("");
            this.vProductos.proveedor.setText("");
            this.vProductos.productos.setText("");
            this.vProductos.CantMin.setText("");
            this.vProductos.CantMax.setText("");
            this.vProductos.referencias.setText("");
            this.vProductos.txtLocalizacion.setText("");
            vProductos.enabledbt();
        } else if (on.equals("Kardex")) {
            vKardex.btnExportPDF.setEnabled(false);
            vKardex.lbArticulo.setText("-");
            vKardex.lbCantMax.setText("-");
            vKardex.lbReferencia.setText("-");
            vKardex.lbCantMin.setText("");
            vKardex.lbUbicacion.setText("-");
            vKardex.lbUnidad.setText("-");
            vKardex.lbProveedor.setText("-");
            DefaultTableModel modelo1 = (DefaultTableModel) vKardex.tablaDetalles.getModel();
            modelo1.setRowCount(0);

            DefaultTableModel modelo2 = (DefaultTableModel) vKardex.tablaEntradas.getModel();
            modelo2.setRowCount(0);

            DefaultTableModel modelo3 = (DefaultTableModel) vKardex.tablaSalidas.getModel();
            modelo3.setRowCount(0);

            DefaultTableModel modelo4 = (DefaultTableModel) vKardex.tablaExistencias.getModel();
            modelo4.setRowCount(0);
        }

    }

    public void upTabla(JTable up) {
        up.getModel();
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
