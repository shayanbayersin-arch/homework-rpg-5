package com.narxoz.rpg.decorator;

import com.narxoz.rpg.bridge.FireEffect;
import com.narxoz.rpg.bridge.Skill;

public class FireRuneDecorator extends ActionDecorator {
    public FireRuneDecorator(AttackAction wrappedAction) {
        super(wrappedAction);
    }

    @Override
    public String getActionName() {
        return super.getActionName();
    }
    @Override
    public String getEffectSummary() {
        return super.getEffectSummary();
    }
    @Override
    public int getDamage() {
    Skill skill = new Skill(new FireEffect());
    return skill.use(super.getDamage());
  }
}
