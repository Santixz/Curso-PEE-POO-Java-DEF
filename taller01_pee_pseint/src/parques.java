package taller01_pee_java;
import java.util.Scanner;

import java.util.Random;

public class parques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String volver;
        String[] lanzamiento = {"Primer", "Segundo", "Tercer"};

        do {

            System.out.println("---------------------PARQUES--------------------");

            int[] dados = new int[2];

            for (int i = 0; i < 3; i++) {
                System.out.println(lanzamiento[i] + " lanzamiento. Presione ENTER...");
                sc.nextLine();  

              
                dados[0] = random.nextInt(6) + 1;
                dados[1] = random.nextInt(6) + 1;

                if (dados[0] == dados[1]) {
                    System.out.println("Ha sacado par de " + dados[0]);

                    if (i == 2) {
                        System.out.println("\n¡Saca una Ficha!");
                        break;
                    }
                } else {
                    System.out.println("Ha sacado " + dados[0] + " y " + dados[1]);
                    System.out.println("\n¡Lanza de nuevo!");
                    break;
                }
            }

            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        sc.close();
    }
}
