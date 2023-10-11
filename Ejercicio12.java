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

        System.out.println("Que toca el lunes a primera:");
        System.out.println("a)Sistemas informáticos");
        System.out.println("b)Programación");
        System.out.println("C)Lenguaje de Marcas");
        System.out.print("Elige una opcion: ");
        sc.close();
    }
}
