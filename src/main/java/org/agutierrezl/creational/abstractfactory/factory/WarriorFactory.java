package org.agutierrezl.creational.abstractfactory.factory;

import org.agutierrezl.creational.abstractfactory.armor.HeavyArmor;
import org.agutierrezl.creational.abstractfactory.armor.IArmor;
import org.agutierrezl.creational.abstractfactory.enemy.IEnemy;
import org.agutierrezl.creational.abstractfactory.enemy.Warrior;
import org.agutierrezl.creational.abstractfactory.weapon.Axe;
import org.agutierrezl.creational.abstractfactory.weapon.IWeapon;

public class WarriorFactory extends EnemyAbstractFactory{

    @Override
    public IEnemy createEnemy() {
        return new Warrior();
    }

    @Override
    public IArmor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public IWeapon createWeapon() {
        return new Axe();
    }
}
