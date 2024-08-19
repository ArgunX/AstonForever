package model;

public class Warrior extends Hero{
    private final int damage = 14;
    public Warrior(String name, int health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье" + " " + getName() + " " + getHealth());
    }
}
