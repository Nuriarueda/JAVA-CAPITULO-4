/* Escribe un programa que ordene tres números enteros introducidos por teclado. */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce 3 numeros");
        System.out.print("Numero 1: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Numero 2: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("Numero 3: ");
        int num3 = Integer.parseInt(sc.nextLine());

        if (num1<num2 && num2<num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num3<num2 &&num2<num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if (num3<num1 && num1<num2){
            System.out.println(num3 + " " + num1+ " " + num2);
        } else if (num1<num3 && num3<num2){
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2<num1 && num1<num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2<num3 && num3<num1){
            System.out.println(num2 + " " + num3 + " " + num1);
        }
        sc.close();
    }
}
