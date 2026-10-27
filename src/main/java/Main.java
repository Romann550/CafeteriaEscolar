import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("================================");
            System.out.println("       CAFETERÍA ESCOLAR        ");
            System.out.println("================================");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n================================");
                    System.out.println("        REGISTRAR COMPRA        ");
                    System.out.println("================================");
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    System.out.print("¿Cuántos productos comprará?: ");
                    int numProductos = scanner.nextInt();

                    double subtotal = 0.0;

                    for (int i = 1; i <= numProductos; i++) {
                        System.out.println("Producto " + i);
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();

                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        double importe = precio * cantidad;
                        subtotal = subtotal + importe;

                        System.out.println("Importe: $" + String.format("%.2f", importe));
                    }

                    double porcentajeDescuento = 0.0;

                    if (subtotal < 100.0) {
                        porcentajeDescuento = 0.0;
                    } else if (subtotal >= 100.0 && subtotal < 300.0) {
                        porcentajeDescuento = 0.05;
                    } else {
                        porcentajeDescuento = 0.10;
                    }

                    double descuento = subtotal * porcentajeDescuento;
                    double total = subtotal - descuento;

                    System.out.println("\n================================");
                    System.out.println("       RESUMEN DE COMPRA        ");
                    System.out.println("================================");
                    System.out.println("Cliente: " + nombreCliente);
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("Descuento: $" + String.format("%.2f", descuento));
                    System.out.println("Total: $" + String.format("%.2f", total));
                    System.out.println("================================\n");
                    break;

                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.\n");
                    break;
            }
        }

        scanner.close();
    }
}
