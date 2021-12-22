public class Nodo <T>//clase genera datos genericos
{
    private T  dato;
    private Nodo<T> sig;
    public Nodo(){
        dato=null; 
        sig = null;
    }//genrics datos genericos
    public void setDato(T valor){
        dato = valor;
        sig = new Nodo<>();
    }
    public void setSig(Nodo<T> nodo){
        sig = nodo;
        
    }
    public T getDato(){
        return dato;    
    }
    public Nodo<T> getSig(){
        return sig;    
    }
    public boolean isEmpty(){
        return dato== null && sig==null;    
    }
}
