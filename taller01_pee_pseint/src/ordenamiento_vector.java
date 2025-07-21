package taller01_pee_pseint;
import java.util.Scanner;


public class ordenamiento_vector {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       int i, j, aux;
       char menu = ' ';
       char volver = ' ';
       int[] vector = new int [3];
       
       do{
           for (i=0; i<3; i++){
               System.out.println("digite el valor " + (i+1) + ":");
               vector[i] = scan.nextInt();
           }
           
           for (i=0; i<2; i++) {
               for (j=0; j<2; j++) {
                   if (vector[j] > vector[j+1]) {
                       aux = vector[j];
                       vector[j] = vector [j+1];
                       vector[j+1] = aux;
                   }
               }
           }
           
           do {
               System.out.println("-----ordenamiento-------");
               System.out.println("Ascendente (1)");
               System.out.println("Descendente (2)");
               
               System.out.println("Digite el numero de la opcion de ordenamiento de su preferencia");
               menu = scan.next().charAt(0);
               
               switch (menu) {
                   case '1':
                       for (i=0; i<3; i++) {
                           System.out.println(vector[i]);
                       }
                       break;
                       
                   case '2':
                       for (i=2; i>=0; i--) {
                           System.out.println(vector[i]);
                       }
                       break;
               }
           }while (menu != '1' && menu !='2');
           
           System.out.println("si desea repetir el proceso digite 'R' de lo contrario ponga 'X'");
           volver = scan.next().charAt(0);
       } while (Character.toUpperCase(volver)=='R');
    }
    
}
