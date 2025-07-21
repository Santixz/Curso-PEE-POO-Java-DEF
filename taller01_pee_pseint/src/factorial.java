package taller01_pee_pseint;
import java.util.Scanner;



public class factorial {


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        char volver = ' ';
        int i, cant, factorial;
        
        
        cant = 0;
                
        do {
            factorial = 1;
            
            System.out.println("-----Descubre el factorial desde el 1 hasta el 12-----");
            
            System.out.println("Ingrese el numero del cual desea saber su factorial");
            cant = scan.nextInt();
            
            if (cant <=12) {
                for (i = 1; i<=cant; i++) {
                    factorial = factorial * i;
                }
                System.out.println("el factorial de " + cant + "es: " + factorial);        
            }
            else if (cant >12) {
                System.out.println("el digito ingresado es infinito");
            }
            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
        }while (Character.toUpperCase(volver)=='R');
    }
    
}
