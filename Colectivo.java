
/**
 * Write a description of class Colectivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Colectivo
{
    // instance variables - replace the example below with your own
    private int n;
    private int turistas;
    private double pagoTotalTuristas;
    private double pagoTotalEmpresa;
    private int viajes;

    /**
     * Constructor for objects of class Colectivo
     */
    public Colectivo(int n,int turistas)
    {
        this.n=n;
        this.turistas=turistas;
       calcularViajes();
       calcularCostos();
       imprimir();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void calcularViajes()
    {
        // put your code here
        viajes=turistas/n;
        if( turistas%n>0){
            viajes++;
        }
    }
    
    public void calcularCostos()
    {
        pagoTotalTuristas=10000*turistas;
        pagoTotalEmpresa=2000*turistas;
    }
    
    public void imprimir(){
        System.out.println("Viajes: "+viajes);
        System.out.println("Total a pagar por los turistas: "+pagoTotalTuristas);
        System.out.println("Total a pagar por el condutor: "+pagoTotalEmpresa);
    }
    
    public static void main(String[] args){
        Colectivo c=new Colectivo(10,35);
    }
    
    
}
