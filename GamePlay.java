import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    public void startGame(List<Persona> characters) {

        Dragao tiamat = new Dragao();
        Random rand = new Random();

        Scanner scannerAtkDef = new Scanner(System.in);
        while (tiamat.lifePoints >= 0 && characters.size() > 0) {
            chooseAttackOrDefence(characters, scannerAtkDef);
            dragonAttack(characters, tiamat, rand);
            homiesAttack(characters, tiamat);
            printStatusFight(characters, tiamat);
            System.out.println("\n\n TAMANHO LISTA     " + characters.size());
        }

        if (characters.size() == 0) {
            System.out.println("DRAGAO VENCEU");
        } else {
            System.out.println("EQUIPE VENCEU");
        }

    }

    private void printStatusFight(List<Persona> characters, Dragao tiamat) {
        for (int posicao = 0; posicao < characters.size(); posicao++) {

            System.out.println("nome: " + characters.get(posicao).name + "  lifePoints "
                    + Integer.toString(characters.get(posicao).lifePoints));

            System.out.println("lifePoints Tiamat: " + tiamat.lifePoints);
            if (characters.get(posicao).lifePoints <= 0) {
                characters.remove(posicao);
            }
        }
    }

    private void homiesAttack(List<Persona> characters, Dragao tiamat) {
        for (int posicao = 0; posicao < characters.size(); posicao++) {
            if (characters.get(posicao).choiceDefence == false) {
                tiamat.lifePoints -= characters.get(posicao).attack + characters.get(posicao).weapon.damage;
            }
        }
    }

    private void dragonAttack(List<Persona> characters, Dragao tiamat, Random rand) {
        int dragonAttack;
        if (characters.size() <= 0) {
            return;
        }
        dragonAttack = rand.nextInt(characters.size());
        if (characters.get(dragonAttack).choiceDefence == true) {
            characters.get(dragonAttack).lifePoints -= tiamat.attack - characters.get(dragonAttack).defence * 1.1
                    - characters.get(dragonAttack).weapon.defence;
        } else {
            characters.get(dragonAttack).lifePoints -= tiamat.attack;
        }

    }

    private void chooseAttackOrDefence(List<Persona> characters, Scanner scannerAtkDef) {
        int atkOrDefence;
        for (int posicao = 0; posicao < characters.size(); posicao++) {
            System.out.println("\nPersonagem " + characters.get(posicao).name);
            System.out.println("1-Defender\n" + "2-Atacar\n");
            do {
                atkOrDefence = scannerAtkDef.nextInt();
            } while (atkOrDefence <= 0 || atkOrDefence > 2);
            if (atkOrDefence == 1) {
                characters.get(posicao).choiceDefence = true;
            } else {
                characters.get(posicao).choiceDefence = false;
            }
        }
    }

    class Dragao {
        int lifePoints;
        int defence;
        int attack;

        public Dragao() {
            lifePoints = 300;
            defence = 30;
            attack = 30;
        }
    }

}
