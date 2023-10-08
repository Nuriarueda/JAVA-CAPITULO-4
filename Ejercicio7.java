/* Realiza un programa que calcule la media de tres notas. */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tus notas para realizar tu media: ");

        System.out.print("Primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Tercera nota: ");
        double nota3 = sc.nextDouble();

        double media = ((nota1+nota2+nota3)/3);
        System.out.printf("Tu media es de " + "%.2f", media);

        sc.close();
    }
}
