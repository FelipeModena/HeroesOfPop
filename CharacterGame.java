class Guerreiro extends Persona {
    public Guerreiro() {
        attack = 30;
        defense = 20;
        lifePoints = 180;
    }
}

class Mago extends Persona {
    public Mago() {
        attack = 20;
        defense = 10;
        lifePoints = 200;
    }
}

class Arqueiro extends Persona {
    public Arqueiro() {
        attack = 20;
        defense = 30;
        lifePoints = 160;
    }
}

class Persona {
    String name;
    int weapon;
    int attack;
    int defense;
    int lifePoints;
}