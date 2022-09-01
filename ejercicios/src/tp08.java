import java.util.Scanner;

public class tp08 {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double num = entrada.nextDouble();
        System.out.println("La raiz de "+num+" es = "+ Math.sqrt(num));

    }
}
