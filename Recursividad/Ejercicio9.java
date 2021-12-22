
public class Ejercicio9
{
    public int recNumeroInverso(int numero){
        int res;
        int cantDig=contarDigitos(numero);   
        res=recNumeroInverso(numero,cantDig);
        return res;
    }
    private int contarDigitos(int numero){
        int res;
        if(numero==0){
            res=0;    
        }else{
            res=1+contarDigitos(numero/10);    
        }
        return res;
    }
    private int recNumeroInverso(int numero,int numDig){
        int res;
        if (numero<10){
            return numero;    
        }else{
            
            res=(numero%10)*(int)Math.pow(10, numDig-1)+recNumeroInverso(numero/10,numDig-1);
            
        }
        
        return res;
    }
    
   
}
