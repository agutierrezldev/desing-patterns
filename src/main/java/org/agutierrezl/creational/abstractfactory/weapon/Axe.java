package org.agutierrezl.creational.abstractfactory.weapon;

public class Axe implements IWeapon{

    @Override
    public void damage() {
        System.out.println("Axe damage!!");
    }
}
