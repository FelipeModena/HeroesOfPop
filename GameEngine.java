import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine {
    public String userName;
    public List<Persona> characters = new ArrayList<Persona>();

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

        for (int i = 0; i < 3; i++) {
            characters.add(new Guerreiro("Gueirro" + i, 10, 15));
        }
        while (Integer.parseInt(gameStatus) != 3) {

            System.out.println("Personagens criados atualmente: " + characters.size());
            for (Persona object : characters) {
                System.out.println(object.getClass());
                System.out.println("Nome: " + object.name);
                System.out.println("Ataque: " + object.attack);
                System.out.println("Defesa:" + object.defence);
                System.out.println("Pontos de vida: " + object.lifePoints);
                System.out.println("Defesa de arma: " + object.weapon.defence);
                System.out.println("Dano de arma: " + object.weapon.damage);
                System.out.println("------>");

            }
            System.out.println("\nQual opção voce vai seguir?");
            System.out.println("1-Iniciar aventura!");
            System.out.println("2-Criar personagem");
            System.out.println("3-Sair jogo");
            System.out.println("");
            gameStatus = scanner.next();
            switch (Integer.parseInt(gameStatus)) {
            case 1:
                System.out.println("Iniciar jogo");
                gameplay();
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
        int classe = -1;
        int arma = -1;
        String charName = "NomePadrao";
        System.out.println("\n");
        System.out.println("1-Guerriro");
        System.out.println("2-Mago");
        System.out.println("3-Arqueiro");

        classe = getClass(scanner, classe);
        System.out.println("\n");
        arma = getWeapon(scanner, classe, arma);
        System.out.println("\n");
        charName = getName(scanner);
        System.out.println("\n");

        switch (classe) {
        case 1:
            if (arma == 1) {
                characters.add(new Guerreiro(charName, 10, 15));
            } else {
                characters.add(new Guerreiro(charName, 17, 8));
            }
            break;
        case 2:
            System.out.println("Mago");
            if (arma == 1) {
                characters.add(new Mago(charName, 16, 9));
            } else {
                characters.add(new Mago(charName, 13, 12));
            }
            break;
        case 3:
            System.out.println("Archer");
            if (arma == 1) {
                characters.add(new Arqueiro(charName, 12, 13));
            } else {
                characters.add(new Arqueiro(charName, 15, 10));
            }
            break;
        }

    }

    private String getName(Scanner scanner) {
        String charName;
        System.out.print("Qual o nome do seu herói: ");
        charName = scanner.next();
        return charName;
    }

    private int getWeapon(Scanner scanner, int classe, int arma) {
        switch (classe) {
        case 1:
            System.out.println("Espada");
            System.out.println("Machado");
            break;
        case 2:
            System.out.println("Varinha");
            System.out.println("Cajado");
            break;

        case 3:
            System.out.println("Arco longo");
            System.out.println("Belastra");
            break;

        }
        System.out.print("Arma escolhida: ");
        while (arma > 3 || arma < 0) {
            arma = scanner.nextInt();
        }
        return arma;
    }

    private int getClass(Scanner scanner, int classe) {
        while (classe > 3 || classe < 0) {
            System.out.print("Classe escolhida: ");
            classe = scanner.nextInt();
        }
        return classe;
    }

    private void gameplay() {
        GamePlay gamePlay = new GamePlay();
        gamePlay.startGame(characters);
    }

}
