public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo= "some_image.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(10) = " + archivo.substring(i+1));
        
    }
}
