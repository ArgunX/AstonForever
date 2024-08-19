package model;

public class Mage extends Hero{
    private final int damage = 8;
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }
}
