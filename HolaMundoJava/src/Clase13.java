
import java.util.Scanner;


public class Clase13 {
    public static void main(String args[]){
        System.out.println("Escriba su nombre: ");
        Scanner consola = new Scanner(System.in);
        
        String usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe el titulo: ");
        String titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario );
        
    }
    
}
