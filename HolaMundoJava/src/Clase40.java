
public class Clase40 {

    public static void main(String args[]) {

//        var contador = 0;

//        while (contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 3);

          for (var contador = 0; contador < 3 ; contador++ ) {
             if (contador % 2 != 0) {
                continue; // ir a la siguiente iteracion
            }
              System.out.println("contador = " + contador);
        }


//        for (var contador = 0; contador < 3 ; contador++ ) {
//             if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//            
//        }
        
        
        
    }
}
