package model;

import model.base.Hero;
import model.weapon.base.Weapon;

public class Magic extends Hero {
    public Magic(String name) {
        super(100.0, 1, 15.0, 250.0, name, "Magic");
    }

    public double hit(Hero otherHero) {
        return 0.0;
    }

    @Override
    public void takeWeapon(Weapon weapon) {

    }
}
