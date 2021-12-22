

public class Ejercicio7
{
    public int numeroEstrellas(int nivel){
        if(nivel==1){
            return 1;    
        }else{
            return 1+5*(numeroEstrellas(nivel-1)+(int)Math.pow(5, nivel-2));    
        }
    }
}
