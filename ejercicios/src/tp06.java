import java.util.Scanner;

public class tp06 {
    public static void main(String[] args){
        Scanner dato= new Scanner(System.in);
        System.out.println("Ingrese numero para Math.sin: ");
        int sin= dato.nextInt();
        System.out.println("Ingrese numero para Math.cos: ");
        int cos= dato.nextInt();
        System.out.println("Ingrese numero para Math.tang: ");
        int tang= dato.nextInt();
        System.out.println("Ingrese numero para Math.atan: ");
        int atan= dato.nextInt();
        System.out.println("Ingrese el primero numero para Math.atan2: ");
        double atan2= dato.nextInt();
        System.out.println("Ingrese el segundo numero para Math.atan2: ");
        double dato2atan= dato.nextInt();
        System.out.println("El resultado del Seno de: "+sin+" es:"+Math.sin(sin));
        System.out.println("El resultado del Coseno de: "+cos+" es:"+Math.cos(cos));
        System.out.println("El resultado de la Tangente de:"+ tang+ " es:"+Math.tan(tang));
        System.out.println("El resultado del ArcoTangente de: "+atan+ " es:"+Math.atan(atan));
        System.out.println("El resultado del ArcoTangente del cociente de : ("+atan2+"),("+dato2atan+ ") es:"+Math.atan2(atan2,dato2atan));

        System.out.println();
        System.out.println();
        System.out.println("Funcion exponencial y su inversa");
        System.out.println();
        System.out.println("Ingrese numero para Math.exp: ");
        int exp= dato.nextInt();
        System.out.println("Ingrese numero para Math.log: ");
        int log=dato.nextInt();
        System.out.println("El resultado de la funcion exponencial de: "+exp+" es: ");
        System.out.println("El resultado de la funcion exponencial de: "+log+ " es: ");
        System.out.println();
        System.out.println("Constantes PI y e");
        System.out.println();
        System.out.println("El resultado de PI es: "+Math.PI);
        System.out.println();
        System.out.println("El resultado de E es: "+ Math.E);
    }
}
