package practicas;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
//  Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
//        var num1 = 10;
//        var num2 = 2;
//        
//        System.out.println("Suma: " + (num1 + num2));
//        System.out.println("Resta: " + (num1 - num2));
//        System.out.println("Multiplicación: " + (num1 * num2));
//        System.out.println("Division: " + (num1 / num2));
//        System.out.println("Modulo: " + (num1 % num2));

//  Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
//        var num1 = 10;
//        var num2 = 10;
//        
//        if(num1 > num2){
//            System.out.println("El Numero " + num1 + " es mayor que " + num2);
//        }else if(num2 > num1){
//            System.out.println("El Numero " + num2 + " es mayor que " + num1);
//        }else{
//            System.out.println("Los valores son iguales");
//        }
//  Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
//          String nombre = "Leandro";
//          System.out.println("Bienvenido Leandro");
//  Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
        Scanner teclado = new Scanner(System.in);
//            
//            System.out.println("Introduzca su nombre:");
//            var nombre = teclado.nextLine();
//            
//            System.out.println("Bienvenido " + nombre);

//  Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
//              System.out.println("Introduzca el Radio del circulo: ");
//               var radio = Double.parseDouble(teclado.nextLine());
//               var resultado = PI * Math.pow(radio, 2);
//              System.out.println("resultado = " + resultado);
//  Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
//        System.out.println("Ingrese un numero: ");
//        var numero = Integer.parseInt(teclado.nextLine());
//
//        if (numero % 2 == 0) {
//            System.out.println("El numero ingresado es divisible por 2");
//        } else {
//            System.out.println("El numero ingresado NO es divisible por 2");
//        }
//  Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%
//        System.out.println("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(teclado.nextLine());
//        double iva = 0.21;
//        double resultado = precio + (precio * iva);
//        
//        System.out.println("El precio con IVA es de: " + resultado);
//  Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
//                var numero = 1;
//                    
//                while( numero <= 100){
//                    System.out.println("numero = " + numero);
//                    numero++;
//                }
//   Haz el mismo ejercicio anterior con un bucle for.
//        for (int numero = 1; numero <= 100; numero++) {
//                System.out.println("numero = " + numero);
//        }
//  Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
//    
//        for (int numero = 1; numero <= 100; numero++) {
//            if (numero % 2 == 0 && numero % 3 == 0) {
//                System.out.println("numero = " + numero);
//            }
//        }
//  13  
//        System.out.println("Introduzca numero de ventas: ");
//        var ventas = Integer.parseInt(teclado.nextLine());
//        var resultado = 0;
//        
//        for (int i = 1; i < ventas; i++) {
//            System.out.println("Ingrese la venta numero " + i);
//            var num = Integer.parseInt(teclado.nextLine());
//            resultado = resultado +num;
//        }
//            System.out.println("resultado = " + resultado);
//  15  
//        int num;
//        do {
//            System.out.println("Ingrese un numero:");
//            num = Integer.parseInt(teclado.nextLine());
//
//        } while (num >= 0);
//
//        System.out.println("num = " + num);
//16
//        String contrasenia = "123";
//        String contraseniaEsc;
//        
//        for (int intentos = 1; intentos <= 3 ; intentos++) {
//            System.out.println("Introduzca la contraseña: ");
//            contraseniaEsc= teclado.nextLine();
//            if (contraseniaEsc.equals(contrasenia)) {
//                System.out.println("Enhorabuena");
//                break;
//            }else{
//                
//            }
//        }
//17
//        System.out.println("Ingrese un dia de la semana:");
//        String dia = teclado.nextLine();
//
//        switch(dia){
//            case "Lunes": case "lunes":
//                    System.out.println("Dia Laboral");
//                break;
//            case "Martes": case "martes":
//                    System.out.println("Dia Laboral");
//                break;
//            case "Miercoles": case "miercoles":
//                    System.out.println("Dia Laboral");
//                break;
//            case "Jueves": case "jueves":
//                    System.out.println("Dia Laboral");
//                break;
//            case "Viernes": case "viernes":
//                    System.out.println("Dia Laboral");
//                break;
//            case "Sabado": case "sabado":
//                    System.out.println("Dia NO Laboral");
//                break;
//            case "Domingo": case "domingo":
//                    System.out.println("Dia NO Laboral");
//                break;
//            default:
//                System.out.println("Cualquier pusiste papu");
//                break;
//        }
//18
//        System.out.println("Ingrese un primer numero:");
//        var num1 = Integer.parseInt(teclado.nextLine());
//        System.out.println("Ingrese un segundo numero:");
//        var num2 = Integer.parseInt(teclado.nextLine());
//        var rango = num2 - num1 + 1;
//        var contador = 1;
//
//        while (contador <= 10) {
//            int numRandom = (int) (Math.random() * rango);
//            System.out.println("numRandom = " + numRandom);
//            contador++;
//        }
//19
//            System.out.println("Ingrese un numero entero positivo:");
//            String num = teclado.nextLine();
//            int contador = 0;
//
//            for (int i = 1; i <= num.length(); i++) {
//                System.out.println("i = " + i);
//                contador++;
//        }
//            System.out.println("El numero "+num+" tiene "+contador+" cifras");
//        int num = 0;
//        do {
//            System.out.println("Introduce un numero:");
//            num = teclado.nextInt();
//        } while (num < 0);
//        int contador = 0;
//        for (int i = num; i > 0; i /= 10) {
//            contador++;
//        }
//        if (contador == 1) {
//            System.out.println("El numero " + num + " tiene " + contador + " cifra");
//        } else {
//            System.out.println("El numero " + num + " tiene " + contador + " cifras");
//        }
//20
//        int num = 0;
//        do {
//            System.out.println("Ingrese un numero primo:");
//            num = teclado.nextInt();
//        } while (num <= 1);
//        
//        int raiz =(int) Math.sqrt(num);
//        int contador = 0;
//        
//        System.out.println("raiz = " + raiz);
//        
//        for (int i = raiz; i > 1; i--) {
//            if (num % i == 0) {
//                contador++;
//            }
//        }
//        
//        if (contador < 1) {
//            System.out.println("El numero "+num+" es primo.");
//        }else{
//            System.out.println("El numero no es primo");
//        }
//21
//        for (int i = 1; i <= 100; i++) {
//
//            int raiz = (int) Math.sqrt(i);
//            int contador = 0;
//
//            for (int j = raiz; j > 1; j--) {
//                if (i % j == 0) {
//                    contador++;
//                }
//            }
//            if (contador < 1) {
//                System.out.println(i);
//            }
//        }
//22
//        String frase = "La lluvia en Sevilla es una maravilla";
//        int contador = 0;
//        for (int i = 0; i < frase.length(); i++) {
//            if (frase.charAt(i) == 'a'
//                    || frase.charAt(i) == 'e'
//                    || frase.charAt(i) == 'i'
//                    || frase.charAt(i) == 'o'
//                    || frase.charAt(i) == 'u') {
//                contador++;
//
//            }
//
//        }
//        System.out.println("vocales = " + contador);
//23
        
    }

}
