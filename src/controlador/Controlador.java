package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.PilaArrayList;
import modelos.Productos;
import utilidades.CambiaPanel;
import vistas.main.Menu;
import vistas.modulos.Home;
import vistas.modulos.VistaProducto;

/**
 *
 * @author Adonay
 */
public class Controlador implements ActionListener {

    private Menu vMenu;
    private Home vHome;

    /* PRODUCTOS */
    private VistaProducto vProductos;

    private ArrayList<Productos> productos = new ArrayList();
    DefaultTableModel md;
    private String on = "";

    public Controlador(Menu vMenu) {
        this.vMenu = vMenu;
        this.vMenu.setControlador(this);
        this.vMenu.iniciar();
        vHome = new Home();
        new CambiaPanel(vMenu.body, vHome);
    }

    public void mostrarMenu() {
    }

    public void mostrarModulos(String modulo) {
        if (modulo.equals("mInicio")) {
            vHome = new Home();
            new CambiaPanel(vMenu.body, vHome);
        } else if (modulo.equals("mProductos")) {
            vProductos = new VistaProducto();
            vProductos.setControlador(this);
            vProductos.iniciar();
            on = "productoActivo";
            new CambiaPanel(vMenu.body, vProductos);
            mostrarTabla(vProductos.tbProductos);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Inicio")) {
            mostrarModulos("mInicio");
        } else if (ae.getActionCommand().equals("Productos")) {
            mostrarModulos("mProductos");
        }
        if (ae.getSource() == vProductos.btnProducto) {
            mostrarTabla(vProductos.tbProductos);
        }
    }

    public void mostrarTabla(JTable tabla) {
        md = (DefaultTableModel) tabla.getModel();
        md.setRowCount(0);

//        OBTENIENDO DE LA VISTA LOS DATOS
        String codigo = this.vProductos.codProducto.getText();
        String categ = this.vProductos.categoriaProd.getText();
        String prove = this.vProductos.proveedor.getText();
        String produ = this.vProductos.productos.getText();
        String unidad;// = (String) this.vProductos.cbUnidad.getSelectedItem();
        String cantMin = this.vProductos.CantMin.getText();
        String cantMax = this.vProductos.CantMax.getText();
        String ref = this.vProductos.referencias.getText();
        String local = this.vProductos.txtLocalizacion.getText();
        if (this.vProductos.cbUnidad.getSelectedItem().equals("Kilogramos")) {
            unidad = "";
        } else {
            unidad = (String) this.vProductos.cbUnidad.getSelectedItem();
        }

//            PilaArrayList pilita = new PilaArrayList();
        Productos p = new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local);
//            pilita.push(new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local));
        productos.add(p);
        if (on.equals("productoActivo")) {
//            PARA PRUEBAS
            productos.add(new Productos("001", "Fragancias", "AVON", "Makuin Fragrance", "Gramos", "12", "30", "F-2", "Estante 2"));
            productos.add(new Productos("002", "Cosmeticos", "AVON", "Cremita", "Gramos", "10", "40", "C-3", "Estante 3"));
            productos.add(new Productos("003", "Muebles", "Maderas SA de CV", "Silla x", "Kilogramos", "16", "39", "M-2", "Almacen 2"));
            productos.add(new Productos("004", "Collar 5U", "ORO main", "Quilates", "Gramos", "5", "25", "J-6", "Vitrina 6"));
            productos.add(new Productos("005", "Fragancias", "ABARELA", "Fragrance W", "Gramos", "10", "30", "F-2", "Estante 9"));
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

//PARA AGREGAR DESDE EL MODULO
//            for (int i = 0; i < productos.size(); i++) {
//                Object[] fila = {
//                    productos.get(i).getCodigoProducto(),
//                    productos.get(i).getCategorias(),
//                    productos.get(i).getProveedor(),
//                    productos.get(i).getProducto(),
//                    productos.get(i).getUnidades(),
//                    productos.get(i).getCantMin(),
//                    productos.get(i).getCantMax(),
//                    productos.get(i).getReferencia(),
//                    productos.get(i).getLocalizacion()
//                };
//                md.addRow(fila);
//            }
        }
        if (md.getRowCount() < 1) {
            md.addRow(new Object[]{"Sin Datos"});
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

}
