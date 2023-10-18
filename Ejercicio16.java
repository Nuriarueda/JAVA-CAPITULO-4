/* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int puntos = 0;

        System.out.println("A continuacion te vamos a hacer una serie de preguntas y deberas responder v o f");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        String respuesta1 = sc.nextLine();
        if (respuesta1.equals("v")) {
            puntos += 3;
        }

        System.out.print("2. Ha aumentado sus gatos de vestuario: ");
        String respuesta2 = sc.nextLine();
        if (respuesta2.equals("v")) {
            puntos += 3;
        }

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
        String respuesta3 = sc.nextLine();
        if (respuesta3.equals("v")) {
            puntos += 3;
        }

        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
        String respuesta4 = sc.nextLine();
        if (respuesta4.equals("v")) {
            puntos += 3;
        }

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
        String respuesta5 = sc.nextLine();
        if (respuesta5.equals("v")) {
            puntos += 3;
        }

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
        String respuesta6 = sc.nextLine();
        if (respuesta6.equals("v")) {
            puntos += 3;
        }

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
        String respuesta7 = sc.nextLine();
        if (respuesta7.equals("v")) {
            puntos += 3;
        }

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
        String respuesta8 = sc.nextLine();
        if (respuesta8.equals("v")) {
            puntos += 3;
        }

        System.out.print("9. Has notado que últimamente se perfuma más: ");
        String respuesta9 = sc.nextLine();
        if (respuesta9.equals("v")) {
            puntos += 3;
        }

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
        String respuesta10 = sc.nextLine();
        if (respuesta10.equals("v")) {
            puntos += 3;
        }

        System.out.println("Tienes " + puntos + " puntos");

        if (puntos>=0 && puntos<=10 ) {
            System.out.println("¡Enhorabuena!, tu pareja parece ser totalmente fiel");
        } else if (puntos>=11 & puntos<=22) {
            System.out.println(": Quizás exista el peligro de otra persona en su\r\n" + //
                    "vida o en su mente, aunque seguramente será algo sin importancia. No\r\n" + //
                    "bajes la guardia.");
        } else if (puntos>=22 && puntos<=30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar\r\n" + //
                    "viviendo un romance con otra persona. Te aconsejamos que indagues un\r\n" + //
                    "poco más y averigües que es lo que está pasando por su cabeza.\r");
        }



        sc.close();
    }
}
