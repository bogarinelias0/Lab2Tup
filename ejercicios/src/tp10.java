import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class tp10 {
    public static void main(String[ ] args){
        int i= 0;
        int encontrarNumero = ThreadLocalRandom.current().nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        int numeroIngresado;
        System.out.println("¡Trata de acertar el numero!");
        do {
            System.out.println("Ingresa el numero: ");
            numeroIngresado = sc.nextInt();
            i+=1;

            if (encontrarNumero > numeroIngresado) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (encontrarNumero < numeroIngresado) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (encontrarNumero != numeroIngresado);

        System.out.println("Acertaste, el numero  era: " + encontrarNumero);
        System.out.println("Y la cantidad de intentos fue: "+ i);
    }
    }

