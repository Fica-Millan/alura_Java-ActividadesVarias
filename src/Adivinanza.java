import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        int numeroAdivinar = new Random().nextInt(100);
        int numeroIntentos = 1;

        System.out.println("Vamos a jugar avidinanzas!");
        System.out.println("Del 1 al 100, en qué número estoy pensando? ");

        Scanner teclado = new Scanner(System.in);
        int numeroElegido = teclado.nextInt();

        while (numeroIntentos != 5) {

            if (numeroAdivinar == numeroElegido) {
                System.out.println("Correcto!");
                break;
            } else {
                System.out.println("Incorrecto, intenta nuevamente:");
                numeroElegido = teclado.nextInt();
            }
            numeroIntentos++;
        }
        System.out.println("Ya gastaste tus cinco intentos, el numero era " + numeroAdivinar);
    }
}
