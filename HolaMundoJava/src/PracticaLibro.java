
import java.util.Scanner;


public class PracticaLibro {
    public static void main(String args[]){
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el Titulo del libro");
        String titulo = teclado.nextLine();
        
        System.out.println("Por favor ingrese el nombre del Autor");
        String autor = teclado.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
        
    }
}
