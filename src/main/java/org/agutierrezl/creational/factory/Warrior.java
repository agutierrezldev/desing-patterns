package org.agutierrezl.creational.factory;

public class Warrior implements IEnemy{

    @Override
    public void attack() {
        System.out.println("Warrior attack");
    }
}
