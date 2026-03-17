package com.narxoz.rpg.singleton;

public class GameConfig {

    private static GameConfig instance;

    private int maxRounds = 10;

    private GameConfig() {}

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public int getMaxRounds() {
        return maxRounds;
    }
}