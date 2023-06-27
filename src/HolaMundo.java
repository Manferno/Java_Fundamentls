import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        String nombre = "Manuel Roberth Cruces Bascuñán";

        System.out.println("nombre = " + nombre.toUpperCase(Locale.ROOT));


        boolean valor = true;
        int numero = 10;
        int numero2= 3;
        if (valor){
            System.out.println("Número= " + numero );
            numero2=10;
        }
        System.out.println("Número 2= "+ numero2);
        var numero3 = "14";

        String name;
        name = "James";
        if (numero>2){
            name = "Peter";
            System.out.println(name);
        }

        // int edadPersona = 5; comentario señores
        /*
        Comentario más largo
         */


    }
}
