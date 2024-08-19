import model.Archer;
import model.Hero;
import model.Mage;
import model.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("ТОР");
        hero.attackEnemy();
        Mage mage = new Mage("Гендальф");
        mage.attackEnemy();
        Archer archer = new Archer("Леголас");
        archer.attackEnemy();
        Warrior warrior = new Warrior("Арагорн");
        warrior.attackEnemy();
    }
}