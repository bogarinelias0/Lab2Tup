import java.util.Scanner;

public class tp09 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Indique su genero : Masculino=m       Femenino=f");
        String genero = dato.nextLine();
        System.out.println();
        String letram= "m";
        String letraf= "f";
        if (!genero.equals("m") && !genero.equals("f")) {
            System.out.println("Ingreso una letra distinta!!!!");
            System.out.println("Ingrese M para Masculino o F para Femenino");
        };
        if ("m".equals(genero) || "f".equals(genero)) {
            System.out.println("Ingrese su altura:");
            int altura = dato.nextInt();
            int pesoideal;
            if ("m".equals(genero)){
                pesoideal = altura - 110;
                System.out.println(pesoideal);
            } else if ("f".equals(genero)) {
                pesoideal = altura - 120;
                System.out.println(pesoideal);
            };
        }
    }
}