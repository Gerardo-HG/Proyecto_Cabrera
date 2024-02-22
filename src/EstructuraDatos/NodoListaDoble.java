package EstructuraDatos;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Object getDato() {
        return dato;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }
    
    
}
