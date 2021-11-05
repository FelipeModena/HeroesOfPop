class Espada extends WeaponsStatus {
    Espada() {
        attack = 10;
        defense = 15;
    }
}

class Machado extends WeaponsStatus {
    Machado() {
        attack = 17;
        defense = 8;
    }
}

class Varinha extends WeaponsStatus {
    Varinha() {
        attack = 16;
        defense = 9;
    }
}

class Cajado extends WeaponsStatus {
    Cajado() {
        attack = 13;
        defense = 12;
    }
}

class ArcoLongo extends WeaponsStatus {
    ArcoLongo() {
        attack = 12;
        defense = 12;
    }
}

class Balestra extends WeaponsStatus {
    Balestra() {
        attack = 15;
        defense = 10;
    }
}

class WeaponsStatus {
    int attack;
    int defense;
}