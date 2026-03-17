package com.narxoz.rpg.adapter;

import com.narxoz.rpg.enemy.BossEnemy;

public class EnemyAdapter implements Combatant {

    private final BossEnemy boss;

    public EnemyAdapter(BossEnemy boss) {
        this.boss = boss;
    }

    public String getName() { return boss.getName(); }

    public int getHealth() { return boss.getHealth(); }

    public int getAttackPower() { return boss.getAttackPower(); }

    public void takeDamage(int dmg) { boss.takeDamage(dmg); }

    public boolean isAlive() { return boss.isAlive(); }
}