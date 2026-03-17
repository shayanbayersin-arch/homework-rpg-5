package com.narxoz.rpg.bridge;

public class Skill {

    private EffectImplementor effect;

    public Skill(EffectImplementor effect) {
        this.effect = effect;
    }

    public int use(int baseDamage) {
        return effect.applyEffect(baseDamage);
    }
}