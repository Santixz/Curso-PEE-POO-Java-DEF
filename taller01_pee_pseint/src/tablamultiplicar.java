package taller01_pee_pseint;
import java.util.Scanner;

public class tablamultiplicar {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        char volver = ' ';
        int res, i, tabla;
        
        tabla = 0;
        res = 0;
        do {
            System.out.println("digite el numero de tabla del 1 a 10 que desea visualizar");
            tabla = scan.nextInt();
            
            for (i=1; i<11; i++){
                res = i * tabla;
                System.out.println(tabla + "X" + i + "=" + res);
            }
            
            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
        }while (Character.toUpperCase(volver)== 'R');
    }
    
}