import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {

        double saldoCuenta = 1599.99;
        String cliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        int opcionElegida = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***********************************\n");
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $ " + saldoCuenta);

        while (opcionElegida != 9) {

            System.out.println("\n***********************************\n");
            System.out.println("Escriba el número de la opción deseada:\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");

            opcionElegida = teclado.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("El saldo actualizado de su cuenta es: $ " + saldoCuenta);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseo retirar?");
                    double montoRetirar = teclado.nextDouble();
                    if (montoRetirar < saldoCuenta) {
                        saldoCuenta -= montoRetirar;
                        System.out.println("El saldo actualizado de su cuenta es: $ " + saldoCuenta);
                    } else {
                        System.out.println("Saldo insuficiente. Su saldo disponible es: $ " + saldoCuenta);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double montoDepositar = teclado.nextDouble();
                    saldoCuenta += montoDepositar;
                    System.out.println("El saldo actualizado de su cuenta es: $ " + saldoCuenta);
                    break;
                case 9:
                    System.out.println("Finalizando el programa...\nMuchas gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Por favor elija una de las opciones disponibles.");
            }
        }
        teclado.close();
    }
}