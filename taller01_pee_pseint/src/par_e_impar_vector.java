package taller01_pee_pseint;

import java.util.Scanner;

public class par_e_impar_vector{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        int[] pares = new int[1000000];
        int[] impares = new int[1000000];

        do {
            int num1 = 0, num2 = 0, cont = 0, i, aux = 0, menu = 0;
            boolean band1 = true, band2 = true;

            System.out.println("Diseñe un programa que solicite 2 números por teclado, luego indique al usuario si desea la serie");
            System.out.println("par o impar, después muestre en pantalla la serie par o impar según la elección desde el número");
            System.out.println("menor que se ingresó al inicio hasta el número mayor.\n");

            System.out.print("Digite el primer número: ");
            num1 = scanner.nextInt();

            do {
                System.out.print("Digite el segundo número: ");
                num2 = scanner.nextInt();

                if (num1 == num2) {
                    System.out.println("\nDigite nuevamente el segundo número, ya que no puede ser igual al primero\n");
                } else {
                    if (num1 > num2) {
                        aux = num2;
                        num2 = num1;
                        num1 = aux;
                    }
                }
            } while (num1 == num2);

            cont = (int) Math.floor(num2 / 2.0);

            int originalNum1 = num1;
            int parIndex = 0, imparIndex = 0;

            for (i = 0; i <= cont; i++) {
                band1 = true;
                band2 = true;

                do {
                    aux = num1;
                    if (aux % 2 == 0) {
                        pares[parIndex++] = num1;
                        band1 = false;
                    } else {
                        impares[imparIndex++] = num1;
                        band2 = false;
                    }
                    num1 = num1 + 1;
                } while (band1 == band2);
            }

            num1 = originalNum1;

            do {
                System.out.println("\n----- Series -----");
                System.out.println("1. Impar");
                System.out.println("2. Par");
                System.out.print("\nDigite una opción del menú, de lo contrario cualquier otra tecla para salir: ");

                if (scanner.hasNextInt()) {
                    menu = scanner.nextInt();
                } else {
                    menu = 0;
                    scanner.next(); // descarta entrada inválida
                }

                switch (menu) {
                    case 1:
                        System.out.println("\nSerie Impar:");
                        if ((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0)) {
                            for (i = 0; i < cont; i++) {
                                System.out.print(" - " + impares[i]);
                            }
                        } else if (num1 % 2 == 0 && num2 % 2 == 0) {
                            for (i = 0; i < cont - 1; i++) {
                                System.out.print(" - " + impares[i]);
                            }
                        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
                            for (i = 0; i <= cont; i++) {
                                System.out.print(" - " + impares[i]);
                            }
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("\nSerie Par:");
                        for (i = 0; i < cont; i++) {
                            System.out.print(" - " + pares[i]);
                        }
                        System.out.println();
                        break;
                }

            } while (menu == 1 || menu == 2);

            System.out.print("\nSi desea volver al ejercicio digite (s), de lo contrario cualquier tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine(); // limpiar buffer

            System.out.println("\n---------------------------------------------\n");

        } while (volver == 's');

        scanner.close();
    }
}
