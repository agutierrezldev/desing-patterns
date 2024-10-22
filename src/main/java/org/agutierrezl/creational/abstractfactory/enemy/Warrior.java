package org.agutierrezl.creational.abstractfactory.enemy;

public class Warrior implements IEnemy{

    @Override
    public void attack() {
        System.out.println("Warrior attack!!");
    }
}
