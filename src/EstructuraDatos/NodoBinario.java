package EstructuraDatos;

import Clases.Transaccion;

public class NodoBinario {
    private Object dato;
    private NodoBinario padre;
    private NodoBinario izquierdo;
    private NodoBinario derecho;

    public NodoBinario(int dato) {
        this.dato = dato;
        this.derecho=null;
        this.izquierdo=null;
        this.padre=null;
    }

    public Object getDato() {
        return dato;
    }

    public NodoBinario getPadre() {
        return padre;
    }

    public NodoBinario getIzquierdo() {
        return izquierdo;
    }

    public NodoBinario getDerecho() {
        return derecho;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setPadre(NodoBinario padre) {
        this.padre = padre;
    }

    public void setIzquierdo(NodoBinario izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(NodoBinario derecho) {
        this.derecho = derecho;
    }

}
