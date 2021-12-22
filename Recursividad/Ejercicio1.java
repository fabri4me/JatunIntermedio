  
public class Ejercicio1
{
    public int cantDigitos(int numero){
        int res;
        if(numero==0){
            res=0;    
        }else{
            res=1+cantDigitos(numero/10);    
        }
        return res;
    }
}
