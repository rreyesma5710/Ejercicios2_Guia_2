
/**
 * Write a description of class Conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversion
{
    // instance variables - replace the example below with your own
    private double valor;
    private char tipo;
    private double equivalencia;

    /**
     * 
     */
    public Conversion(double valor,char tipo)
    {
       this.valor=valor;
       this.tipo=tipo;
       
       if(tipo=='P'){
           equivalencia=valor/0.0833;
           System.out.println("La equivalencia de pies a pulgadas es "+equivalencia);
       }
       
       if(tipo=='C'){
           equivalencia=valor/2.54;
           System.out.println("La equivalencia de centimetros a pulgadas es "+equivalencia);
        }
        
        if(tipo=='L'){
           equivalencia=valor*190080.02;
           System.out.println("La equivalencia de legua a pulgadas es "+equivalencia);
        }
        
        if(tipo=='Y'){
           equivalencia=valor*36;
           System.out.println("La equivalencia de yarda a pulgadas es "+equivalencia);
        }
    }

    public double getValor(){
        return valor;
    }
    
    public double getEquivalencia(){
        return equivalencia;
    }
    
   
    
}
