
public class Repeticion4
{
    public int triangulosSimples(int nivel){
        int res;
        if(nivel==1){
            res=1;    
        }else{
            res=1+3*triangulosSimples( nivel-1);        
        }
        return res;
    }
    public int triangulosCompuestos(int nivel){
        
        if(nivel==1){
            return 0;    
        }else{
            return 1+ 3*triangulosCompuestos(nivel-1);  
        }
    }
    public int numTotal( int nivel ){
        if(nivel==1){
            return 1;    
        }else{
            return  triangulosSimples(nivel)+triangulosCompuestos( nivel);   
        }
    }
}
