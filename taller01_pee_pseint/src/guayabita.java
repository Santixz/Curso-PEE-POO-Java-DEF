import java.util.Scanner;
import java.util.Random;

public class guayabita {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cant, pozo, lanzar1, lanzar2, apuesta;
        String[] jugador;

        do {
            System.out.print("\nDigite la cantidad de jugadores: ");
            cant = sc.nextInt();
            sc.nextLine();

            if (cant > 6 || cant <= 1) {
                System.out.println("No pueden ser más de 6 jugadores ni menos de 2.");
            }
        } while (cant > 6 || cant <= 1);

        jugador = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugador[i] = sc.nextLine();
        }

        pozo = cant;

        do {
            for (int i = 0; i < cant; i++) {
                System.out.println("____________________________________________________________________________");
                System.out.println("\n------------------------ El acumulado del pozo es: " + pozo + " ------------------------\n");
                System.out.println(jugador[i] + ", presiona ENTER para tu primer lanzamiento .....");
                sc.nextLine();

                lanzar1 = random.nextInt(6) + 1;
                mostrarDado(lanzar1);

                if (lanzar1 == 1 || lanzar1 == 6) {
                    pozo += 1;
                    System.out.println("_______________________________________________\n");
                    System.out.println("HAS PERDIDO, coloca una moneda en la apuesta");
                } else {
                    do {
                        System.out.println("_______________________________________________\n");
                        System.out.print("La apuesta mínima es 1 y la máxima es: " + pozo + ": ");
                        apuesta = sc.nextInt();
                        sc.nextLine();
                        System.out.println("_______________________________________________");
                    } while (apuesta <= 0 || apuesta > pozo);

                    System.out.println("\n" + jugador[i] + ", presiona ENTER para tu segundo lanzamiento .....");
                    sc.nextLine();
                    lanzar2 = random.nextInt(6) + 1;

                    System.out.println();
                    mostrarDado(lanzar2);

                    if (lanzar2 > lanzar1) {
                        pozo -= apuesta;
                        System.out.println("_______________________________________________\n");
                        System.out.println("HAS GANADO, saca " + apuesta + " del pozo");
                    } else {
                        pozo += apuesta;
                        System.out.println("_______________________________________________\n");
                        System.out.println("HAS PERDIDO, coloca " + apuesta + " de apuesta en el pozo, turno para el siguiente jugador");
                    }
                }

                if (pozo == 0) {
                    break;
                }
            }
        } while (pozo > 0);

        System.out.println("____________________________________________________________________________");
        System.out.println("\n---------- ¡FIN DEL JUEGO, YA NO HAY MÁS DINERO QUE APOSTAR! ----------\n");
        sc.close();
    }

    public static void mostrarDado(int num) {
        switch (num) {
            case 1:
                System.out.println("                                     ______");
                System.out.println("                                    |      |");
                System.out.println("                                    |   O  |");
                System.out.println("                                    |______|");
                break;
            case 2:
                System.out.println("                                     ______");
                System.out.println("                                    |O     |");
                System.out.println("                                    |      |");
                System.out.println("                                    |_____O|");
                break;
            case 3:
                System.out.println("                                     ______");
                System.out.println("                                    |O     |");
                System.out.println("                                    |   O  |");
                System.out.println("                                    |_____O|");
                break;
            case 4:
                System.out.println("                                     ______");
                System.out.println("                                    |O    O|");
                System.out.println("                                    |      |");
                System.out.println("                                    |O____O|");
                break;
            case 5:
                System.out.println("                                     ______");
                System.out.println("                                    |O    O|");
                System.out.println("                                    |  O   |");
                System.out.println("                                    |O____O|");
                break;
            case 6:
                System.out.println("                                     ______");
                System.out.println("                                    |O    O|");
                System.out.println("                                    |O    O|");
                System.out.println("                                    |O____O|");
                break;
            default:
                System.out.println(":P");
        }
    }
}
