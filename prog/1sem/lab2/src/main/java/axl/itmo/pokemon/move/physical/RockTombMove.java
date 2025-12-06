package axl.itmo.pokemon.move.physical;

import ru.ifmo.se.pokemon.*;

public class RockTombMove extends PhysicalMove {

    private static final double POWER = 60;
    private static final double ACCURACY = 95;
    private static final int SPEED_REDUCTION = -1;

    public RockTombMove() {
        super(Type.ROCK, POWER, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, SPEED_REDUCTION);
    }

    @Override
    protected String describe() {
        return "uses Rock Tomb";
    }
}