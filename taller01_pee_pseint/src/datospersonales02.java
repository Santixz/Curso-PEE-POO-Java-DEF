package taller01_pee_pseint;
import java.util.Scanner;
public class datospersonales02{

        public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        double salario;
        int transporte;
        Scanner in = new Scanner(System.in);
        
        transporte = 1;
              String respuestaTransporte ="";
              
        
       
        System.out.println("Ingrese su nombre");
        nombre = in.next();
        System.out.println("Ingrese su edad");
        edad = in.nextInt();       
        System.out.println("Ingrese su sexo");
        sexo = in.next().charAt(0);
        System.out.println("Digite su salario:");
        salario = in.nextDouble();
        System.out.println("¿Tiene transporte? 1 = Si, 0 = No:");
        transporte = in.nextInt();
        
        
        
        
           if (transporte == 1){
            respuestaTransporte = " si tiene transporte";
        } else if (transporte == 0){
            respuestaTransporte = " no tiene transporte";
        }

       
       //
       
      
       System.out.println("Su nombre es:" + nombre);
       System.out.println("Usted tiene:" + edad); 
       System.out.println("Su sexo es:" + sexo);
       System.out.println("Su salario es:" + salario);
       System.out.println("Usted:" + respuestaTransporte);
       
       
    }
            
    
}
    
