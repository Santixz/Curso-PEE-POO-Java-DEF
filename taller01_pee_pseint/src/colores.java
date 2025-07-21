package taller01_pee_pseint;
import java.util.Scanner;

public class colores {


    public static void main(String[] args) {
        System.out.println("MEZCLA DE COLOR");
        
        Scanner scan  =  new  Scanner(System.in);
        
        int col1, col2;
        
        System.out.println("Escoja que combinacion de colores desea hacer");
        
        System.out.println("(1)amarillo");
        System.out.println("(2)azul");
        System.out.println("(3)rojo");
        // 1+2 = verde | 1+3 = naranja | 2+3 = morado
        System.out.println("digite el valor del primer color que desea ingresar");
        col1 = scan.nextInt();
        System.out.println("digite el valor del segundo color que desea ingresar");
        col2 = scan.nextInt();
        
        if (col1==1 && col2 == 2 || col1==2 && col2 == 1){
         System.out.println("la combinacion de tus colores es VERDE");
        }
        else if (col1 ==1 && col2 == 3 || col1 ==3 && col2 == 1){
            System.out.println("la combinacion de tus colores es NARANJA");
        }else if (col1 ==2 && col2 ==3 || col1 ==3 && col2 ==2){
            System.out.println("la combinacion de tus colores es MORADO");
        }else if (col1==1 && col2==1 || col1==2 && col2==2 || col1==3 && col2==3){
            System.out.println("No es valido ingresar el mismo digito para ambos valores, Prueba con digitos diferentes ");
        }else if (col1 >3 || col2>3 || col1 <1 || col2<1) {
            System.out.println("los digitos que ingresaste no son validos");
        }
   
    }
    
}


