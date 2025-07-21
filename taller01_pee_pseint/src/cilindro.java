package taller01_pee_pseint;
import java.util.Scanner;

public class cilindro {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String repetir;
        double radio, altura, area, perimetro, volumen;
        
        
        repetir = "";
        radio = 0.0;
        altura = 0.0;
        area = 0.0;
        perimetro = 0.0;
        volumen = 0.0;

        
        do {
            
            System.out.println("Digite el radio");
            radio = scan.nextDouble();
            
            System.out.println("Digite la altura");
            altura = scan.nextDouble();
            
            if (radio >0 && altura >0){
                
                perimetro = 2 * radio * Math.PI; //circuferencia
                area = 2 * (Math.PI * Math.pow(radio, 2)); //area del circulo
                area = area + (perimetro * altura);//Area de la circuferencia + Area del rectangulo
                perimetro = (4 * perimetro)+(2 * altura);//circuferencia + perimetro del rectangulo
                volumen = (Math.PI * Math.pow(radio, 2) * altura);//volumen

                System.out.println("La figura es un: Cilindro");
                System.out.println("Su perimetro es " + perimetro + " metros");
                System.out.println("Su area es: " + area + " metros cuadrados");
                System.out.println("Su volumen es: " + volumen + " metros cubicos");

                System.out.println("---------------------------------------------------");
                System.out.println("si desea repetir el proceso digite 'R', si desea finalizar el proceso digite 'x'");
                repetir = scan.next();
                
            }else if(radio <0 && altura <0){
                System.out.println("los datos ingresados no son validos");
            }
            
        } while (repetir.equalsIgnoreCase("R"));
    }
    
}
