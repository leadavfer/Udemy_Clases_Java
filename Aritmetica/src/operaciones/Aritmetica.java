package operaciones;

public class Aritmetica {
    
    //Atributos de la Clase
    int a;
    int b;
    
    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    
    //Constructor con argumentos
    public Aritmetica(int a, int b){
    this.a = a;
    this.b = b;
        System.out.println("Ejecutando Constructor con Argumentos");
    }
    
    //Metodos
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int SumarConRetorno(){
        return this.a + this.b;
    }
    
    public int SumarConArgumentos(int a, int b){
    this.a = a; // El argumento a se le asigna a this.a
    this.b = b;
    
    return SumarConRetorno();
    }
}
