public class Primitivos {
    public static void main(String[] args) {
        // 1 byte = 8 bits
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: "+ Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: "+ Byte.MIN_VALUE);

        // 1 short = 16 bits
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: "+ Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: "+ Short.MIN_VALUE);

        // 1 integer = 32 bites
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: "+ Integer.MIN_VALUE);

        //La L indica el tipo Long
        //1 long = 64 bits
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: "+ Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: "+ Long.MIN_VALUE);

        var numeroVar = 2147483648L;



    }
}
