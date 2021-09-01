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
public class arregloProducto {
    private ArrayList<Productos>arrayProductos;
    
    public arregloProducto() {
        arrayProductos = new ArrayList<Productos>();
    }

    public void agregar(Productos p) {
        arrayProductos.add(p);
    }

    public Productos obtener(int pos) {
        return arrayProductos.get(pos);
    }

    public int ta() {
        return arrayProductos.size();
    }
}
