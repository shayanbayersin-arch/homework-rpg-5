package com.narxoz.rpg.adapter;

public interface Combatant {

    String getName();
    int getHealth();
    int getAttackPower();
    void takeDamage(int dmg);
    boolean isAlive();
}