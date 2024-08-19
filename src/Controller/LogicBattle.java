package Controller;

import View.ViewBattleGround;
import model.Enemy;
import model.Hero;

public class LogicBattle {
    ViewBattleGround viewBattleGround = new ViewBattleGround();

    public void mortalCombat(){
        Hero hero = viewBattleGround.viewHero();
        Enemy enemy = viewBattleGround.viewEnemy();
       while(hero.isAlive()){
           hero.attackEnemy(enemy);
           if (!enemy.isAlive()) {
               System.out.println("Враг погиб");
               return;
           }
           battleSkillEnemy(enemy,hero);

    }
        System.out.println("Герой побежден");
}
    public int random(){
        return (int) (Math.random() * 2);
    }
    public void battleSkillEnemy(Enemy enemy,Hero hero){
        if(random()==1){
            enemy.skill();
            enemy.attackHero(hero);
        } else{
            enemy.attackHero(hero);
        }
    }
}
