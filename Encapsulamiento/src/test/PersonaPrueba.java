package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Leaxs", 5000.00, false);
//        System.out.println("persona1 sin cambio = " + persona1.getNombre());
        System.out.println("persona1: " + persona1);
        persona1.setNombre("Leandro David");
        //persona1.nombre= "Leandro David" no se puede usar
        //System.out.println("nombre: " + persona1.nombre); no se puede usar
//        System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado?: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
    }
}
