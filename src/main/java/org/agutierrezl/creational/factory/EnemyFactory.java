package org.agutierrezl.creational.factory;

public class EnemyFactory {

    public IEnemy createEnemy (String type){
        if (type.equalsIgnoreCase("warrior"))
            return new Warrior();
        else if (type.equalsIgnoreCase("magus"))
            return new Magus();
        else
            return null;
    }
}
