package taller01_pee_pseint;
import java.util.Scanner;

public class tablasmultiplicar {


    public static void main(String[] args) {
        char volver = ' ';
        int i, j, res;
        
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Tablas de multiplicas del 1 a 10");
            
            for (i=1;i<11;i++){
                for (j=1;j<11;j++){
                    res = (i*j);
                    System.out.println(i + " x " + j + " = " + res);
                }
            }
            
            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
        } while (Character.toUpperCase(volver)== 'R');
    }
    
}
