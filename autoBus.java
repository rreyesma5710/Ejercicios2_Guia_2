import java.util.Scanner;

public class autoBus
{
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        
        double cupoTotal,nTuristas,pagoConductor,pagoTurista, nViajes;
        
        System.out.println("Este programa calcula viajes a realizar y dinero que pagan tanto los turistas como el conductor");
        
        System.out.println("¿Cuantos turistas caben en el bus?");
        cupoTotal = Leer.nextDouble();
        System.out.println("¿Cuantos turistas seran transportados?");
        nTuristas = Leer.nextDouble();
        
        pagoConductor = 2000;
        pagoTurista = 10000;
        
        //calcular numero de viajes
        
        nViajes = nTuristas/cupoTotal;
        
        if(nViajes <=1){
            System.out.println("Numero de viajes->1");
            System.out.println("El conductor paga->"+pagoConductor);
            System.out.println("Pago total de turistas->"+(nTuristas*pagoTurista));
        }else{
            if(nViajes / (int)nViajes != 1){
                System.out.println("Numero de viajes->"+((int)nViajes+1));
                System.out.println("El conductor paga->"+((int)nViajes+1)*pagoConductor);
                System.out.println("Pago total de turistas->"+(nTuristas*pagoTurista));
            }else{
                System.out.println("Numero de viajes->"+(int)nViajes);
                System.out.println("El conductor paga->"+((int)nViajes)*pagoConductor);
                System.out.println("Pago total de turistas->"+(nTuristas*pagoTurista));
            }
        }
        
        
        
    }
}
