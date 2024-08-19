package model;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Маг" + " " + super.getName() + " " + "атакует врага");
    }
}
