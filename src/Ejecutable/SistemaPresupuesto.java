
package Ejecutable;

import Clases.Usuario;
import EstructuraDatos.ListaEnlazadaDoble;
import EstructuraDatos.NodoListaDoble;

public class SistemaPresupuesto {

    public static void main(String[] args) {
        ListaEnlazadaDoble lista=new ListaEnlazadaDoble();
        Usuario prueba=new Usuario("prueba", "12345");
        NodoListaDoble nuevoNodo= new NodoListaDoble(prueba);
        lista.insertarInicio(nuevoNodo
        );
        
    }
    
    
    
}
