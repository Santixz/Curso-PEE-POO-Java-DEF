package taller01_pee_pseint;

import java.util.Scanner;

public class datospersonales03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        String[] vector = new String[5];
        String[][] matriz = new String[5][5];

        do {
            vector[0] = "nombre      |";
            vector[1] = "apellido    |";
            vector[2] = "edad        |";
            vector[3] = "estado      |";
            vector[4] = "telefono    |";

            for (int i = 0; i < 5; i++) {
                System.out.println();
                for (int j = 0; j < 5; j++) {
                    System.out.print("[" + i + "," + j + "]. " + vector[j] + ": ");
                    matriz[i][j] = scanner.nextLine();

                    while (matriz[i][j].length() < 12) {
                        matriz[i][j] += " ";
                    }

                    matriz[i][j] += "|";
                }
            }

            System.out.println("\n-----------------------------------------------------------------------------------------|");

            for (int i = 0; i < 5; i++) {
                System.out.print("     " + vector[i]);
            }

            System.out.println("\n-----------------------------------------------------------------------------------------|");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("     " + matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("-----------------------------------------------------------------------------------------|\n");

            System.out.print("Digite < s > para repetir o cualquier tecla para salir: ");
            volver = scanner.nextLine().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
