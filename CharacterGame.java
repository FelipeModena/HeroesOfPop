import java.util.List;

class Guerreiro extends Persona {
    public Guerreiro() {
        attack = 30;
        defence = 20;
        lifePoints = 180;
    }
}

class Mago extends Persona {

    public Mago() {
        attack = 20;
        defence = 10;
        lifePoints = 200;

    }
}

class Arqueiro extends Persona {
    public Arqueiro() {
        attack = 20;
        defence = 30;
        lifePoints = 160;
    }
}

class Persona {
    String name;
    Boolean weapon;
    int attack;
    int defence;
    int lifePoints;
    List<Weapon> weaponSlist;
}

/**
 * CharacterGame
 */
class Weapon {
    int attack,defence;
        Object 
    
}