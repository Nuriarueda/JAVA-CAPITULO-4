/* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tus notas para realizar tu media: ");

        System.out.print("Primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Tercera nota: ");
        double nota3 = sc.nextDouble();

        double media = ((nota1+nota2+nota3)/3);

        if (media <5){
            System.out.printf("Tu media es de %.2f", media + " has sacado un insuficiente");
        } 
        if ( media == 5){
            System.out.printf("Tu media es de %.2f", media + " has sacado un suficiente");
        } 
        if (media == 6){
            System.out.printf("Tu media es de %.2f", media + " has sacado un bien");
        } 
        if (media == 7 && media == 8 ){
            System.out.printf("Tu media es de %.2f", media + " has sacado un notable");
        } 
        if (media == 9 && media == 10){
            System.out.printf("Tu media es de %.2f", media + " has sacado un sobresaliente");
        } 
        sc.close();
        
    }
}
