class Character {
    void attack() {
        System.out.println("Character attacks!");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior slashes with sword!");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

