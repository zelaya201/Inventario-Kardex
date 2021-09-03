package controlador;

import java.awt.event.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import modelos.Movimiento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Pila;
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
        productos.add(new Productos("001", "Fragancias", "AVON", "Makuin Fragrance", "Gramos", "12", "30", "F-2", "Estante 2"));
        productos.add(new Productos("002", "Cosmeticos", "AVON", "Makako", "Gramos", "10", "40", "C-3", "Estante 3"));
        productos.add(new Productos("003", "Muebles", "Maderas SA de CV", "Silla x", "Kilogramos", "16", "39", "M-2", "Almacen 2"));
        productos.add(new Productos("004", "Collar 5U", "ORO main", "Quilates", "Gramos", "5", "25", "J-6", "Vitrina 6"));
        productos.add(new Productos("005", "Fragancias", "ABARELA", "Fragrance W", "Gramos", "10", "30", "F-2", "Estante 9"));
    }

    public void mostrarModulos(String modulo){
        if(modulo.equals("mInicio")){
            vHome = new Home();
            new CambiaPanel(vMenu.body, vHome);
        }else if(modulo.equals("mKardex")){
            vKardex = new VistaKardex();
            vKardex.setControlador(this);
            on = "Kardex";
            new CambiaPanel(vMenu.body, vKardex);
        }else if(modulo.equals("mMovimientos")) {
            vMovimientos = new VistaMovimiento();
            vMovimientos.setControlador(this);
            on = "Movimientos";
            vMovimientos.cbOperacion.setEnabled(false);
            vMovimientos.tfCodigo.setEnabled(false);
            new CambiaPanel(vMenu.body, vMovimientos);
            mostrarDatos(vMovimientos.tbMovimiento);
        }else if(modulo.equals("mProductos")){
            vProductos = new VistaProducto();
            vProductos.setControlador(this);
            vProductos.iniciar();
            on = "productoActivo";
            new CambiaPanel(vMenu.body, vProductos);
            mostrarTabla(vProductos.tbProductos);
        }
    }
    
    public void mostrarDatos(JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        
        /* PRODUCTOS */
        if (on.equals("Movimientos")) {
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat formateador = new DecimalFormat("0.00",simbolos);
            
            for (Movimiento x: movimientos) {
                modelo.addRow(new Object[]{x.getCodigo(), x.getFecha(), x.getTipoMovimiento() + ": " + x.getOperacion(), x.getProducto().getProducto(), "$ " + formateador.format(x.getvUnitario()), x.getCantidad(), "$ " + formateador.format(x.getvTotal())});
            }
            
            if(modelo.getRowCount() < 1){
                modelo.addRow(new Object[]{"", "", "Ningún resultado encontrado"});
            }
                
            tabla.setModel(modelo);
        }
    }
    
    public void mostrarBusqueda(int i){
        if(on.equals("Kardex")){
            vKardex.btnExportPDF.setEnabled(true);
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

    public void mostrarBusqueda (ArrayList lista, JTable tabla) {
        modelo = (DefaultTableModel)tabla.getModel();
        
        /* MOVIMIENTOS */
        if (on.equals("Movimientos")) {
            for (Object obj : lista) {
                Productos x = (Productos) obj;
                modelo.addRow(new Object[]{x.getCodigoProducto(), x.getProducto()});
            }
            tabla.setModel(modelo);
        }
    }
    
    public void eventosBotones(ActionEvent e){
        if (on.equals("Movimientos") && e.getActionCommand().equals("guardarMovimiento")) {
            if (productoSelected != null && vMovimientos.dcFecha.getDatoFecha() != null && vMovimientos.cbTipo.getSelectedIndex() > 0
                    && vMovimientos.cbOperacion.getSelectedIndex() > 0 && !vMovimientos.tfValorUnitario.getText().isEmpty() 
                    && !vMovimientos.tfCantidad.getText().isEmpty() && !vMovimientos.lbProducto.getText().isEmpty()) {
                
                double valor = Double.parseDouble(vMovimientos.tfValorUnitario.getText()) * Integer.parseInt(vMovimientos.tfCantidad.getText());
                
                DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);               
                
                Movimiento movimiento = new Movimiento(vMovimientos.tfCodigo.getText(), df.format(vMovimientos.dcFecha.getDatoFecha()), 
                        vMovimientos.cbTipo.getSelectedItem().toString(), vMovimientos.cbOperacion.getSelectedItem().toString(), productoSelected,
                        Double.parseDouble(vMovimientos.tfValorUnitario.getText()), Integer.parseInt(vMovimientos.tfCantidad.getText()),
                        valor);
                
                Pila existencias = new Pila();
                
                if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Entrada") || vMovimientos.cbTipo.getSelectedItem().toString().equals("Salida") && !vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")) {
                    if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Compra") || vMovimientos.cbOperacion.getSelectedItem().toString().equals("Inventario inicial")) {
                        existencias.push(movimiento);
                        productoSelected.setExistencias(existencias);
                        productoSelected.setMovimientos(movimientos);
                    }else if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Salida")) {
                        movimientoSelected = (Movimiento)productoSelected.getExistencias().pop();

                        movimientoSelected.setCantidad(movimientoSelected.getCantidad() - movimiento.getCantidad());
                        movimientoSelected.setvTotal(movimiento.getCantidad() * movimiento.getvUnitario());
                    }
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
                
                movimientos.add(movimiento);
                productoSelected = null;
                // AQUI VA LA ALERTA DE AGREGADO
                mostrarDatos(vMovimientos.tbMovimiento);
                limpiarCampos();
            }
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
        }else if(ae.getActionCommand().equals("Movimientos")) {
            mostrarModulos("mMovimientos");
        }else if(ae.getActionCommand().equals("guardarMovimiento")){
            eventosBotones(ae);
        }
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        
        if(on.equals("Kardex")){
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCodigoProducto().contains(vKardex.tfBusqueda.getText() + ke.getKeyChar()) || 
                        productos.get(i).getProducto().contains(vKardex.tfBusqueda.getText() + ke.getKeyChar())) {
                    mostrarBusqueda(i);
                    break;
                } else {
                    limpiar();
                }
            }
        }

        if (on.equals("Movimientos")) {
            ArrayList<Productos> lista = new ArrayList();
            
            if (!vMovimientos.tfCodigo.isEnabled()) {
                for (Productos x: productos) {
                    if (x.getProducto().contains((vMovimientos.tfBusqueda.getText() + ke.getKeyChar())) ||
                            x.getCodigoProducto().contains((vMovimientos.tfBusqueda.getText() + ke.getKeyChar())) ||x.getProducto().contains((vMovimientos.tfBusqueda.getText()))) {
                        lista.add(x);
                    }else {
                        limpiar();
                    }
                }          
                mostrarBusqueda(lista, vMovimientos.tbProductos);
            }else if (vMovimientos.tfCodigo.isEnabled() && vMovimientos.cbOperacion.getSelectedItem().toString().equals("Devolucion")){
                Movimiento mov = null;
                for (Movimiento x: movimientos) {
                    if (x.getCodigo().equals(vMovimientos.tfCodigo.getText() + ke.getKeyChar())) {
                        mov = x;
                    }else {
                        break;
                    }
                }
                
                vMovimientos.tfValorUnitario.setText(String.valueOf(mov.getvUnitario()));
                vMovimientos.tfValorUnitario.setEnabled(true);
            }
             
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(on.equals("Movimientos") && me.getSource() == vMovimientos.tbProductos){
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
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
  
    }

    @Override
    public void mouseExited(MouseEvent me) {
      
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
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
        //Productos p = new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local);
//            pilita.push(new Productos(codigo, categ, prove, produ, unidad, cantMin, cantMax, ref, local));
        //productos.add(p);
        if (on.equals("productoActivo")) {
//            PARA PRUEBAS
            
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
//                System.out.println(productos.get(i).getExistencias().toArray().toString());
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
        
        if(on.equals("productoActivo")){
            this.vProductos.codProducto.setText("");
            this.vProductos.categoriaProd.setText("");
            this.vProductos.proveedor.setText("");
            this.vProductos.productos.setText("");
            this.vProductos.CantMin.setText("");
            this.vProductos.CantMax.setText("");
            this.vProductos.referencias.setText("");
            this.vProductos.txtLocalizacion.setText("");
            vProductos.enabledbt();
        }else if(on.equals("Kardex")){
            vKardex.btnExportPDF.setEnabled(false);
            vKardex.lbArticulo.setText("-");
            vKardex.lbCantMax.setText("-");
            vKardex.lbReferencia.setText("-");
            vKardex.lbCantMin.setText("");
            vKardex.lbUbicacion.setText("-");
            vKardex.lbUnidad.setText("-");
            vKardex.lbProveedor.setText("-");
        }else if (on.equals("Movimientos")) {
            modelo = (DefaultTableModel) vMovimientos.tbProductos.getModel();
            modelo.setRowCount(0);
            vMovimientos.tbProductos.setModel(modelo);
        }
        
    }
    
    public void limpiarCampos(){
        modelo = (DefaultTableModel) vMovimientos.tbProductos.getModel();
        modelo.setRowCount(0);
        vMovimientos.tbProductos.setModel(modelo);
        
        vMovimientos.tfCodigo.setText("");
        vMovimientos.dcFecha.setDatoFecha(null);
        vMovimientos.cbTipo.setSelectedIndex(0);
        vMovimientos.cbOperacion.setSelectedIndex(0);
        vMovimientos.lbProducto.setText("");
        vMovimientos.tfValorUnitario.setText("");
        vMovimientos.tfCantidad.setText("");
        vMovimientos.lbProducto.setText("");
        vMovimientos.tfBusqueda.setText("");
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (on.equals("Movimientos")) {
            if (ie.getItemSelectable() == vMovimientos.cbTipo && ie.getStateChange() == ItemEvent.SELECTED) {
                vMovimientos.cbOperacion.setEnabled(true);
                vMovimientos.cbOperacion.removeAllItems();
                vMovimientos.cbOperacion.addItem("Seleccione");

                Boolean isSet = false;

                if (productoSelected != null) {
                    for (Movimiento x: movimientos) {
                        if (productoSelected.getCodigoProducto().equals(x.getProducto().getCodigoProducto())){
                            if (x.getOperacion().equals("Inventario inicial") && x.getCantidad() > 0) {
                                isSet = true;
                            }
                        }
                    }

                    if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Entrada")) {
                        if (!isSet) {
                            vMovimientos.cbOperacion.addItem("Inventario inicial");
                        }else {
                            vMovimientos.cbOperacion.addItem("Compra");
                            vMovimientos.cbOperacion.addItem("Devolucion");
                        }
                    }else if (vMovimientos.cbTipo.getSelectedItem().toString().equals("Salida")){
                        vMovimientos.cbOperacion.addItem("Venta");
                        vMovimientos.cbOperacion.addItem("Devolucion");
                    }else {
                        vMovimientos.cbOperacion.setEnabled(false);
                    }
                }
            }else if (ie.getItemSelectable() == vMovimientos.cbOperacion && ie.getStateChange() == ItemEvent.SELECTED) {
                DecimalFormat id = new DecimalFormat("0000");
                if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Inventario inicial") || vMovimientos.cbOperacion.getSelectedItem().toString().equals("Compra")) {
                    vMovimientos.tfCodigo.setEnabled(false);
                    vMovimientos.tfCodigo.setText("C" + id.format(movimientos.size()+1));
                }else if (vMovimientos.cbOperacion.getSelectedItem().toString().equals("Venta")){
                    vMovimientos.tfCodigo.setEnabled(false);
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

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
