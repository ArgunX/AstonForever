package model;

public class Warrior extends Hero{
    private final int damage = 14;
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }
}
