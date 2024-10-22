package org.agutierrezl.creational.factory;

public class TestFactory {

    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();
        IEnemy warrior = enemyFactory.createEnemy("warrior");
        IEnemy magus = enemyFactory.createEnemy("magus");

        warrior.attack();
        magus.attack();
    }
}
