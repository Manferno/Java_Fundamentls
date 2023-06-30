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
        
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains(\"j\") = " + trabalenguas.contains("j"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));

        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());
        
        
    }
}
