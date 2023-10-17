/* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso. */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int puntos = 0;

        System.out.println("TEST DAM");

        //TEST 1
        System.out.println("Que toca el lunes a primera:");
        System.out.println("1)Sistemas informáticos");
        System.out.println("2)Programación");
        System.out.println("3)Lenguaje de Marcas");
        System.out.print("Elige una opcion: ");
        int respuesta1 = Integer.parseInt(sc.nextLine());

        if (respuesta1 == 2) {
            puntos++;
        }
        System.out.println("");
        //TEST 2
        System.out.println("Que toca el martes a primera:");
        System.out.println("1)Sistemas informáticos");
        System.out.println("2)Programación");
        System.out.println("3)Lenguaje de Marcas");
        System.out.print("Elige una opcion: ");
        int respuesta2 = Integer.parseInt(sc.nextLine());

        if (respuesta2 == 3) {
            puntos++;
        }
        System.out.println("");
        //TEST 3
        System.out.println("Que toca el miercoles a tercera:");
        System.out.println("1)Base de Datos");
        System.out.println("2)Programación");
        System.out.println("3)Lenguaje de Marcas");
        System.out.print("Elige una opcion: ");
        int respuesta3 = Integer.parseInt(sc.nextLine());

        if (respuesta3 == 1) {
            puntos++;
        }
        System.out.println("");
        //TEST 4
        System.out.println("Que programa se utiliza el programacion :");
        System.out.println("1)C++");
        System.out.println("2)JAVA");
        System.out.println("3)Python");
        System.out.print("Elige una opcion: ");
        int respuesta4 = Integer.parseInt(sc.nextLine());

        if (respuesta4 == 2) {
            puntos++;
        }
        System.out.println("");
        //TEST 5
        System.out.println("Que se utiliza para los condicionales en JAVA:");
        System.out.println("1)Do While");
        System.out.println("2)For");
        System.out.println("3)If");
        System.out.print("Elige una opcion: ");
        int respuesta5 = Integer.parseInt(sc.nextLine());

        if (respuesta5 == 3) {
            puntos++;
        }
        System.out.println("");
        System.out.println("Tienes " + puntos + " puntos");


        sc.close();
    }
}
