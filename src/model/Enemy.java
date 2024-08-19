package model;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        health = getHealth()- damage;
        System.out.println("Здоровье врага" + " " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
