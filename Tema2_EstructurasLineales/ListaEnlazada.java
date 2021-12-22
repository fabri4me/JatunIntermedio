
public class ListaEnlazada<T>// dato t
{
    private Nodo<T> ini;//es el mismo dato
    private int size;
    public ListaEnlazada()
    {
        ini = new Nodo <>();
        size=0;
    }
    public void add(T valor){
        if(isEmpty()){
            ini.setDato(valor);
        }else{
            Nodo aux= ini;    //ambas variables estan señalando al mismo objeto no coopia
            while(!aux.isEmpty()){
                aux=aux.getSig();    
            }
            aux.setDato(valor);
        }
        size++;
    }
    public void addRec(T valor){
        addRec(valor,ini); 
        size++;
    }
    private void addRec(T valor,Nodo <T>actual){
        if(actual.isEmpty()){
            actual.setDato(valor);        
        }else{
            Nodo sig = actual.getSig();
            addRec(valor,sig);
        }
    }
    public T remove (int index){
        T res=null;
        if(index<size &&index>=0){
            if(index == 0){
                res=ini.getDato();
                ini = ini.getSig();    
            }else{
                Nodo<T> ant = null;
                Nodo<T> act = ini;
                while(index !=0){
                    index--;
                    ant=act;
                    act= act.getSig();
                }
                res= act.getDato();
                
                ant.setSig(act.getSig());
            }
            size--;
        }
        return res; 
    }
    
    public boolean isEmpty(){
        return ini.isEmpty();    
    }
    public int size(){
        return size;        
    }
}
