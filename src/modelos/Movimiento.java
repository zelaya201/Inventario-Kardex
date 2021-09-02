
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author Mario Zelaya
 */
public class Movimiento {
    private String codigo;
    private String fecha;
    private String tipoMovimiento;
    private String operacion;
    private Productos producto;
    private double vUnitario;
    private int cantidad;
    private double vTotal;

    public Movimiento() {
    }

    public Movimiento(String codigo, String fecha, String tipoMovimiento, String operacion, Productos producto, double vUnitario, int cantidad, double vTotal) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.operacion = operacion;
        this.producto = producto;
        this.vUnitario = vUnitario;
        this.cantidad = cantidad;
        this.vTotal = vTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getvTotal() {
        return vTotal;
    }

    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }
    
    
}
