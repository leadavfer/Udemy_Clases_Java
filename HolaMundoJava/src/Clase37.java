
public class Clase37 {

    public static void main(String args[]) {
        var numero = 2;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1: 
                    numeroTexto = "Numero uno";
                break;
            case 2:
                    numeroTexto = "Numero dos";
                break;
            case 3: 
                    numeroTexto = "Numero tres";
                break;
            case 4:
                    numeroTexto = "Numero cuatro";
                break;
            default: 
                    numeroTexto = "Caso no encontrado";
                break;
        }
            System.out.println("numeroTexto = " + numeroTexto);
    }
}
