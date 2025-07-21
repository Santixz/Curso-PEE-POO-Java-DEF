package taller01_pee_java;
import java.util.Scanner;
import java.util.Random;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int Answer;
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("---------------CALCULADORA----------------");
        System.out.println("Indique que operacion quiere hacer: ");
        System.out.println("Suma = 1 ");
        System.out.println("Resta = 2 ");
        System.out.println("Multiplicacion = 3 ");
        System.out.println("Division = 4 ");
        System.out.println("Modulo = 5 ");
        System.out.println("Cuadrado = 6 ");
        System.out.println("Raiz Cuadrada = 7 ");
        System.out.println("Potencia = 8 ");
        System.out.println("Porcentaje = 9 ");
        System.out.println("Numero aleatorio = 10");
        System.out.print("Opcion: ");
        Answer = scan.nextInt();
        
        switch(Answer) {
            case 1: 
                System.out.println("-------------SUMA-----------");
                System.out.print("Digita los numeros que quieras sumar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2: 
                System.out.println("-------------RESTA-----------");
                System.out.print("Digita los numeros que quieras restar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3: 
                System.out.println("---------------MULTIPLICACION------------");
                System.out.print("Digita los numeros que quieras multiplicar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;

            case 4: 
                System.out.println("---------------DIVISION-------------");
                System.out.print("Digita los numeros que quieras dividir: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);
                break;

            case 5: 
                System.out.println("--------------MODULO----------------");
                System.out.print("Digita los numeros: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 % num2;
                System.out.println("El resultado del modulo es: " + resultado);
                
                break;

            case 6: 
                System.out.println("-------------CUADRADO--------------");
                System.out.print("Digita el numero que quieres elevar al cuadrado: ");
                num1 = scan.nextDouble();
                resultado = Math.pow(num1, 2);
                System.out.println("El cuadrado de " + num1 + " es: " + resultado);
                break;

            case 7:
                System.out.println("----------------RAIZ CUADRADA--------------");
                System.out.print("Digita el numero al que quieres sacar raiz cuadrada: ");
                num1 = scan.nextDouble();
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                    System.out.println("La raiz cuadrada de " + num1 + " es: " + resultado);
                } else {
                    System.out.println("Error: No se puede sacar raiz cuadrada de un numero negativo.");
                }
                break;

            case 8: 
                System.out.println("---------------POTENCIA----------------");
                System.out.print("Digita la base: ");
                num1 = scan.nextDouble();
                System.out.print("Digita el exponente: ");
                num2 = scan.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.println(num1 + " elevado a " + num2 + " es: " + resultado);
                break;

            case 9: 
                System.out.println("----------------PORCENTAJE-------------");
                System.out.print("Digita el total: ");
                num1 = scan.nextDouble();
                System.out.print("Digita el porcentaje (%): ");
                num2 = scan.nextDouble();
                resultado = (num1 * num2) / 100;
                System.out.println(num2 + "% de " + num1 + " es: " + resultado);
                break;

            case 10: 
                System.out.println("-----------------NUMERO ALEATORIO-----------------");
                System.out.print("Digita el valor mínimo: ");
                num1 = scan.nextDouble();
                System.out.print("Digita el valor máximo: ");
                num2 = scan.nextDouble();
                if (num1 < num2) {
                    Random rand = new Random();
                    resultado = num1 + (rand.nextDouble() * (num2 - num1));
                    System.out.println("Numero aleatorio entre " + num1 + " y " + num2 + " es: " + resultado);
                } else {
                    System.out.println("Error: El valor minimo debe ser menor que el maximo.");
                }
                break;

            default:
                System.out.println("Digite una opcion valida del menu.");
                break;
        }

        scan.close();
    }
}
