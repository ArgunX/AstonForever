package model;

public class Zombie extends Enemy{
    private final int damage = 14;
    public Zombie(int health) {
        super(health);

    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        System.out.println("Здоровье врага" + " " + getHealth());
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби" + " " + "атакует");
        hero.takeDamage(damage);
    }

    @Override
    public void skill() {
      setHealth(getHealth()+18);
        System.out.println("Зомби получил +18 здоровья");
    }
}
