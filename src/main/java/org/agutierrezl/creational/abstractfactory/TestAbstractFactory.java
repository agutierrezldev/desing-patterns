package org.agutierrezl.creational.abstractfactory;

import org.agutierrezl.creational.abstractfactory.armor.IArmor;
import org.agutierrezl.creational.abstractfactory.enemy.IEnemy;
import org.agutierrezl.creational.abstractfactory.factory.EnemyAbstractFactory;
import org.agutierrezl.creational.abstractfactory.factory.MagusFactory;
import org.agutierrezl.creational.abstractfactory.factory.WarriorFactory;
import org.agutierrezl.creational.abstractfactory.weapon.IWeapon;

public class TestAbstractFactory {

    public static void main(String[] args) {

        EnemyAbstractFactory factory = new WarriorFactory();

        IEnemy warrior = factory.createEnemy();
        IArmor heavyArmor = factory.createArmor();
        IWeapon axe = factory.createWeapon();

        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MagusFactory();
        IEnemy magus = factory.createEnemy();
        IArmor robe = factory.createArmor();
        IWeapon wizardStaff = factory.createWeapon();

        magus.attack();
        robe.protect();
        wizardStaff.damage();


    }
}
