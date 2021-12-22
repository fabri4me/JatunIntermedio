
public class Ejercicio6
{
    public int numeroRamas(int nivel){
        if(nivel==1){
            return 1;    
        }else{
            return numeroRamas(nivel-1)+(int)Math.pow(2, nivel-1);    
        }
    }
    
}
