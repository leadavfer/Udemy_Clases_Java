package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Leandro", "Fernandez");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 = " + persona1.nombre);
        System.out.println("persona1 = " + persona1.apellido);
    }
}

//otra clase
class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); llamada al constructor de la clase Padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
    
}
