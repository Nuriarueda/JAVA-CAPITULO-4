import java.util.Scanner;
public class EJERCICIOEXAMEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("INTRODUCE LOS DATOS DEL PRIMER USUARIO");
        //PRIMER USUARIO
        System.out.print("Introduce el nombre del primer usuario: ");
        String nombre1 = sc.nextLine();
        System.out.print("Introduce el apellido del primer ususario: ");
        String apellido1 = sc.nextLine();
        System.out.print("Introduce la edad del primer usuario: ");
        int edad1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la altura del primer usuario: ");
        float altura1 = Float.parseFloat(sc.nextLine());
        System.out.print("Introduce el peso del primer usuario: ");
        float peso1 = Float.parseFloat(sc.nextLine());

        double imc1 = (peso1*(altura1*altura1));

        System.out.println("");
        System.out.println("INTRODUCE LOS DATOS DEL SEGUNDO USUARIO");
        //SEGUNDO USUARIO 
        System.out.print("Introduce el nombre del segundo usuario: ");
        String nombre2 = sc.nextLine();
        System.out.print("Introduce el apellido del segundo ususario: ");
        String apellido2 = sc.nextLine();
        System.out.print("Introduce la edad del segundo usuario: ");
        int edad2 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la altura del segundo usuario: ");
        float altura2 =Float.parseFloat(sc.nextLine());
        System.out.print("Introduce el peso del segundo usuario: ");
        float peso2 = Float.parseFloat(sc.nextLine());
        double imc2 = (peso2*(altura2*altura2));

        //TABLA 
        System.out.println("*****************************************************************************************");
        System.out.printf("%-25s|%-25s|%-8s|%-10s|%-8s|%-7s|\n", "NOMBRE", "APELLIDOS", "EDAD", "ALTURA", "PESO", "IMC");
        System.out.println("*****************************************************************************************");
        System.out.printf("%-25s|%-25s|%-8d|%-10.2f|%-8.2f|%-7.2f|\n", nombre1, apellido1, edad1, altura1, peso1, imc1 );
        System.out.printf("%-25s|%-25s|%-8d|%-10.2f|%-8.2f|%-7.2f|\n", nombre2, apellido2, edad2, altura2, peso2, imc2 );

        System.out.println("");
        if (imc1>imc2){
            System.out.println(nombre1 + " tiene un IMC mayor a " + nombre2);
        } else {
            System.out.println(nombre2 + " tiene un IMC mayor a " + nombre1);
        }
        sc.close();
    }
}
