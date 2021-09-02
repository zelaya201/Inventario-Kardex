/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public class Productos {

    private String codigoProducto;
    private String categorias;
    private String proveedor;
    private String producto; //Nombre del Producto?
    private String unidades;
    private String cantMin;
    private String cantMax;
    private String referencia;
    private String localizacion;
    private ArrayList<Movimiento> movimientos;
    private Pila existencias;
    
    public Productos() {
    }

    public Productos(String codigoProducto, String categorias, String proveedor, String producto, String unidades, String cantMin, String cantMax, String referencia, String localizacion) {
        this.codigoProducto = codigoProducto;
        this.categorias = categorias;
        this.proveedor = proveedor;
        this.producto = producto;
        this.unidades = unidades;
        this.cantMin = cantMin;
        this.cantMax = cantMax;
        this.referencia = referencia;
        this.localizacion = localizacion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getCantMin() {
        return cantMin;
    }

    public void setCantMin(String cantMin) {
        this.cantMin = cantMin;
    }

    public String getCantMax() {
        return cantMax;
    }

    public void setCantMax(String cantMax) {
        this.cantMax = cantMax;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    } 

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Pila getExistencias() {
        return existencias;
    }

    public void setExistencias(Pila existencias) {
        this.existencias = existencias;
    }

}
