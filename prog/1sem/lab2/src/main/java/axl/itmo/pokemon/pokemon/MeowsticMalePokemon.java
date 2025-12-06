package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.special.DisarmingVoiceMove;
import axl.itmo.pokemon.move.special.DreamEaterMove;
import axl.itmo.pokemon.move.special.EnergyBallMove;
import axl.itmo.pokemon.move.status.CharmMove;
import ru.ifmo.se.pokemon.Type;

public final class MeowsticMalePokemon extends EspurrPokemon {

    private static final double
            HP = 74,
            ATTACK = 48,
            DEFENCE = 76,
            SPECIAL_ATTACK = 83,
            SPECIAL_DEFENCE = 81,
            SPEED = 104;

    public MeowsticMalePokemon(String name, int level) {
        super(name, level);

        setType(Type.PSYCHIC);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new DreamEaterMove());
        addMove(new DisarmingVoiceMove());
        addMove(new EnergyBallMove());
        addMove(new CharmMove());
    }
}
