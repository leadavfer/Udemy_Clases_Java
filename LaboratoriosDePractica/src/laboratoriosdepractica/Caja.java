package laboratoriosdepractica;

public class Caja {

    int ancho;
    int alto;
    int profundidad;

    public Caja() {
        System.out.println("Este es el constructor sin argumentos.");
    }

    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public void formulaDeVolumen() {
        int volumen = ancho * alto * profundidad;
        System.out.println("volumen total es = " + volumen);

    }

}
