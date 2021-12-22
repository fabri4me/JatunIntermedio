
public class Ejercicio2
{
    public int factorial(int numero ){
        int res;
        if(numero==1){
            res=1;    
        }else{
            res=numero*factorial(numero-1);
        }
        return res;
    }
}
