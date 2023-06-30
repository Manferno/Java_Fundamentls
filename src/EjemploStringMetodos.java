import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String name = "Manuel";

        System.out.println("name.lenght() =" + name.length());
        System.out.println("name.toUpperCase(Locale.ROOT) = " + name.toUpperCase(Locale.ROOT));
        System.out.println("name.toLowerCase(Locale.ROOT) = " + name.toLowerCase(Locale.ROOT));
        System.out.println("name.equals(\"Manuel\") = " + name.equals("Manuel"));
        System.out.println("name.equals(\"manuel\") = " + name.equals("manuel"));
        System.out.println("name.equalsIgnoreCase(\"manuel\") = " + name.equalsIgnoreCase("manuel"));
        System.out.println("name.compareTo(\"Manuel\") = " + name.compareTo("Manuel"));
        System.out.println("name.compareTo(\"Andrew\") = " + name.compareTo("Andrew"));
        System.out.println("name.charAt(0) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
     
        
        
        
    }
}
