package EstructuraDatos;



public class ArbolBinario {
    private NodoBinario rais;
    
    public boolean isEmpty(){
        return rais==null;
    }

    public NodoBinario getRais() {
        return rais;
    }
    
    public boolean verificadorRais(NodoBinario nodo){
        return rais==nodo;
    }
    
    public boolean verificarNodoHoja(NodoBinario nodo){
        return nodo.getDerecho()==null || nodo.getIzquierdo()==null;
        
    }
    
    public boolean verificarNodoInterno(NodoBinario nodo){
        return nodo.getDerecho()!=null || nodo.getIzquierdo()!=null;
    }
    
    // da un nodo y agrega un dato a la derecha
    public void agregarDerecha(NodoBinario origen ,int dato){
        NodoBinario NuevoDato= new NodoBinario(dato);
        if(isEmpty()){
            rais=NuevoDato;
        }else{
           origen.setDerecho(NuevoDato);
           NuevoDato.setPadre(origen);
        }
    } 
    // da un nodo y agrega un dato a la izquierda
    public void agregarIzquierda(NodoBinario origen ,int dato){
        NodoBinario NuevoDato= new NodoBinario(dato);
        if(isEmpty()){
            rais=NuevoDato;
        }else{
           origen.setIzquierdo(NuevoDato);
           NuevoDato.setPadre(origen);
        }
    } 
    
    // muestra los datos de izquierda a derecha
    public void MostrarPreOrden(NodoBinario nodo){
      
        System.out.print(nodo.getDato()+" ");
        if(nodo.getIzquierdo()!=null){
            MostrarPreOrden(nodo.getIzquierdo());
        }
        if(nodo.getDerecho()!=null){
            MostrarPreOrden(nodo.getDerecho());
        }
    }
    
    //muesta el nodo izquierdo luego el padre y finalmente el derecho
    public void MostrarEnOrden(NodoBinario nodo){
        
        if(nodo.getIzquierdo()!=null){
            MostrarPreOrden(nodo.getIzquierdo());
        }
        System.out.print(nodo.getDato()+" ");
        if(nodo.getDerecho()!=null){
            MostrarPreOrden(nodo.getDerecho());
        }
    }
    //muestra de las hojas a la raiz
    public void MostrarPosOrden(NodoBinario nodo){
        
        if(nodo.getIzquierdo()!=null){
            MostrarPreOrden(nodo.getIzquierdo());
        }
        if(nodo.getDerecho()!=null){
            MostrarPreOrden(nodo.getDerecho());
        }
        System.out.print(nodo.getDato()+" ");
    }
   /* public void agregarAscendenteRecursivo(NodoBinario origen, int dato) {
        NodoBinario nuevoNodo = new NodoBinario(dato);
        if (rais == null) {
            rais = nuevoNodo;
        } else if (origen == null) {
            System.out.println("el origen es nulo");
        } else {
            if (origen.getCastMonto()<= nuevoNodo.getCastMonto()) {
                if (origen.getDerecho() != null) {
                    agregarAscendenteRecursivo(origen.getDerecho(), dato);
                } else {
                    nuevoNodo.setPadre(origen);
                    origen.setDerecho(nuevoNodo);
                }
            } else {
                if (origen.getIzquierdo()!= null) {
                    agregarAscendenteRecursivo(origen.getIzquierdo(), dato);
                } else {
                    nuevoNodo.setPadre(origen);
                    origen.setIzquierdo(nuevoNodo);
                }
            }

        }
    }*/
}
