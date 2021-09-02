/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
    private String on = "";
    DefaultTableModel modelo = new DefaultTableModel();
    
    /* PRODUCTOS */
    VistaProducto vProductos;
    
    /* MOVIMIENTOS */
    VistaMovimiento vMovimientos;
    Movimiento movimientoSelected;
    ArrayList<Movimiento> movimientos = new ArrayList();
    Productos productoSelected = null;
    String prefijo = "";

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
            on = "Movimientos";
            vMovimientos.cbOperacion.setEnabled(false);
            vMovimientos.tfCodigo.setEnabled(false);
            new CambiaPanel(vMenu.body, vMovimientos);
        }
    }
    
    public void mostrarDatos(JTable tabla){
        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) tabla.getCellRenderer(0, 0); //Obtener diseño de la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DecimalFormat id = new DecimalFormat("000000");
        
        /* PRODUCTOS */
        if (on.equals("Movimientos")) {
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

    public void mostrarBusqueda(ArrayList lista, JTable tabla) {
        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) tabla.getCellRenderer(0, 0); //Obtener diseño de la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        DecimalFormat id = new DecimalFormat("000000");
        
        /* MOVIMIENTOS */
        if (on.equals("Movimientos")) {
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat formateador = new DecimalFormat("0.00",simbolos);
            
            for (Object obj : lista) {
                Productos x = (Productos) obj;
                modelo.addRow(new Object[]{x.getCodigoProducto(), x.getProducto()});
            }
            
            if(modelo.getRowCount() < 1){
                modelo.addRow(new Object[]{"", "", "Ningún resultado encontrado"});
            }
                
            tabla.setModel(modelo);
        }
    }
    
    public void eventosBotones(ActionEvent e){
        if (on.equals("Movimientos") && e.getActionCommand().equals("guardarMovimiento")) {
            if (productoSelected != null && vMovimientos.dcFecha.getDatoFecha() != null && vMovimientos.cbTipo.getSelectedIndex() > 0
                    && vMovimientos.cbOperacion.getSelectedIndex() > 0 && !vMovimientos.tfValorUnitario.getText().isEmpty() 
                    && !vMovimientos.tfCantidad.getText().isEmpty() && !vMovimientos.lbProducto.getText().isEmpty()) {
                Movimiento movimiento = new Movimiento(vMovimientos.tfCodigo.getText(), vMovimientos.dcFecha.getDatoFecha(), 
                        vMovimientos.cbTipo.getSelectedItem().toString(), vMovimientos.cbOperacion.getSelectedItem().toString(), productoSelected,
                        Double.parseDouble(vMovimientos.tfValorUnitario.getText()), Integer.parseInt(vMovimientos.tfCantidad.getText()),
                        Double.parseDouble(vMovimientos.lbProducto.getText()));
                
                if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Entrada")) {
                    if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Compra") || vMovimientos.cbOperacion.getSelectedItem().toString().equals("Inventario inicial")) {
                        productoSelected.getExistencias().push(movimiento);
                    }else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")) {
                        ArrayList<Movimiento> listaProd = productoSelected.getExistencias().toArray();
                        ArrayList<Movimiento> temp = new ArrayList();
                        
                        for (Movimiento x: listaProd) { /* Busca el movimiento */
                            temp = (ArrayList<Movimiento>)productoSelected.getExistencias().pop();
                            if (movimiento.getCodigo().equals(x.getCodigo())) {
                                break;
                            }
                            System.out.println(x.getCodigo());
                        }
                        
                        for (Movimiento x: temp) { /* Modifica el movimiento */
                            if (movimiento.getCodigo().equals(x.getCodigo())) {
                                x.setCantidad(x.getCantidad() - movimiento.getCantidad());
                                x.setvTotal(x.getCantidad() * x.getvUnitario());
                            }
                            productoSelected.getExistencias().push(x);
                        }
                    }
                }else if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Salida")) {
                    movimientoSelected = (Movimiento)productoSelected.getExistencias().pop();
                    
                    movimientoSelected.setCantidad(movimientoSelected.getCantidad() - movimiento.getCantidad());
                    movimientoSelected.setvTotal(movimiento.getCantidad() * movimiento.getvUnitario());
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
        if(on.equals("Usuarios") && me.getSource() == vMovimientos.tbProductos){
            int columna = vMovimientos.tbProductos.getSelectedColumn();
            //try{
            if(columna == 0 || columna == 1){
                int fila = vMovimientos.tbProductos.getSelectedRow();
                String codigo = vMovimientos.tbProductos.getValueAt(fila, 0).toString();

                for (Productos x: productos) {
                    if (codigo.equals(x.getCodigoProducto())) {
                        productoSelected = x;
                    }
                }

                vMovimientos.lbProducto.setText(productoSelected.getProducto());
            }
        }
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
        if (on.equals("Movimientos")) {
            ArrayList<Productos> lista = new ArrayList();
            
            for (Productos x: productos) {
                if ((vMovimientos.tfBusqueda.getText() + ke.getKeyChar()).equals(x.getProducto)) {
                    lista.add(x);
                }
            }
            
            mostrarBusqueda(lista, vMovimientos.tbProductos);
            
            
//            if (!productos.isEmpty()) {
//                
//            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (on.equals("Movimientos")) {
            if (ie.getItemSelectable() == vMovimientos.cbTipo && ie.getStateChange() == ItemEvent.SELECTED) {
                vMovimientos.cbOperacion.setEnabled(true);
                vMovimientos.cbOperacion.removeAllItems();
                vMovimientos.cbOperacion.addItem("Seleccione");

                Boolean isSet = false;

                //if (productoSelected != null) {
                    for (Movimiento x: movimientos) {
                        if (productoSelected.getCodigoProducto().equals(x.getProducto().getCodigoProducto()) && x.getOperacion().equals("Inventario inicial")) {
                            isSet = true;
                        }
                    }

                    if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Entrada")) {
                        //if (!isSet) {
                            vMovimientos.cbOperacion.addItem("Inventario inicial");
                        //}else {
                            vMovimientos.cbOperacion.addItem("Compra");
                            vMovimientos.cbOperacion.addItem("Devolucion");
                        //}
                    }else if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Salida")){
                        vMovimientos.cbOperacion.addItem("Venta");
                        vMovimientos.cbOperacion.addItem("Devolucion");
                    }else {
                        vMovimientos.cbOperacion.setEnabled(false);
                    }
            }else if (ie.getItemSelectable() == vMovimientos.cbOperacion && ie.getStateChange() == ItemEvent.SELECTED) {
                DecimalFormat id = new DecimalFormat("0000");
                if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Inventario inicial") || vMovimientos.cbOperacion.getSelectedItem().toString().equals("Compra")) {
                    vMovimientos.tfCodigo.setText("C" + id.format(movimientos.size()+1));
                }else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Venta")){
                    vMovimientos.tfCodigo.setText("V" + id.format(movimientos.size()+1));
                }else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")){
                    vMovimientos.tfCodigo.setEnabled(true);
                    vMovimientos.tfCodigo.setPlaceholder("Cod. Movimiento");
                    //vMovimientos.tfCantidad.setEnabled(false);
                    //vMovimientos.tfValorUnitario.setEnabled(false);
                }
            }
            
        }
    }
}
