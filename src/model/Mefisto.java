package model;

public class Mefisto extends Enemy{
    private final int damage = 15;

    public Mefisto(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье врага" + " " + getHealth());
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Мефисто" + " " + "атакует");
        hero.takeDamage(damage);
        skill();
    }

    @Override
    public void skill() {
       setHealth(getHealth()+3);
        System.out.println("Лечение каждый ход +4");
    }
}
