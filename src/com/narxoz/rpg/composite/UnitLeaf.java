package com.narxoz.rpg.composite;

import com.narxoz.rpg.adapter.Combatant;

public class UnitLeaf implements CombatNode {

    private Combatant unit;

    public UnitLeaf(Combatant unit) {
        this.unit = unit;
    }

    public int getHealth() {
        return unit.getHealth();
    }

    public boolean isAlive() {
        return unit.isAlive();
    }
}