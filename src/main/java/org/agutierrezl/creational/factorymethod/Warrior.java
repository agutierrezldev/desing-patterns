package org.agutierrezl.creational.factorymethod;

public class Warrior implements IEnemy {

    @Override
    public void attack() {
        System.out.println("Warrior attack");
    }
}
