
/**
 * Write a description of class Impuesto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Impuesto
{
    // instance variables - replace the example below with your own
    private double precioBruto;
    private double impuesto;
    private double total;
    private char tipo;
    /**
     * Constructor for objects of class Impuesto
     */
    public Impuesto(double precioBruto,char tipo)
    {
        this.precioBruto=precioBruto;
        this.tipo=tipo;
        if(tipo=='C'){
            impuesto=calcularImpuestoCamioneta();
        }else{
            impuesto=calcularImpuestoAutomovil();
        }
        total=precioBruto+impuesto;
        imprimir();
        
    }

    
    public double calcularImpuestoCamioneta()
    {
        double valor=0;
        if(precioBruto<80){
            valor=0;
        }else{
            valor=precioBruto/2;
        }
        return valor;
    }
    
    public double calcularImpuestoAutomovil()
    {
        double valor=0;
        if(precioBruto<20){
            valor=5;
        }else if(precioBruto<=40)
        {
            valor=precioBruto/5;
        }
        else{
            valor=9;
        }
        return valor;
    }
    
     public void imprimir(){
         System.out.println("Tipo: "+tipo);
        System.out.println("Precio Bruto: "+precioBruto);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+total);
    }
    
    public static void main(String[] args){
        Impuesto c=new Impuesto(90,'C');        
        Impuesto i=new Impuesto(60,'A');
    }
}
