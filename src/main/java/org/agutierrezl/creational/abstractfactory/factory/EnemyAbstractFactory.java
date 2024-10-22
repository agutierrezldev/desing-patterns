package org.agutierrezl.creational.abstractfactory.factory;

import org.agutierrezl.creational.abstractfactory.armor.IArmor;
import org.agutierrezl.creational.abstractfactory.enemy.IEnemy;
import org.agutierrezl.creational.abstractfactory.weapon.IWeapon;

public abstract class EnemyAbstractFactory {

    public abstract IEnemy createEnemy();
    public abstract IArmor createArmor();
    public abstract IWeapon createWeapon();

}
