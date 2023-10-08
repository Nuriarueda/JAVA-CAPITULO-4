/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0). */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Vamos a realizar una ecuación de primer grado del tipo ax+b = 0");

        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        double solucion;

        if (a == 0){
            System.out.println("X no tiene solucion");
        } else {
            solucion = (-b/a);
            System.out.println("El valor de x es " + solucion);
        }
        sc.close();
    }
}
