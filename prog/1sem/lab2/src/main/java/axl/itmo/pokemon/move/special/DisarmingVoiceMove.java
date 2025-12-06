package axl.itmo.pokemon.move.special;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoiceMove extends SpecialMove {

    private static final double POWER = 40;
    private static final double ACCURACY = 100;

    public DisarmingVoiceMove() {
        super(Type.FAIRY, POWER, ACCURACY);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "uses Disarming Voice";
    }
}