package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
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

    Menu vMenu;
    Home vHome;

    /* PRODUCTOS */
    VistaProducto vProductos;
    private ArrayList<Productos>productos;
    
    private TableModel tm;

    public Controlador(Menu vMenu) {
        this.vMenu = vMenu;
        this.vMenu.setControlador(this);
        this.vMenu.iniciar();
        vHome = new Home();
        vProductos = new VistaProducto();
        new CambiaPanel(vMenu.body, vHome);
    }

    
    public void mostrarMenu() {
    }

    public void mostrarModulos(String modulo) {
        if (modulo.equals("mInicio")) {
            vHome = new Home();
            new CambiaPanel(vMenu.body, vHome);
        } else if (modulo.equals("mProductos")) {
//            vProductos = new VistaProducto();
            ControladorProductos ctrlProductos = new ControladorProductos(vProductos);
            new CambiaPanel(vMenu.body, vProductos);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Inicio")) {
            mostrarModulos("mInicio");
        } else if (ae.getActionCommand().equals("Productos")) {
            mostrarModulos("mProductos");
        }
    }

}
