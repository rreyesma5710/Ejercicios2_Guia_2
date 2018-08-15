import java.util.Scanner;

public class CuadradoInscrito
{
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        double r,areaCom, areaTriang, areaCuad, areaSombreada;
        
        System.out.println("Digita radio del cuadrado inscrito");
        r = Leer.nextDouble();
                
        //Primero sacamos el area del circulo completo
        
        areaCom = 3.1415*(r*r);

        //Ahora sacamos el area del triangulo basico en el cuadrado inscrito
        
        areaTriang = (r*r)/2;

        //calcular el area del cuadrado completo
        
        areaCuad = areaTriang*4;
        
        //area sombreada
        
        areaSombreada = areaCom - areaCuad;

        System.out.println("*****************************");
        System.out.println("Area sombreada final->"+areaSombreada);
        System.out.println("*****************************");
        
        
        
        
    }        
}
