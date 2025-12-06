package axl.itmo.pokemon.pokemon;

import axl.itmo.pokemon.move.physical.RockTombMove;
import axl.itmo.pokemon.move.physical.StoneEdgeMove;
import axl.itmo.pokemon.move.special.SludgeWaveMove;
import axl.itmo.pokemon.move.status.RestMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class LandorusPokemon extends Pokemon {

    private static final double
            HP = 89,
            ATTACK = 125,
            DEFENCE = 90,
            SPECIAL_ATTACK = 115,
            SPECIAL_DEFENCE = 80,
            SPEED = 101;

    public LandorusPokemon(String name, int level) {
        super(name, level);

        setType(Type.GROUND, Type.FLYING);
        setStats(HP, ATTACK, DEFENCE, SPECIAL_ATTACK, SPECIAL_DEFENCE, SPEED);

        addMove(new StoneEdgeMove());
        addMove(new RockTombMove());
        addMove(new SludgeWaveMove());
        addMove(new RestMove());
    }
}
