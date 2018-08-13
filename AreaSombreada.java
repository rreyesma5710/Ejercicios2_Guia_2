
/**
 * Write a description of class AreaSombreada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class AreaSombreada
{
    // instance variables - replace the example below with your own
    private double radio;
    private double areaSombreada;
    /**
     * Constructor for objects of class AreaSombreada
     */
    public AreaSombreada(double radio)
    {
        this.radio=radio;
        areaSombreada=calcularAreaCirculo()-calcularAreaCuadrado();
        System.out.println("El area sombreada es: "+areaSombreada);
    }

    public double calcularAreaCuadrado(){
        return 4*Math.sqrt(2)*Math.sqrt(2)*radio;
    }
    
    public double calcularAreaCirculo(){
        return Math.PI*radio*radio;
    }
    public static void main(String[] args){
        AreaSombreada as=new AreaSombreada(7);
    }
}
