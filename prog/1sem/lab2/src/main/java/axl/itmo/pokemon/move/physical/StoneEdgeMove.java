package axl.itmo.pokemon.move.physical;

import ru.ifmo.se.pokemon.*;

public class StoneEdgeMove extends PhysicalMove {

    private static final double POWER = 100;
    private static final double ACCURACY = 80;
    private static final double CRIT_CHANCE = 0.125;
    private static final double CRIT_MULTIPLIER = 2.0;
    private static final double NORMAL_MULTIPLIER = 1.0;

    public StoneEdgeMove() {
        super(Type.ROCK, POWER, ACCURACY);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < CRIT_CHANCE) {
            return CRIT_MULTIPLIER;
        } else {
            return NORMAL_MULTIPLIER;
        }
    }

    @Override
    protected String describe() {
        return "uses Stone Edge";
    }
}