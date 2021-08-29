/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Julio
 */
public class Productos {
    private String codigoProducto;
    private double unidades;
    private String localizacion;
    private String categorias;
    private int cantMin;
    private String proveedor;
    private int cantMax;
    private String producto;
    private String referencia;

    public Productos() {
    }

    public Productos(String codigoProducto, double unidades, String localizacion, String categorias, int cantMin, String proveedor, int cantMax, String producto, String referencia) {
        this.codigoProducto = codigoProducto;
        this.unidades = unidades;
        this.localizacion = localizacion;
        this.categorias = categorias;
        this.cantMin = cantMin;
        this.proveedor = proveedor;
        this.cantMax = cantMax;
        this.producto = producto;
        this.referencia = referencia;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getUnidades() {
        return unidades;
    }

    public void setUnidades(double unidades) {
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

    public int getCantMin() {
        return cantMin;
    }

    public void setCantMin(int cantMin) {
        this.cantMin = cantMin;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
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
    
    
}
