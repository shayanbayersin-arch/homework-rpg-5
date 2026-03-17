package com.narxoz.rpg.decorator;

public class BasicAttack implements AttackAction {
    @Override
    public String getActionName() {
        return "Strike";
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public String getEffectSummary() {
        return "No effects";
    }
}

