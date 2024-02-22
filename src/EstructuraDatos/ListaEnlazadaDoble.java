package EstructuraDatos;

import Clases.Usuario;

public class ListaEnlazadaDoble {
    private NodoListaDoble inicio;
    private NodoListaDoble fin;

    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    // Método para insertar al inicio
    public void insertarInicio(NodoListaDoble nuevo) {
 
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            
            inicio = nuevo;
        }
    }
// Método para insertar al final

    public void insertarFinal(NodoListaDoble nuevo) {
        
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    //busqueda de un ussuario 
    public boolean  BuscarUsuario(String perfil, String password){
        
        NodoListaDoble temporal=inicio;
        while(temporal.getSiguiente()!=inicio){
            Usuario verif= (Usuario) temporal.getDato();
            if(verif.getPerfil().equals(perfil)&&verif.getPassword().equals(password)){
                return true;
            }
            temporal=temporal.getSiguiente();
        }
        return false;
        
    }
    
}
