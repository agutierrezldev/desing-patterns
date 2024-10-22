package org.agutierrezl.creational.factorymethod;

public class TestFactoryMethod {

    public static void main(String[] args) {

        IEnemy warrior = new WarriorFactory().createEnemy();
        IEnemy magus = new MagusFactory().createEnemy();

        warrior.attack();
        magus.attack();
    }
}
