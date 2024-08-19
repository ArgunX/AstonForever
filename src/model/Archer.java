package model;

public class Archer extends Hero{
    private final int damage = 12;
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник" + " " + super.getName() + " " + "атакует врага");
        enemy.takeDamage(damage);
    }
}
