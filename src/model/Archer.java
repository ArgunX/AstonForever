package model;

public class Archer extends Hero{
    private final int damage = 12;
    public Archer(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }
    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье" + " " + getName() + " " + getHealth());
    }


}
