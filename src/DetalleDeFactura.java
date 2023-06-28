import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double precio1=0;
        double precio2=0;

        System.out.println("Ingrese el precio 1");
        precio1 = scan.nextDouble();
        System.out.println("Ingrese el precio 2");
        precio2 = scan.nextDouble();

        double total = precio1 + precio2;
        double impuesto = total * 0.19;
        double precioFinal = impuesto + total;

        System.out.println("La factura producto de oficina tiene un total bruto de " + total +  ", con un impuesto de" + impuesto + " y el monto después de impuesto es de "+ precioFinal);

    }
}
