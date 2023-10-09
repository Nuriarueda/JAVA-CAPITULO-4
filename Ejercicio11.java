/* Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora y los minutos para saber cuantos segundos faltan para medianoche");

        System.out.print("Hora: ");
        int hora = sc.nextInt();

        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        int segHora = 3600 * hora;
        int segMin = 60 * minutos;
        int segDia = 86400;

        int segTotal = segHora + segMin;

        System.out.println("Faltan " + (segDia - segTotal) + " segundos");
        sc.close();
    }
}
