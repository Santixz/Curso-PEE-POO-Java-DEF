package taller01_pee_pseint;

import java.util.Scanner;
import java.util.Random;

public class baloto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String volver;

        do {
       
            for (int j = 0; j < 30; j++) System.out.println();
            
            System.out.println("---------------------------BALOTO---------------------------");

          
            int[] numeros = new int[6];
            int numero;
            boolean repetido;

  
            for (int i = 0; i < 6; i++) {
                do {
                    numero = rand.nextInt(45) + 1;
                    repetido = false;

                    for (int j = 0; j < i; j++) {
                        if (numeros[j] == numero) {
                            repetido = true;
                            break;
                        }
                    }

                } while (repetido);
                numeros[i] = numero;
            }

     
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nNúmeros del baloto:");
            for (int n : numeros) {
                System.out.println(n);
            }

            
            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = scan.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        scan.close();
    }
}
