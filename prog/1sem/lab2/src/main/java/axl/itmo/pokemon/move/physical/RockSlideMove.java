package axl.itmo.pokemon.move.physical;

import ru.ifmo.se.pokemon.*;

public class RockSlideMove extends PhysicalMove {

    private static final double POWER = 75;
    private static final double ACCURACY = 90;
    private static final double FLINCH_CHANCE = 0.3;

    public RockSlideMove() {
        super(Type.ROCK, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < FLINCH_CHANCE) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "uses Rock Slide";
    }
}