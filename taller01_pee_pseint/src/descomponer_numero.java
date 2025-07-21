package taller01_pee_pseint;

import java.util.Scanner;

public class descomponer_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        int[] vector = new int[10];

        do {
            int num = 0, temp = 0, cant = 0;

            System.out.println("------------------------------DESCOMPONER NUMERO------------------------------------");
            
            System.out.print("Escriba un número entero: ");
            num = scanner.nextInt();

            temp = num;
            cant = 0;

            while (temp > 0) {
                temp = temp / 10;
                cant++;
            }

            for (int i = cant - 1; i >= 0; i--) {
                vector[i] = num % 10;
                num = num / 10;
            }

            System.out.println("\nEl número tiene " + cant + " dígitos y se descompone así:\n");

            for (int i = 0; i < cant; i++) {
                System.out.print(" - " + vector[i]);
            }

            System.out.print("\n\nSi desea volver digite (s), de lo contrario cualquier tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); // Limpiar buffer

            System.out.println("\n-------------------------------------------\n");

        } while (volver == 's');

        scanner.close();
    }
}
