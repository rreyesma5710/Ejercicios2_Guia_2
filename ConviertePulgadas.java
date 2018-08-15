import java.util.Scanner;

public class ConviertePulgadas
{ 
    public static void main(String[] args) {
     
        Scanner Leer = new Scanner (System.in);
        
        double pies,centimetros,leguas,yardas, pulgadas, opcion;
        System.out.println("Este programa convierte de unidades de medida a pulgadas");
        System.out.println("¿Que desea convertir a pulgadas?");
        System.out.println("1) Pies");
        System.out.println("2) Centimetros");                
        System.out.println("3) Leguas");
        System.out.println("4) Yardas");
        opcion = Leer.nextInt();
        
        if(opcion == 1){
            System.out.println("¿cuantos Pies?");
            pies = Leer.nextDouble();        
            pulgadas = pies*12;
            System.out.println("La cantidad de Pulgadas es : "+pulgadas);
        }
        
        if(opcion == 2){
            System.out.println("¿cuantos Centimetros?");
            centimetros = Leer.nextDouble();
            pulgadas = centimetros*0.393701;
            System.out.println("La cantidad de Pulgadas es : "+pulgadas);
        }
        
        if(opcion == 3){
            System.out.println("¿cuantos Leguas?");
            leguas = Leer.nextDouble();
            pulgadas = leguas*190080;
            System.out.println("La cantidad de Pulgadas es : "+pulgadas);
        }        
        
        if(opcion == 4){
            System.out.println("¿cuantas Yardas?");
            yardas = Leer.nextDouble();        
            pulgadas = yardas*36;
            System.out.println("La cantidad de Pulgadas es : "+pulgadas);
        }        
        
    }
}
