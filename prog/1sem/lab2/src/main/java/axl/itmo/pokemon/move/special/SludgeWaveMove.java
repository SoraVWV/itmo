package axl.itmo.pokemon.move.special;

import ru.ifmo.se.pokemon.*;

public class SludgeWaveMove extends SpecialMove {

    private static final double POWER = 95;
    private static final double ACCURACY = 100;
    private static final double POISON_CHANCE = 0.1;

    public SludgeWaveMove() {
        super(Type.POISON, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < POISON_CHANCE) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "uses Sludge Wave";
    }
}