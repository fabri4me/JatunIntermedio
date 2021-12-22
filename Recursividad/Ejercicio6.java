

public class Ejercicio6
{
   public int division(int divisor,int dividendo){
       int cont=0;
       while(divisor>=dividendo){
           divisor=divisor-dividendo;
           cont++;
       }
       return cont;
   }
   public int divisionRec(int divisor,int dividendo){
       int res;
       if(divisor<dividendo){
           res=0;        
       }else{
           res=1+divisionRec(divisor-dividendo,dividendo);    
       }
       return res;
   }
}
