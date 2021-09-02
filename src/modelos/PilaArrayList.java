package modelos;

import java.util.ArrayList;

/**
 *
 * @author Julio
 * @param <T>
 */
public class PilaArrayList<T> {

    private ArrayList<T> pilita;

    public PilaArrayList() {
        pilita = new ArrayList();
    }

    public void push(T dato) { // [1,2,3,4] = [4,3,2,1]
        pilita.add(0, dato);
    }

    public T pop() {
        if (!pilita.isEmpty()) {
            return pilita.remove(0);
        }
        return (T) "La Pila esta vacia";
    }

    public boolean isEmpty() {
        return pilita.isEmpty();
    }
    public T peek(){
        return pilita.get(0);
    }
    public ArrayList<T> toArray(){
        return pilita;
    }
}
