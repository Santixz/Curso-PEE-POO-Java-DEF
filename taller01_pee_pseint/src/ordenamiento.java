package taller01_pee_pseint;


import java.util.Scanner;

public class ordenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver, menu;
        int menuEnt, i, num1, num2, num3, aux;

        do {
            System.out.println("------------------ORDENAMIENTO-----------------");

        
            menu = "";
            num1 = 0;
            num2 = 0;
            num3 = 0;

            System.out.print("\nDigite el valor del primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Digite el valor del segundo número: ");
            num2 = scanner.nextInt();
            System.out.print("Digite el valor del tercer número: ");
            num3 = scanner.nextInt();

        
            for (i = 0; i < 2; i++) {
                if (num1 >= num2) {
                    aux = num1;
                    num1 = num2;
                    num2 = aux;
                }
                if (num2 >= num3) {
                    aux = num2;
                    num2 = num3;
                    num3 = aux;
                }
            }

            do {
                menuEnt = 0;
                System.out.println("\n----- Ordenamiento -----");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                System.out.print("Digite una opción del menú, de lo contrario cualquier tecla para salir: ");
                menu = scanner.next();

                if (menu.equals("1") || menu.equals("2")) {
                    menuEnt = Integer.parseInt(menu);
                    menu = ""; 

                    switch (menuEnt) {
                        case 1:
                            System.out.println("\n" + num1 + " - " + num2 + " - " + num3);
                            break;
                        case 2:
                            System.out.println("\n" + num3 + " - " + num2 + " - " + num1);
                            break;
                    }
                }
            } while (menuEnt == 1 || menuEnt == 2);


            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = scanner.next();

        } while (volver.equalsIgnoreCase("s"));

        scanner.close();
    }
}
