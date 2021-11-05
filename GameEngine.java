import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.event.PrintEvent;

public class GameEngine {
    public String userName;
    public List<Object> characters = new ArrayList<Object>();

    void startGameLayout() {
        System.out.println(
                "HHH    HH EEEEEE  RRRRRRRRR         OOO         EEEEEEE       SSSSSS    OOOOOOOOO      PPppppppp");
        System.out.println(
                "HHH    HH EEEEEE  RRRR     RR    OO  (I)  OO    EEEEEEE     SSSSSSS     OO  OO0OO000OO PP    pppp");
        System.out.println(
                "HHHHHHHHH EE      RRRR     RRR  OOO  (I)   OOO  EEE       SSSSSS        OO  OO OO   OO PP    ppp");
        System.out.println(
                "HHHHHHHHH EEEEER  RRRRR    RR   OOO  (I)   OOO  EEEEEEE SSSSS           OO  OO OO   OO PP   pp");
        System.out.println(
                "HHHHHHHHH EEEEER  RRRRR   R     OOO  (I)   OOO  EEEEEEE  SSSSS          OO  OO OO   OO PP pp");
        System.out.println("HHHHHHHHH EE      RRRRRRR        OO  (I)  OO    EE         SSSSS        OO  OO OO   OO PP");
        System.out.println("HHH    HH EEEEEEEEEEEE  RRR       OO (I) OO     EEEEEE   SSSSS          OO  OO00OO00OO PP");
        System.out.println("HHH    HH EEEEEEEEEEEE   RRRR        OOO         EEEEEE SSSS            OOOOOOOOO      PP");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mainMenu();

    }

    private void mainMenu() {
        String gameStatus = "0";
        Scanner scanner = new Scanner(System.in);
        while (Integer.parseInt(gameStatus) != 3) {
           
           System.out.println("Personagens criados atualmente: "+characters.size());
           for (Object object : characters) {
               System.out.println(object.getClass());
           }
            System.out.println("\nQual opção voce vai seguir?");
            System.out.println("1-Iniciar aventura!");
            System.out.println("2-Criar personagem");
            System.out.println("3-Sair jogo");
            System.out.println("");
            for (Object object : characters) {
                System.out.println(object.getClass().getName());
            }
            gameStatus = scanner.next();
            switch (Integer.parseInt(gameStatus)) {
            case 1:
                System.out.println("Iniciar jogo");
                break;
            case 2:
                System.out.println("Criação de personagem");
                createCaracter();
                break;
            case 3:
                System.out.println("Sair da aventura");
                return;

            default:
                System.out.println("Não existe essa opção nesse mundo, tente outra por favor \n\n");
                break;
            }
        }
    }

    private void createCaracter() {
        Scanner scanner = new Scanner(System.in);
        int statusCreation = 1;
        System.out.println("Guerriro");
        System.out.println("Mago");
        System.out.println("Arqueiro");
        do {
            statusCreation = scanner.nextInt();
            switch (statusCreation) {
            case 1:
                characters.add(new Guerreiro());
                break;
            case 2:
            characters.add(new Mago());

                break;
            case 3:
            characters.add(new Arqueiro());

                break;

            default:
                break;
            }
        } while (statusCreation > 3);
        // characters.get(characters.size()-1);
        
    }
}
