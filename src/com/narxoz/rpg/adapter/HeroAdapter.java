package com.narxoz.rpg.adapter;

import com.narxoz.rpg.hero.HeroProfile;

public class HeroAdapter implements Combatant {

    private final HeroProfile hero;

    public HeroAdapter(HeroProfile hero) {
        this.hero = hero;
    }

    public String getName() { return hero.getName(); }

    public int getHealth() { return hero.getHealth(); }

    public int getAttackPower() { return 10; }

    public void takeDamage(int dmg) { hero.takeDamage(dmg); }

    public boolean isAlive() { return hero.isAlive(); }
}