
public class Ejercicio10
{
   public int transformacionABinario(int numero,int numDig){
        int res;
        if (numero==0){
            res=0;    
        }else{
            
            res=(numero%2)*(int)Math.pow(10, numDig-1)+transformacionABinario(numero/2,numDig-1);
            
        }
        
        return res;
    }
}
