
public class Ejercicio5
{
    public int cruzViseck(int nivel){
        if(nivel==1){
            return 4;    
        }else{
            return 5*cruzViseck( nivel-1)-8;
        }
    }
}
