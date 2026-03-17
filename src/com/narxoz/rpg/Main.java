package com.narxoz.rpg;

import com.narxoz.rpg.decorator.*;
import com.narxoz.rpg.facade.*;
import com.narxoz.rpg.hero.HeroProfile;
import com.narxoz.rpg.enemy.BossEnemy;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Homework 5 Demo: Decorator + Facade ===");

        // --- 1. Создаем героя и босса ---
        HeroProfile hero = new HeroProfile("Knight", 100);
        BossEnemy boss = new BossEnemy("Dragon", 80, 15);

        // --- 2. Базовая атака ---
        AttackAction baseAttack = new BasicAttack();

        System.out.println("\n--- Decorator Preview ---");
        System.out.println("Base action: " + baseAttack.getActionName());
        System.out.println("Base damage: " + baseAttack.getDamage());
        System.out.println("Base effects: " + baseAttack.getEffectSummary());

        // --- 3. Декораторы (stack) ---
        AttackAction enhancedAttack =
                new FireRuneDecorator(
                new PoisonCoatingDecorator(
                new CriticalFocusDecorator(baseAttack)));

        System.out.println("\nEnhanced action: " + enhancedAttack.getActionName());
        System.out.println("Enhanced damage: " + enhancedAttack.getDamage());
        System.out.println("Enhanced effects: " + enhancedAttack.getEffectSummary());

        // --- 4. Facade (вот сюда относится твой код) ---
        System.out.println("\n--- Facade Preview ---");

        DungeonFacade facade = new DungeonFacade();

        AdventureResult result = facade.runAdventure(hero, boss, enhancedAttack);

        // --- 5. Вывод результата ---
        System.out.println("Winner: " + result.getWinner());
        System.out.println("Rounds: " + result.getRounds());
        System.out.println("Reward: " + result.getReward());

        for (String line : result.getLog()) {
            System.out.println(line);
        }

        System.out.println("\n=== Demo Complete ===");
    }
}