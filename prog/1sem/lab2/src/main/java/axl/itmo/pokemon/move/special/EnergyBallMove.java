package axl.itmo.pokemon.move.special;

import ru.ifmo.se.pokemon.*;

public class EnergyBallMove extends SpecialMove {

    private static final double POWER = 90;
    private static final double ACCURACY = 100;
    private static final double EFFECT_CHANCE = 0.1;
    private static final int SP_DEF_REDUCTION = -1;

    public EnergyBallMove() {
        super(Type.GRASS, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < EFFECT_CHANCE) {
            p.setMod(Stat.SPECIAL_DEFENSE, SP_DEF_REDUCTION);
        }
    }

    @Override
    protected String describe() {
        return "uses Energy Ball";
    }
}