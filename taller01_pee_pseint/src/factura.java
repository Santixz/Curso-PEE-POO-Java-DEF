package taller01_pee_java;

import java.util.Scanner;

public class factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String volver;

        String[] encabezado = {
            "Item        |", "Nombre      |", "Precio      |", "Cantidad    |",
            "Canst (s/n) |", "IvaProd     |", "Parcial     |", "SubTotal    |"
        };

        do {
            String[][] factura = new String[20][8]; // Hasta 20 productos
            int i = 0;
            int cant = 0;
            double IVA = 0.19;
            double ivaAcm = 0.0;
            double total = 0.0;
            String otroPrd;

            System.out.println("-------------------FACTURA---------------------");

            do {
                double ivaParc = 0.0, totalParc = 0.0, subtotal = 0.0;

                for (int j = 0; j < 8; j++) {
                
                    factura[i][0] = String.valueOf(i + 1);

                    
                    if (j > 0 && j < 5) {
                        System.out.print("[" + i + "," + j + "] " + encabezado[j] + ": ");
                        factura[i][j] = sc.nextLine().trim();
                    }

              
                    if (j == 5) {
                        double precio = Double.parseDouble(factura[i][2]);
                        int cantidad = Integer.parseInt(factura[i][3]);
                        subtotal = precio * cantidad;

                        if (!factura[i][4].equalsIgnoreCase("s")) {
                            ivaParc = subtotal * IVA;
                            factura[i][5] = String.format("%.2f", ivaParc);
                            factura[i][4] = "19 %";
                        } else {
                            ivaParc = 0.0;
                            factura[i][5] = "0.00";
                            factura[i][4] = " 0 %";
                        }

                        ivaAcm += ivaParc;
                    }

                    if (j == 6) {
                        totalParc = subtotal - ivaParc;
                        factura[i][6] = String.format("%.2f", totalParc);
                        total += totalParc;
                    }

                
                    if (j == 7) {
                        factura[i][7] = String.format("%.2f", subtotal);
                    }
                }

       
                System.out.println("      IVA Producto |: > " + ivaParc);
                System.out.println("     Total Parcial |: > " + totalParc);
                System.out.println(" Subtotal Producto |: > " + subtotal);
                System.out.println("         Total IVA |: > " + ivaAcm);
                System.out.println("   SubTotal Compra |: > " + total);
                System.out.println("     Total a Pagar |: > " + (total + ivaAcm));

                i++;
                cant = i;


                System.out.print("\n¿Desea agregar otro artículo? (s/n): ");
                otroPrd = sc.nextLine().trim();

            } while (otroPrd.equalsIgnoreCase("s"));

            
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");
            for (String h : encabezado) {
                System.out.print("     " + h);
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");

            for (i = 0; i < cant; i++) {
                for (int j = 0; j < 8; j++) {
                    String dato = factura[i][j];
                    dato = (dato == null) ? "" : dato;
                    while (dato.length() < 11) {
                        dato += " ";
                    }
                    System.out.print("     " + dato + "|");
                }
                System.out.println();
            }

           
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println();
            System.out.printf("%130s %.2f\n", "Total IVA : ", ivaAcm);
            System.out.printf("%130s %.2f\n", "SubTotal Compra : ", total);
            System.out.printf("%130s %.2f\n", "Total a Pagar : ", total + ivaAcm);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");

            System.out.print("\nPara repetir digite <s>, para salir cualquier otra tecla: ");
            volver = sc.nextLine().trim();

        } while (volver.equalsIgnoreCase("s"));

        sc.close();
    }
}
