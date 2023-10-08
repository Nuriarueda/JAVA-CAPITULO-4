/* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana. */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe el numero del dia de la semana que quieras saber: ");
        int num = sc.nextInt();

        String dia;

        switch (num) {
            case 1:
                dia = " es Lunes";
                break;
            case 2:
                dia = " es Martes";
                break;
            case 3:
                dia = " es Miercoles";
                break;
            case 4:
                dia = " es Jueves";
                break;
            case 5:
                dia = " es Viernes";
                break;
            case 6:
                dia = " es Sabado";
                break;
            case 7:
                dia = " es Domingo";
                break;
        
            default:
                dia = " no existe";
        }

        System.out.println("El día " + num + "" + dia);
        sc.close();
    }
}
