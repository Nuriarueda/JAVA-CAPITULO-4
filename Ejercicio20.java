/* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior. */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce tu primera nota: ");
        float nota1 = Float.parseFloat(sc.nextLine());

        System.out.print("Introduce tu segunda nota: ");
        float nota2 = Float.parseFloat(sc.nextLine());

        float media = 0;
        media = (nota1 + nota2)/2;

        System.out.println("Tu nota media es de " + media);

        if (media<5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación (apto/no apto): ");
            String recuperacion = sc.nextLine();

            if (recuperacion.equals("apto")) {
                System.out.println("Tienes un 5 de media");
            } else {
                System.out.println("Tienes un " + media + " de media");
            }
        }
        
        sc.close();
    }
}
