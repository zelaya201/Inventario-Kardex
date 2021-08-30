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
    private String categorias;
    private String proveedor;
    private String producto;
    private String unidades;
    private int cantMin;
    private int cantMax;
    private String referencia;
    private String localizacion;
    
    public Productos() {
    }

    public Productos(String codigoProducto, String categorias, String proveedor, String producto, String unidades, int cantMin, int cantMax, String referencia, String localizacion) {
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
