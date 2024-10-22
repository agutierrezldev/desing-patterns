package org.agutierrezl.creational.abstractfactory.armor;

public class HeavyArmor implements IArmor{

    @Override
    public void protect() {
        System.out.println("heavy armor protect!!");
    }
}
