package org.agutierrezl.creational.abstractfactory.factory;

import org.agutierrezl.creational.abstractfactory.armor.IArmor;
import org.agutierrezl.creational.abstractfactory.armor.Robe;
import org.agutierrezl.creational.abstractfactory.enemy.IEnemy;
import org.agutierrezl.creational.abstractfactory.enemy.Magus;
import org.agutierrezl.creational.abstractfactory.weapon.IWeapon;
import org.agutierrezl.creational.abstractfactory.weapon.WizardStaff;

public class MagusFactory extends EnemyAbstractFactory{

    @Override
    public IEnemy createEnemy() {
        return new Magus();
    }

    @Override
    public IArmor createArmor() {
        return new Robe();
    }

    @Override
    public IWeapon createWeapon() {
        return new WizardStaff();
    }
}
