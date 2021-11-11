import java.util.List;
import java.util.Scanner;

public class GamePlay {

    public void startGame(List<Persona> characters) {
        System.out.println(characters);

        Dragao tiamat = new Dragao();

        Scanner atkDef = new Scanner(System.in);
        System.out.println("1-Defender\n" + "2-Atacar\n");

        while(tiamat.lifePoints <= 0 || characters.size() == 0) {
        
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


