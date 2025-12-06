package axl.itmo.pokemon.move.physical;

import ru.ifmo.se.pokemon.*;

public class FacadeMove extends PhysicalMove {

    private static final double POWER = 70;
    private static final double ACCURACY = 100;
    private static final double BURN_MULTIPLIER = 4.0; // Компенсирует уменьшение атаки от ожога (0.5 * 4 = 2.0)
    private static final double STATUS_MULTIPLIER = 2.0;

    public FacadeMove() {
        super(Type.NORMAL, POWER, ACCURACY);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status condition = att.getCondition();
        if (condition == Status.BURN) {
            return super.calcBaseDamage(att, def) * BURN_MULTIPLIER;
        } else if (condition == Status.PARALYZE || condition == Status.POISON) {
            return super.calcBaseDamage(att, def) * STATUS_MULTIPLIER;
        }

        return super.calcBaseDamage(att, def);
    }

    @Override
    protected String describe() {
        return "uses Facade";
    }
}