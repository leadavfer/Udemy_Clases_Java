package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Duquesa";
        System.out.println("persona1 = " + persona1.nombre);
        cambioValor(persona1);
        System.out.println("persona1 cambio= " + persona1.nombre);
    }
    
    public static void cambioValor( Persona persona){
         persona.nombre = "Duki";
    }
}
