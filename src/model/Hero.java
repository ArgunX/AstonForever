package model;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attackEnemy(Enemy enemy){

        System.out.println("Герой" + " " + name + " " + "атакует врага");
        enemy.takeDamage(0);
    }
}
