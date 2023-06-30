import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 3 nombres");
        System.out.println("Nombre 1");
        String nombre1 = scan.nextLine();
        System.out.println("Nombre 2");
        String nombre2 = scan.nextLine();
        System.out.println("Nombre 3");
        String nombre3 = scan.nextLine();

        System.out.println("nombre1 = " + nombre1);
        System.out.println("nombre2 = " + nombre2);
        System.out.println("nombre3 = " + nombre3);



        String nuevoNombre1 = formatearNombre(nombre1);
        String nuevoNombre2 = formatearNombre(nombre2);
        String nuevoNombre3 = formatearNombre(nombre3);

        String resultado = nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3;
        System.out.println(resultado);


    }

    public static String formatearNombre(String nombre) {
        String segundoCaracterMayuscula = Character.toUpperCase(nombre.charAt(1)) + ".";
        String ultimosDosCaracteres = nombre.substring(nombre.length() - 2);
        return segundoCaracterMayuscula + ultimosDosCaracteres;
    }
        



    }

