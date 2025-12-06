package axl.itmo.pokemon.move.status;

import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove {

    private static final double POWER = 0;
    private static final double ACCURACY = 100;

    public RestMove() {
        super(Type.PSYCHIC, POWER, ACCURACY);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        pokemon.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return "uses Rest!";
    }
}