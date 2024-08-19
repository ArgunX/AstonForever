package model;

public class Mage extends Hero{
    private final int damage = 8;
    public Mage(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье" + " " + getName() + " " + getHealth());
    }
}
