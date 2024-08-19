import model.Archer;
import model.Enemy;
import model.Mage;
import model.Warrior;

public class BattleGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(100);
        Mage mage = new Mage("Гендальф");
        Archer archer = new Archer("Леголас");
        Warrior warrior = new Warrior("Арагорн");
        while (enemy.isAlive()) {
            archer.attackEnemy(enemy);
            mage.attackEnemy(enemy);
            warrior.attackEnemy(enemy);
        }
        System.out.println("Враг повержен");
    }
}
