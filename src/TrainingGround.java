import model.*;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("ТОР");
        Enemy enemy = new Enemy(100);
        hero.attackEnemy(enemy);
        Mage mage = new Mage("Гендальф");
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Леголас");
        archer.attackEnemy(enemy);
        Warrior warrior = new Warrior("Арагорн");
        warrior.attackEnemy(enemy);
    }
}