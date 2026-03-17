package com.narxoz.rpg.bridge;

public class FireEffect implements EffectImplementor {

    public int applyEffect(int baseDamage) {
        return baseDamage + 5;
    }
}