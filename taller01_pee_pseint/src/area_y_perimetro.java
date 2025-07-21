package taller01_pee_java;

import java.util.Scanner;

public class area_y_perimetro{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu;
        double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0, radio = 0.0;
        double area = 0.0, perimetro = 0.0;

        System.out.print("Diseñe un algoritmo que muestre un menú para la selección (1. Triángulo, 2. Rectángulo y 3. Círculo); ");
        System.out.print("luego pida los datos necesarios para la solución y muestre en pantalla el nombre de la figura, su área ");
        System.out.println("en unidades cuadradas y su perímetro en unidades simples. Recuerde que no existen áreas o perímetros menores o iguales a cero.");
        System.out.println();

        // Mostrar menú
        System.out.println("---------- MENU ----------");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.print("Seleccione una opción del menú: ");
        menu = scan.nextInt();

        switch (menu) {
            case 1: // Triángulo
                System.out.println("\n-------------- Triángulo ------------------");

                // Validar base
                do {
                    System.out.print("Digite la base: ");
                    ladoA = scan.nextDouble();
                    if (ladoA <= 0) {
                        System.out.println("La base debe ser mayor que cero.");
                    }
                } while (ladoA <= 0);

                // Validar altura
                do {
                    System.out.print("Digite la altura: ");
                    ladoB = scan.nextDouble();
                    if (ladoB <= 0) {
                        System.out.println("La altura debe ser mayor que cero.");
                    }
                } while (ladoB <= 0);

                area = (ladoA * ladoB) / 2;
                ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2)); // Hipotenusa
                perimetro = ladoA + ladoB + ladoC;

                // Salida
                System.out.println("\nLa Figura es un:   Triángulo");
                System.out.println("Su área es:        " + area + " metros cuadrados");
                System.out.println("Su perímetro es:   " + perimetro + " metros");
                break;

            case 2: // Rectángulo
                System.out.println("\n-------------- Rectángulo ------------------");

                do {
                    System.out.print("Digite el lado A: ");
                    ladoA = scan.nextDouble();
                    System.out.print("Digite el lado B: ");
                    ladoB = scan.nextDouble();

                    if (ladoA <= 0 || ladoB <= 0) {
                        System.out.println("Ambos lados deben ser mayores que cero.");
                    }
                } while (ladoA <= 0 || ladoB <= 0);

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

                // Salida
                System.out.println("\nLa Figura es un:   Rectángulo");
                System.out.println("Su área es:        " + area + " metros cuadrados");
                System.out.println("Su perímetro es:   " + perimetro + " metros");
                break;

            case 3: // Círculo
                System.out.println("\n-------------- Círculo ------------------");

                do {
                    System.out.print("Digite el radio: ");
                    radio = scan.nextDouble();
                    if (radio <= 0) {
                        System.out.println("El radio debe ser mayor que cero.");
                    }
                } while (radio <= 0);

                area = Math.PI * Math.pow(radio, 2);
                perimetro = 2 * Math.PI * radio;

                // Salida
                System.out.println("\nLa Figura es un:        Círculo");
                System.out.println("Su área es:             " + area + " metros cuadrados");
                System.out.println("Su circunferencia es:   " + perimetro + " metros");
                break;

            default:
                System.out.println("La opción del menú no existe.");
                break;
        }

        scan.close();
    }
}

