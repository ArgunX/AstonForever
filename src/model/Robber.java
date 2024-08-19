package model;

public class Robber extends Enemy{
     private int damage = 9;

    public Robber(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье врага" + " " + getHealth());
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Разбойник" + " " + "атакует");
        hero.takeDamage(damage);
    }

    @Override
    public void skill() {
        this.damage = damage+2;
        System.out.println("Заточка оружия");
        System.out.println("Атака врага" + " " + damage);
    }
}
