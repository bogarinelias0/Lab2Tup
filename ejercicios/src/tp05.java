public class tp05 {
    public static void main(String[] args) {
        float num1= 6;
        float num2 = 5;
        float num3 = 2;
        float num4= 3;
        float num5= 7;
        float num6 = 30;
        float num7= 1;
        float multiplicacion = num3/num4 * num5/num3;
        float resta = num1/num2 - multiplicacion;
        float suma = resta + num3/num6;
        float division = num7/num4 / num2;
        float resultado = suma / division;

        System.out.println("El resultado final de la operacion es "+resultado);
    }
}
