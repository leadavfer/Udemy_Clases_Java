
public class Clase15 {
    public static void main(String args[]){
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = (byte)129;
        System.out.println("valor byte:" + numeroByte);
        System.out.println("valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo byte:" + Byte.MAX_VALUE);
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numero minimo Short = " + Short.MIN_VALUE);
        System.out.println("numero maximo Short = " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numero minimo int = " + Integer.MIN_VALUE);
        System.out.println("numero maximo int = " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numero minimo Long = " + Long.MIN_VALUE);
        System.out.println("numero maximo long = " + Long.MAX_VALUE);
        
    }
}

