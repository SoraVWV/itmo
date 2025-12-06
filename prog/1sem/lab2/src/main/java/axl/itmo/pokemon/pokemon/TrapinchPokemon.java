package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.physical.FacadeMove;
import axl.itmo.pokemon.move.status.RestMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class TrapinchPokemon extends Pokemon {

    private static final double
            HP = 45,
            ATTACK = 100,
            DEFENCE = 45,
            SPECIAL_ATTACK = 45,
            SPECIAL_DEFENCE = 45,
            SPEED = 10;

    public TrapinchPokemon(String name, int level) {
        super(name, level);

        setType(Type.GROUND);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new RestMove());
        addMove(new FacadeMove());
    }
}
