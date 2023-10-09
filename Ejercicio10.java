/* Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento. */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el dia y el mes de tu cumpleaños");
        System.out.print("Dia: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        String mes = sc.next();

        switch (mes) {
            case "Enero":
                if (dia >= 20){
                    System.out.println("Eres acuario");
                } else if (dia <= 19){
                    System.out.println("Eres piscis");
                }
                break;
            
            case "Febrero":
                if (dia >= 19){
                    System.out.println("Eres piscis");
                } else if (dia <= 21){
                    System.out.println("Eres aries");
                }
                break;
            case "Marzo":
                if (dia >= 21){
                    System.out.println("Eres aries");
                } else if (dia <= 20){
                    System.out.println("Eres tauro");
                }
                break;
            case "Abril":
                if (dia >= 20){
                    System.out.println("Eres tauro");
                } else if (dia <= 21){
                    System.out.println("Eres geminis");
                }
                break;
            case "Mayo":
                if (dia >= 21){
                    System.out.println("Eres geminis");
                } else if (dia <= 21){
                    System.out.println("Eres cáncer");
                }
                break;
            case "Junio":
                if (dia >= 21){
                    System.out.println("Eres cáncer");
                } else if (dia <= 23){
                    System.out.println("Eres leo");
                }
                break;
            case "Julio":
                if (dia >= 23){
                    System.out.println("Eres leo");
                } else if (dia <= 23){
                    System.out.println("Eres virgo");
                }
                break;
            case "Agosto":
                if (dia >= 23){
                    System.out.println("Eres virgo");
                } else if (dia <= 23){
                    System.out.println("Eres libra");
                }
                break;
            case "Septiembre":
                if (dia >= 23){
                    System.out.println("Eres libra");
                } else if (dia <= 23){
                    System.out.println("Eres escorpio");
                }
                break;
            case "Octubre":
                if (dia >= 23){
                    System.out.println("Eres escorpio");
                } else if (dia <= 22){
                    System.out.println("Eres sagitario");
                }
                break;
            case "Noviembre":
                if (dia >= 22){
                    System.out.println("Eres sagitario");
                } else if (dia <= 22){
                    System.out.println("Eres capricornio");
                }
                break;
            case "Diciembre":
                if (dia >= 22){
                    System.out.println("Eres capricornio");
                } else if (dia <= 20){
                    System.out.println("Eres acuario");
                }
                break;
            default:
        }

        sc.close();
    }
}
