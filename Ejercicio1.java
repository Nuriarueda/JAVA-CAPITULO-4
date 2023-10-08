/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día. */
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Escribe el dia del que quieras saber que asigantura tienes a primera hora: ");
        String dia = sc.nextLine();
        String asignatura;

        switch (dia) {
            case "lunes":
                asignatura = " tienes programacion"; 
                break;
            case "martes":
                asignatura = " tienes base de datos"; 
                break;
            case "miercoles":
                asignatura = " tienes lenguaje de marcas"; 
                break;
            case "jueves":
                asignatura = " tienes sistemas informaticos"; 
                break;
            case "viernes":
                asignatura = " tienes entorno de desarrollo"; 
                break;
            default:
                asignatura = " no tienes clase";
        }

        System.out.println("El " + dia + "" + asignatura);
        sc.close();
    }
}