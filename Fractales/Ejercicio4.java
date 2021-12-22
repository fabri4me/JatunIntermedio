

public class Ejercicio4
{
    public int trianguloSierpinski( int nivel ){
        if(nivel==1){
            return 1;    
        }else{
            return triangulosSimples( nivel)+triangulosCompuestos( nivel); 
        }
        
    }
    private int triangulosSimples(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return 1 +3*triangulosSimples(nivel-1);    
        }
    }
    private int triangulosCompuestos(int nivel){
        if(nivel==1){
            return 0;
        }else{
            return 1 +3*triangulosCompuestos(nivel-1);    
        }
    }
}
