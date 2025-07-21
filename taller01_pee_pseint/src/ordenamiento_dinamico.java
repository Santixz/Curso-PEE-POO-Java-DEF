package taller01_pee_pseint;

import java.util.Random;

import java.util.Scanner;

public class ordenamiento_dinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] vector = new int[10];
        String volver;

        do {
            System.out.println("Valores aleatorios del vector:");


            for (int i = 0; i < vector.length; i++) {
                vector[i] = random.nextInt(100); 
            }

         
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = scanner.nextLine();

        } while (volver.equalsIgnoreCase("s")); 

        scanner.close();
    }
}

