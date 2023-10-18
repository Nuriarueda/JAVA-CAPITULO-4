/* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero y te dire cual es el ultimo digito: ");
        int n = Integer.parseInt(sc.nextLine());

        int ultdigito = n%10;

        System.out.println("El ultimo digito de " + n + " es " + ultdigito);
        sc.close();
    }
}
