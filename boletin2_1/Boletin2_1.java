
package boletin2_1;


public class Boletin2_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cal e a tarifa?");
        float ptarifa= sc.nextFloat();
        System.out.println("Cal e o prezo pagado?");
        float ppagado= sc.nextFloat();
        float pordescuento= (100-(ppagado*100)/ptarifa);
System.out.println("O porcentaxe e do"+pordescuento+"%");
        
        
        // TODO code application logic here
    }
    
}
