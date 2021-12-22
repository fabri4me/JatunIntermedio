

import java.util.LinkedList;
public class LinkedListt
{
    LinkedList<Integer> listaEnlazada;
    public LinkedListt()
    {
        listaEnlazada= new LinkedList<>();
    }
    public void agregar(int algo){
        listaEnlazada.add(algo);    
    }
    public Integer eliminar (int pos){
        return listaEnlazada.remove(pos);
    }
}
