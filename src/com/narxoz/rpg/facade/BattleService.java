package com.narxoz.rpg.facade;

import com.narxoz.rpg.decorator.AttackAction;
import com.narxoz.rpg.enemy.BossEnemy;
import com.narxoz.rpg.hero.HeroProfile;
import com.narxoz.rpg.adapter.*;
import com.narxoz.rpg.singleton.GameConfig;

import java.util.Random;

public class BattleService {
    private Random random = new Random(1L);

    public BattleService setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public AdventureResult battle(HeroProfile hero, BossEnemy boss, AttackAction action) {

    AdventureResult result = new AdventureResult();

    Combatant heroC = new HeroAdapter(hero);
    Combatant bossC = new EnemyAdapter(boss);

    int rounds = 0;

    int maxRounds = GameConfig.getInstance().getMaxRounds();

    while (heroC.isAlive() && bossC.isAlive() && rounds < maxRounds) {

        rounds++;

        int dmg = action.getDamage() + random.nextInt(5);
        bossC.takeDamage(dmg);
        result.addLine(heroC.getName() + " deals " + dmg);

        if (!bossC.isAlive()) break;

        int bossDmg = bossC.getAttackPower() + random.nextInt(5);
        heroC.takeDamage(bossDmg);
        result.addLine(bossC.getName() + " deals " + bossDmg);
    }

    result.setRounds(rounds);
    result.setWinner(heroC.isAlive() ? "Hero" : "Boss");

    return result;
    }
}
