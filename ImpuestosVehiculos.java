import java.util.Scanner;

public class ImpuestosVehiculos
{
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        
        double precioBruto,impuesto;
        int opcion = 0;
        
        System.out.println("¿Que tipo de Auto Movil es:?");
        System.out.println("1. Vehiculo");
        System.out.println("2. Camioneta");
        opcion = Leer.nextInt();   
        
        System.out.println("Digita precio bruto del auto");
        precioBruto = Leer.nextDouble();  
        
        if(opcion == 2){
            if(precioBruto<80){
                impuesto = 0;
            }else{
                impuesto = precioBruto/2;
            }   
            
            System.out.println("*****************************");
            System.out.println("Impuesto a pagar->"+impuesto);
            System.out.println("Precio neto->"+(impuesto+precioBruto));        
            System.out.println("*****************************");                
        }else{
        
            if(opcion == 1){
                if(precioBruto<20){
                    impuesto = 5;
                }else{//
                    if(precioBruto>=20 && precioBruto<=40){
                        impuesto = precioBruto/5;
                    }else{
                        impuesto = 9;
                    }
                }
                
                System.out.println("*****************************");
                System.out.println("Impuesto a pagar->"+impuesto);
                System.out.println("Precio neto->"+(impuesto+precioBruto));        
                System.out.println("*****************************");            
            }else{
                System.out.println("Seleccione opcion valida");
            }              
        
        }
        
    }

    
}
