package com.front_backend.pokedexAPI.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.front_backend.pokedexAPI.model.Pokemon;
import com.front_backend.pokedexAPI.repository.PokemonRepository;

@Service
public class JpaPokemonDetailsService {
    
    
    private final PokemonRepository pokemonRepository;

    public JpaPokemonDetailsService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon addToPokedex(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void deleteFromPokedex(UUID id) {
       pokemonRepository.deleteById(id);
    }

    public List<Pokemon> loadPokemonByName() {
        List<Pokemon> sortPokemon = pokemonRepository.findAllList();
        sortPokemon.sort(Comparator.comparing(Pokemon::getName));
        return sortPokemon;
    }

    public List<Pokemon> loadPokemonByDate() {
        List<Pokemon> sortPokemon = pokemonRepository.findAllList();
        for (Pokemon pokemon : sortPokemon) {
            System.out.println(pokemon.getName());
        }
        sortPokemon.sort(Comparator.comparing(Pokemon::getCatchDate));
        for (Pokemon pokemon : sortPokemon) {
            System.out.println(pokemon.getName());
        }
        return sortPokemon;
    }
}
