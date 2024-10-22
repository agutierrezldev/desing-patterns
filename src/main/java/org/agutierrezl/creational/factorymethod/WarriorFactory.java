package org.agutierrezl.creational.factorymethod;


public class WarriorFactory extends EnemyFactory {

    @Override
    public IEnemy createEnemy() {
        return new Warrior();
    }
}
