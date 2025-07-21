package talle01_pee_pseint;

import java.util.Scanner;

public class fibronacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            int i, cant, acum, anterior, posterior;
            System.out.println("---------------------FIBONACCI-------------------");

            anterior = 0;
            posterior = 1;
            acum = 0;
            cant = 0;

            System.out.print("\nIngrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();

            System.out.println();
            for (i = 0; i < cant; i++) {
                System.out.print(anterior + " ");
                acum = anterior + posterior;
                posterior = anterior;
                anterior = acum;
            }

            System.out.print("\n\nPara repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
