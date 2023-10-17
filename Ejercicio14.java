/* Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5. */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero y te diremos si es par o impar: ");
        int num = Integer.parseInt(sc.nextLine());

        if ((num%2)==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        if ((num%5)==0) {
            System.out.println("El numero es divisible entre 5");
        } else {
            System.out.println("El numero no es divisible entre 5");
        }
        sc.close();

    }
}
