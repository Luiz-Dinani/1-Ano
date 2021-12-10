package br.com.sptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @GetMapping()
    public Pokemon getPokemon(){
        Pokemon pokemon = new Pokemon();
        pokemon.setNome("Charmander");
        pokemon.setTipo("Fogo");

        return pokemon;
    }

    @GetMapping("/listaPokemons")
    public List<Pokemon> listar(){
        List<Pokemon> pokemons = Arrays.asList(
            new Pokemon("Pikachu","Raio"),
            new Pokemon("Charizard","Fogo")
        );
        return  pokemons;
    }
}