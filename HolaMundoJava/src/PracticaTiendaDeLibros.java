
import java.util.Scanner;


public class PracticaTiendaDeLibros {

    public static void main(String args[]){
    
        /*
        nombre string
        id int
        precio double
        envioGratuito boolean
        */
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporcione el nombre:");
        String nombre = consola.nextLine();
        System.out.println("Proporcione un ID:");
        int id= Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el Precio:");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Envio Gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #" + id + "\n"+ "Precio: $" + precio + "\n" + "Envio Gratuito: " + envioGratuito);
    }
}
