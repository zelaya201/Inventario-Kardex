/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Julio
 * @param <T>
 */
public class Pila<T> {

    private Nodo<T> pilita;

    public Pila() {
        pilita = null;
    }

    public void push(T d) {
        Nodo nuevo = new Nodo(d);
        nuevo.setSiguiente(pilita);
        pilita = nuevo;
    }

    public T pop() {
        T cima = null;
        if (!isEmpty()) {
            cima = pilita.getDato();
            pilita = pilita.getSiguiente();
        }
        return cima;
    }
    
    public T peek(){
        return pilita.getDato(); // Esto no lo tenia!!!!!!!!!
    }

    public boolean isEmpty() {
        return pilita == null;
    }
}
