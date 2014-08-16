package calcu;

import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resultado;
        float num1;
        float num2;
        Opi op = new Opi();

        System.out.println("Numero 1");
        num1 = sc.nextInt();
        System.out.println("Numero 2");
        num2 = sc.nextInt();

        resultado = op.Sumar(num1, num2);
        System.out.println("la suma es igual a: " + resultado);
        resultado = op.Restar(num1, num2);
        System.out.println("la resta es igual a: " + resultado);
        resultado = op.Multiplicar(num1, num2);
        System.out.println("la multiplicacion es igual a: " + resultado);
        resultado = op.Divi(num1, num2);
        System.out.println("la división es igual a: " + resultado);
    }

}
