package axl.itmo.pokemon;

import axl.itmo.pokemon.pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        LandorusPokemon landorus = new LandorusPokemon("1", 50);
        TrapinchPokemon trapinch = new TrapinchPokemon("2", 40);
        MeowsticMalePokemon meowstic = new MeowsticMalePokemon("3", 50);

        b.addAlly(landorus);
        b.addAlly(trapinch);
        b.addAlly(meowstic);

        FlygonPokemon flygon = new FlygonPokemon("4", 50);
        VibravaPokemon vibrava = new VibravaPokemon("5", 45);
        EspurrPokemon espurr = new EspurrPokemon("6", 40);

        b.addFoe(flygon);
        b.addFoe(vibrava);
        b.addFoe(espurr);

        // Запуск боя
        b.go();
    }

}
