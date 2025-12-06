package axl.itmo.pokemon.move.status;

import ru.ifmo.se.pokemon.*;

public class CharmMove extends StatusMove {

    private static final double ACCURACY = 100;
    private static final int ATTACK_REDUCTION = -2;

    public CharmMove() {
        super(Type.FAIRY, 0, ACCURACY);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, ATTACK_REDUCTION);
    }

    @Override
    protected String describe() {
        return "uses Charm";
    }
}