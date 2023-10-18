/* Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras. */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero (maximo 5 cifras): ");
        int n = Integer.parseInt(sc.nextLine());
        int digito1 = 0;

        if (n<10) {
            digito1 = n;
        } else if (n>=10 && n<100){
            digito1 = n/10;
        } else if (n>=100 & n<1000){
            digito1 = n/100;
        } else if (n>=1000 && n<10000){
            digito1 = n/1000;
        } else if (n>=10000 && n<100000){
            digito1 = n/10000;
        } 

        System.out.println("El primer digito de " + n + " es " + digito1);
        sc.close();
    }
}
