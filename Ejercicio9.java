/* Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0). */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ECUACIÓN DE SEGUNDO GRADO");

        System.out.print("Escribe el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Escribe el valor de b: ");
        int b = sc.nextInt();

        System.out.print("Escribe el valor de c: ");
        int c = sc.nextInt();

        int n1 = ((b*b)+(4*a*c));
        double raiz = Math.sqrt(n1);

        double resultado1 = (-b + raiz)/(2*a);
        double resultado2 = (-b - raiz)/(2*a);

        if (resultado1 < 0 && resultado2 < 0 && a ==0){
            System.out.println("Lo siento tu ecuacion no tiene solución");
        } else if (resultado1 != 0 && resultado2 != 0){
            System.out.println("La solución de tu ecuacion es " + resultado1 + " y " + resultado2);
        } 
        sc.close();
    }
}
