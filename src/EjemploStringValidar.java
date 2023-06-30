import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean isNull = curso == null;
        System.out.println("isNull = " + isNull);

        if(isNull){
            curso = "Programación Java";
        }
        boolean isVoid = curso.length() == 0;
        System.out.println("isVoid = " + isVoid);

        boolean isVoid2 = curso.isEmpty();
        System.out.println("isVoid2 = " + isVoid2);

        //Desde JDK 11 >
        boolean isBlank = curso.isBlank();
        System.out.println("isBlank = " + isBlank);

        if (!isVoid2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


    }
}
