package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.special.DisarmingVoiceMove;
import axl.itmo.pokemon.move.special.DreamEaterMove;
import axl.itmo.pokemon.move.special.EnergyBallMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class EspurrPokemon extends Pokemon {

    private static final double
            HP = 62,
            ATTACK = 48,
            DEFENCE = 54,
            SPECIAL_ATTACK = 63,
            SPECIAL_DEFENCE = 60,
            SPEED = 68;

    public EspurrPokemon(String name, int level) {
        super(name, level);

        setType(Type.PSYCHIC);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new DreamEaterMove());
        addMove(new DisarmingVoiceMove());
        addMove(new EnergyBallMove());
    }
}
