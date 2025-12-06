package axl.itmo.pokemon.move.special;

import ru.ifmo.se.pokemon.*;

public class DreamEaterMove extends SpecialMove {

    private static final double POWER = 100;
    private static final double ACCURACY = 100;
    private static final double HEAL_RATIO = 0.5;

    public DreamEaterMove() {
        super(Type.PSYCHIC, POWER, ACCURACY);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return def.getCondition() == Status.SLEEP && super.checkAccuracy(att, def);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        // Отрицательное значение для лечения
        int healAmount = -(int) Math.round(damage * HEAL_RATIO);
        att.setMod(Stat.HP, healAmount);
    }

    @Override
    protected String describe() {
        return "uses Dream Eater";
    }
}