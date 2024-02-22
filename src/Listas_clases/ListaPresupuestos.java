package Listas_clases;
import Clases.Presupuesto;
import java.util.ArrayList;


public class ListaPresupuestos {
    private static ArrayList<Presupuesto> datos = new ArrayList<>();
    

    public static ArrayList<Presupuesto> getDatos() {
        return datos;
    }

    public static void setDatos(ArrayList<Presupuesto> datos) {
        ListaPresupuestos.datos = datos;
    }
    
    public static void agregar(Presupuesto obj){
        datos.add(obj);
    }
    
    public static void eliminar(Presupuesto obj){
        datos.remove(obj);
    }
}