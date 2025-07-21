import java.util.Scanner;

public class tipo_triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;
        double angA, angB, angC, ladoA, ladoB, ladoC;
        int menu;

        do {
            volver = "s";
            menu = 0;
            angA = 0.0;
            angB = 0.0;
            angC = 0.0;
            ladoA = 0.0;
            ladoB = 0.0;
            ladoC = 0.0;

            System.out.println("---------- MENU ----------");
            System.out.println("1. Ángulos");
            System.out.println("2. Lados");
            System.out.print("Seleccione una opción del menú: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n-------------- Triángulo por Ángulos ------------------");
                    do {
                        System.out.println("\nRecuerde que los ángulos deben ser mayores a 0");
                        System.out.print("Digite el ángulo A: ");
                        angA = sc.nextDouble();
                        System.out.print("Digite el ángulo B: ");
                        angB = sc.nextDouble();
                    } while (angA <= 0 || angB <= 0);

                    angC = 180 - (angA + angB);

                    if (angC > 0) {
                        if (angA == 90 || angB == 90 || angC == 90) {
                            System.out.println("Es un triángulo: RECTÁNGULO");
                        }
                        if (angA > 90 || angB > 90 || angC > 90) {
                            System.out.println("Es un triángulo: OBTUSÁNGULO");
                        }
                        if (angA < 90 && angB < 90 && angC < 90) {
                            System.out.println("Es un triángulo: ACUTÁNGULO");
                        }
                    } else {
                        System.out.println("Ángulos Incorrectos");
                    }
                    break;

                case 2:
                    System.out.println("\n-------------- Triángulo por Lados ------------------");
                    do {
                        System.out.println("\nRecuerde que los lados deben ser mayores a 0");
                        System.out.print("Digite el lado A: ");
                        ladoA = sc.nextDouble();
                        System.out.print("Digite el lado B: ");
                        ladoB = sc.nextDouble();
                        System.out.print("Digite el lado C: ");
                        ladoC = sc.nextDouble();
                    } while (ladoA <= 0 || ladoB <= 0 || ladoC <= 0);

                    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                        if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                            if (ladoA == ladoB && ladoB == ladoC) {
                                System.out.println("Es un triángulo: EQUILÁTERO");
                            } else {
                                System.out.println("Es un triángulo: ISÓSCELES");
                            }
                        } else {
                            System.out.println("Es un triángulo: ESCALENO");
                        }
                    } else {
                        System.out.println("Lados Incorrectos");
                    }
                    break;

                default:
                    System.out.println("La opción del menú no existe");
            }

            System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
            sc.nextLine();
            volver = sc.nextLine();

        } while (volver.equalsIgnoreCase("s"));

        sc.close();
    }
}
