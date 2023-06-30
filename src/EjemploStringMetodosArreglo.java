import java.util.Locale;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {

            System.out.println(arreglo[i]);
            
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        
        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i = 0; i < l ; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo= "some_image.pdf";
        String[] archivoArr = archivo.split("\\.");
        int p = archivoArr.length;
        System.out.println("p = " + p);
        for (int i = 0; i < p ; i++) {
            System.out.println(archivoArr[i]);
        }
        System.out.println("Extension = " + archivoArr[p-1]);
    }
}
