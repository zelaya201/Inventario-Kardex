/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilidades.CambiaPanel;
import vistas.main.Menu;
import vistas.modulos.Home;
import vistas.modulos.VistaKardex;
import vistas.modulos.VistaProducto;

/**
 *
 * @author Adonay
 */
public class Controlador implements ActionListener{
    
    Menu vMenu;
    Home vHome;
    
    /* PRODUCTOS */
    VistaProducto vProductos;
    
    /* REPORTE KARDEX */
    VistaKardex vKardex;

    public Controlador(Menu vMenu) {
        this.vMenu = vMenu;
        this.vMenu.setControlador(this);
        this.vMenu.iniciar();
        vHome = new Home();
        new CambiaPanel(vMenu.body, vHome);
    }
    
    public void mostrarMenu(){
        
    }
    
    public void mostrarModulos(String modulo){
        if(modulo.equals("mInicio")){
            vHome = new Home();
            new CambiaPanel(vMenu.body, vHome);
        }else if(modulo.equals("mProductos")){
            vProductos = new VistaProducto();
            new CambiaPanel(vMenu.body, vProductos);
        }else if(modulo.equals("mKardex")){
            vKardex = new VistaKardex();
            new CambiaPanel(vMenu.body, vKardex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand().equals("Inicio")){
            mostrarModulos("mInicio");
        }else if(ae.getActionCommand().equals("Productos")){
            mostrarModulos("mProductos");
        }else if(ae.getActionCommand().equals("Kardex")){
            mostrarModulos("mKardex");
        }
    }
 
}
