package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.physical.FacadeMove;
import axl.itmo.pokemon.move.special.BugBuzzMove;
import axl.itmo.pokemon.move.status.RestMove;
import ru.ifmo.se.pokemon.Type;

public class VibravaPokemon extends TrapinchPokemon {

    private static final double
            HP = 50,
            ATTACK = 70,
            DEFENCE = 50,
            SPECIAL_ATTACK = 50,
            SPECIAL_DEFENCE = 50,
            SPEED = 70;

    public VibravaPokemon(String name, int level) {
        super(name, level);

        setType(Type.GROUND, Type.DRAGON);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new RestMove());
        addMove(new FacadeMove());
        addMove(new BugBuzzMove());
    }
}
