/* Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha. */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Con que quieres realizar la piramide: ");
        String caracter = sc.nextLine();

        System.out.println("Como quieres que este el vertice de la piramide");
        System.out.println("1) Mirando hacia arriba");
        System.out.println("1) Mirando hacia abajo");
        System.out.println("1) Mirando hacia la derecha");
        System.out.println("1) Mirando hacia la izquierda");
        System.out.print("Opciones: ");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("   " + caracter + "   ");
                System.out.println("  " + caracter + " " + caracter + "  ");
                System.out.println(" " + caracter + " " + caracter + " " + caracter + " ");
                System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter);
                break;
            case 2:
                System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter);
                System.out.println(" " + caracter + " " + caracter + " " + caracter + " ");
                System.out.println("  " + caracter + " " + caracter + "  ");
                System.out.println("   " + caracter + "   ");
                break;
            case 3:
                System.out.println("   " + caracter);
                System.out.println("  " + caracter + " ");
                System.out.println(" " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " ");
                System.out.println(" " + caracter + " " + caracter);
                System.out.println("  " + caracter + " ");
                System.out.println("   " + caracter);
                break;
            case 4:
                System.out.println(caracter + "   ");
                System.out.println(" " + caracter + "  ");
                System.out.println(caracter + " " + caracter + " ");
                System.out.println(" " + caracter + " " + caracter + " ");
                System.out.println(caracter + " " + caracter + " ");
                System.out.println(" " + caracter + "  ");
                System.out.println(caracter + "   ");
            default:
                System.out.println("Esa opcion no esta disponible");
                break;
        }


        sc.close();
    }
}
