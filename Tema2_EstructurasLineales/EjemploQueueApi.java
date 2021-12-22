import java.util.Queue;//Queue es una interface, no puedo crear objetos de interfaces
import java.util.PriorityQueue;
import java.util.Stack;//es una clase 
public class EjemploQueueApi
{
    Queue<Integer> cola;//parametrico, estructuras guardan cualquier tipo de dato
    Stack<Integer> pila;
    public EjemploQueueApi(){
        //linked subclase de Queue
        cola= new PriorityQueue<>();//esta clase concreta implementa interface queue
        pila =new Stack<>();
    }
    public void agregarDato(Integer dato){
        cola.offer(dato);
        //
    }
    public void agregarDatoPila(Integer dato){
        pila.push(dato);
        //
    }
}
