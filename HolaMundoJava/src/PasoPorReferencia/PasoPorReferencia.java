package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        Persona persona1 = null;
//        persona1.nombre = "Duquesa";
//        System.out.println("persona1 = " + persona1.nombre);
        persona1 = cambioValor(persona1);
        //System.out.println("persona1 cambio= " + persona1.nombre);
    }
    
    public static Persona cambioValor( Persona persona){
         if (persona == null) {
             System.out.println("Valor de Persona Invalido : null");
             return null;
        }
         persona.nombre = "Duki";
         return persona;
    }
}
