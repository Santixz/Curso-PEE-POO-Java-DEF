package taller01_pee_pseint;
import java.util.Scanner;
import java.util.Random;

public class baloto_vector {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random ale = new Random();
        
        char volver = ' ';
        int i, j, aux;
        int[] baloto = new int[6];
        
        aux = 0;
        
                
        do {
            System.out.println("presione una tecla para hallar los numeros del baloto");
            scan.next();
            
            baloto[0] = ale.nextInt(45) + 1;
            
            for (i = 1; i < 6; i++ ) {
              baloto[i] = ale.nextInt(45)+1;
            
                for (j = 0; j <= i-1; j++) {
                    if (baloto[i] == baloto[j]) {
                        i--;

                    }
                }
            }
            
            for (i = 0; i<6; i++) {
                for (j = 0; j<5; j++) {
                    if (baloto[j] > baloto[j+1]) {
                        aux = baloto[j];
                        baloto[j] = baloto[j+1];
                        baloto[j+1] = aux;
                    }
                }
            }
            
            for (i=0; i<6; i++) {
                System.out.println("el valor del baloto es: " + baloto[i]);
            }
            
            System.out.println("si desea repetir el proceso presione 'R' de lo contrario presione 'X'");
            volver= scan.next().charAt(0);
            
            
        } while (Character.toUpperCase(volver)=='R');
    }
    
}
