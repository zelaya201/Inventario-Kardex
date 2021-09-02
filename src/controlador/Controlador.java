package controlador;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelos.Movimiento;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Productos;
import utilidades.CambiaPanel;
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
//        productos.add(new Productos("001", "Fragancias", "AVON", "Makuin Fragrance", "Gramos", "12", "30", "F-2", "Estante 2"));
//        productos.add(new Productos("002", "Cosmeticos", "AVON", "Cremita", "Gramos", "10", "40", "C-3", "Estante 3"));
//        productos.add(new Productos("003", "Muebles", "Maderas SA de CV", "Silla x", "Kilogramos", "16", "39", "M-2", "Almacen 2"));
//        productos.add(new Productos("004", "Collar 5U", "ORO main", "Quilates", "Gramos", "5", "25", "J-6", "Vitrina 6"));
//        productos.add(new Productos("005", "Fragancias", "ABARELA", "Fragrance W", "Gramos", "10", "30", "F-2", "Estante 9"));
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

            vKardex.lbArticulo.setText(productos.get(i).getProducto());
            vKardex.lbCantMax.setText(String.valueOf(productos.get(i).getCantMax()));
            vKardex.lbReferencia.setText(productos.get(i).getReferencia());
            vKardex.lbCantMin.setText(String.valueOf(productos.get(i).getCantMin()));
            vKardex.lbUbicacion.setText(productos.get(i).getLocalizacion());
            vKardex.lbUnidad.setText(productos.get(i).getUnidades());
            vKardex.lbProveedor.setText(productos.get(i).getProveedor());

            modelo = (DefaultTableModel) vKardex.tablaDetalles.getModel();

        }
    }

    public void eventosBotones(ActionEvent e) {
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
            
            mostrarTabla(vProductos.tbProductos );
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Inicio")) {
            mostrarModulos("mInicio");
        } else if (ae.getActionCommand().equals("Productos")) {
            mostrarModulos("mProductos");
//            upTabla(this.vProductos.tbProductos);
        } else if (ae.getActionCommand().equals("guardarProducto")) {
            eventosBotones(ae);
        } else if (ae.getActionCommand().equals("Kardex")) {
            mostrarModulos("mKardex");
        } else if (ae.getActionCommand().equals("Movimientos")) {
            mostrarModulos("mMovimientos");
        } else if (ae.getActionCommand().equals("guardarMovimiento")) {
            eventosBotones(ae);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (on.equals("Kardex")) {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCodigoProducto().contains(vKardex.tfBusqueda.getText() + ke.getKeyChar())) {
                    mostrarBusqueda(i);
                    break;
                } else {
                    System.out.println("No existe");
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
        this.vProductos.codProducto.setText("");
        this.vProductos.categoriaProd.setText("");
        this.vProductos.proveedor.setText("");
        this.vProductos.productos.setText("");
//        Unidades
        this.vProductos.CantMin.setText("");
        this.vProductos.CantMax.setText("");
        this.vProductos.referencias.setText("");
        this.vProductos.txtLocalizacion.setText("");
        vProductos.enabledbt();
    }
    public void upTabla(JTable up){
        up.getModel();
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
