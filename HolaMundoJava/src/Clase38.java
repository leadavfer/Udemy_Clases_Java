
import java.util.Scanner;


public class Clase38 {

    public static void main(String args[]) {
            
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un mes del año:");
        var mes = Integer.parseInt(teclado.nextLine());
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                    estacion = "Es invierno";
                break;
            case 3: case 4: case 5:
                    estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                    estacion = "Verano";
                break;
            case 9: case 10: case 11:
                    estacion = "Otonio";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
