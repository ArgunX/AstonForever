package View;

import model.*;

import java.util.Scanner;

public class ViewBattleGround {
    public ViewBattleGround() {
    }

    public  Hero viewHero() {
        System.out.println("Выберете героя: ");
        System.out.println("1 - Лучник");
        System.out.println("2 - Маг");
        System.out.println("3 - Воин");
        int scanner = new Scanner(System.in).nextInt();
        switch (scanner){
            case 1:
                return new Archer("Леголас",200);
            case 2:
                return new Mage("Гендальф", 120);
            case 3:
               return new Warrior("Арагорн",250);
            default:
                System.out.println("Нет такого героя");
                return null;
        }
    }

        public Enemy viewEnemy() {
        System.out.println("Выберете врага:");
        System.out.println("1 - Зомби");
        System.out.println("2 - Разбойник");
        System.out.println("3 - Мефисто");
        int scanner = new Scanner(System.in).nextInt();
        switch (scanner) {
            case 1:
            return new Zombie(100);
             case 2:
                 return  new Robber(80);
             case 3:
                  return new Mefisto(110);
                  default:
                 System.out.println("Нет такого монстра");
                 return  null;
}
    }

    }

