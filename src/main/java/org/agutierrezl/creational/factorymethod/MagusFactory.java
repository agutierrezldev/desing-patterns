package org.agutierrezl.creational.factorymethod;

public class MagusFactory extends EnemyFactory{

    @Override
    public IEnemy createEnemy() {
        return new Magus();
    }
}
