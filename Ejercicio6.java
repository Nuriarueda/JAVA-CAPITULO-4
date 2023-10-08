/* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2h/g siendo g = 9.81m/s 2 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe la altura desde la que cae el objeto: ");
        double h = sc.nextDouble();
        double g = 9.81;
        double raiz = ((2*h)/g);

        System.out.printf("El objeto tardara en caer: " + "%.4f",Math.sqrt(raiz));
        sc.close();
    }
}
