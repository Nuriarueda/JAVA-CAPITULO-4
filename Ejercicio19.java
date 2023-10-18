/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero (maximo 5 digitos): ");
        int n = Integer.parseInt(sc.nextLine());

        int numdigitos = 0;

        if (n<10){
            numdigitos = 1;
        } else if (n>=10 && n<100){
            numdigitos = 2;
        } else if (n>=100 && n<1000){
            numdigitos = 3;
        } else if (n>=1000 && n <10000){
            numdigitos = 4;
        } else if (n>=10000 && n<100000){
            numdigitos = 5;
        }

        System.out.println("El numero " + n + " tiene " + numdigitos + " digitos");
        sc.close();
    }
}
