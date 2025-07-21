package taller01_pee_pseint;

import java.util.Scanner;

public class par_e_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            char menu = ' ';
            int menuEnt = 0;
            int num1 = 0, num2 = 0, aux, i;

            System.out.println("---------------------------PAR Y IMPAR-----------------------");
             
            System.out.print("Digite el primer número: ");
            num1 = scanner.nextInt();

            System.out.print("Digite el segundo número: ");
            num2 = scanner.nextInt();

            while (num1 == num2) {
                System.out.println("\nDigite nuevamente el segundo número, ya que no puede ser igual al primero:");
                num2 = scanner.nextInt();
            }

            if (num1 > num2) {
                aux = num2;
                num2 = num1;
                num1 = aux;
            }

            do {
                menuEnt = 0;

                System.out.println("\n----- Series -----");
                System.out.println("1. Impar");
                System.out.println("2. Par");
                System.out.print("\nDigite una opción del menú, de lo contrario cualquier otra tecla para salir: ");
                String input = scanner.next();
                if (input.length() > 0) {
                    menu = input.charAt(0);
                }

                if (menu == '1' || menu == '2') {
                    menuEnt = Character.getNumericValue(menu);
                    menu = ' ';

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\nSerie Impar:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 != 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
                            break;

                        case 2:
                            System.out.println("\nSerie Par:");
                            for (i = num1; i <= num2; i++) {
                                if (i % 2 == 0) {
                                    System.out.print(" - " + i);
                                }
                            }
                            System.out.println();
                            break;
                    }
                }

            } while (menuEnt == 1 || menuEnt == 2);

            System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
