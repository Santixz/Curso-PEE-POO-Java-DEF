package taller01_pee_pseint;
import java.util.Random;
import java.util.Scanner;

public class indice_posicion_valor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char volver;

        do {

            System.out.print("------------------------------INDICE POSICION VALOR---------------------------------");
            int[] vector = new int[10];
            for (int i = 0; i < 10; i++) {
                vector[i] = random.nextInt(100); 
            }

          
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            System.out.println();
            System.out.print("Para repetir digite <s>, para salir cualquier tecla: ");
            String input = scanner.nextLine();
            volver = input.isEmpty() ? ' ' : input.charAt(0);

        } while (volver == 's' || volver == 'S');

        scanner.close();
    }
}
