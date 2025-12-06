package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.physical.FacadeMove;
import axl.itmo.pokemon.move.physical.RockSlideMove;
import axl.itmo.pokemon.move.special.BugBuzzMove;
import axl.itmo.pokemon.move.status.RestMove;
import ru.ifmo.se.pokemon.Type;

public final class FlygonPokemon extends VibravaPokemon {

    private static final double
            HP = 80,
            ATTACK = 100,
            DEFENCE = 80,
            SPECIAL_ATTACK = 80,
            SPECIAL_DEFENCE = 80,
            SPEED = 100;

    public FlygonPokemon(String name, int level) {
        super(name, level);

        setType(Type.GROUND, Type.DRAGON);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new RestMove());
        addMove(new FacadeMove());
        addMove(new BugBuzzMove());
        addMove(new RockSlideMove());
    }
}
