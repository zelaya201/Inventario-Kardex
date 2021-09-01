/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelos.Movimiento;
import modelos.Productos;
import utilidades.CambiaPanel;
import vistas.main.Menu;
import vistas.modulos.Home;
import vistas.modulos.VistaMovimiento;
import vistas.modulos.VistaProducto;

/**
 *
 * @author Mario Zelaya
 */
public class Controlador implements ActionListener, MouseListener, KeyListener, ItemListener {
    
    private Menu vMenu;
    private Home vHome;
    private String principalOn = "";
    DefaultTableModel modelo = new DefaultTableModel();
    
    /* PRODUCTOS */
    VistaProducto vProductos;
    
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
        }else if(modulo.equals("mMovimientos")) {
            vMovimientos = new VistaMovimiento();
            vMovimientos.setControlador(this);
            principalOn = "Movimientos";
            new CambiaPanel(vMenu.body, vMovimientos);
        }
    }
    
    public void mostrarDatos(JTable tabla){

        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) tabla.getCellRenderer(0, 0); //Obtener diseño de la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DecimalFormat id = new DecimalFormat("000000");
        
        /* PRODUCTOS */
        if (principalOn.equals("Movimientos")) {
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat formateador = new DecimalFormat("0.00",simbolos);

            tabla.getColumnModel().getColumn(0).setCellRenderer(diseño); //Mantener diseño de la tabla por columns
            tabla.getColumnModel().getColumn(1).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(2).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(3).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(4).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(5).setCellRenderer(diseño);
            tabla.getColumnModel().getColumn(6).setCellRenderer(diseño);
            
            for (Movimiento x: movimientos) {
                modelo.addRow(new Object[]{x.getCodigo(), x.getFecha(), x.getTipoMovimiento() + ": " + x.getOperacion(), x.getProducto().getProducto(), "$ " + formateador.format(x.getvUnitario()), x.getCantidad(), "$ " + formateador.format(x.getvTotal())});
            }
            
            if(modelo.getRowCount() < 1){
                modelo.addRow(new Object[]{"", "", "Ningún resultado encontrado"});
            }
                
            tabla.setModel(modelo);
        }
    }

    public void eventosBotones(ActionEvent e){
        if (principalOn.equals("Movimientos") && e.getActionCommand().equals("guardarMovimiento")) {
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
                    }else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")) {
                        
                    }
                }
                
                movimientos.add(movimiento);
                // AQUI VA LA ALERTA DE AGREGADO
                mostrarDatos(vMovimientos.tbMovimiento);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand().equals("Inicio")){
            mostrarModulos("mInicio");
        }else if(ae.getActionCommand().equals("Productos")){
            mostrarModulos("mProductos");
        }else if(ae.getActionCommand().equals("Movimientos")) {
            mostrarModulos("mMovimientos");
        }else if(ae.getActionCommand().equals("guardarMovimiento")){
            eventosBotones(ae);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
