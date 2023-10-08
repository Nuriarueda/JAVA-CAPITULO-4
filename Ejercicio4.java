/* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Cuantas horas al dia trabajas: ");
        int horas = sc.nextInt();
        int sueldo;

        if (horas <= 40){
            sueldo = horas*12;
            System.out.println("Cobrarás " + sueldo + " euros");
        } else {
            sueldo = horas*16;
            System.out.println("Cobrarás " + sueldo + " euros");
        }
        sc.close();
    }
}
