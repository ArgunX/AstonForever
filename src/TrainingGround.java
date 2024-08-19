import model.*;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(100);
        Mage mage = new Mage("Гендальф");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Леголас");
        archer.attackEnemy(enemy);
        Warrior warrior = new Warrior("Арагорн");
        warrior.attackEnemy(enemy);
    }
}