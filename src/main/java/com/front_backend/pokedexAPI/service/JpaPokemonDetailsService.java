package com.front_backend.pokedexAPI.service;

import org.springframework.stereotype.Service;

import com.front_backend.pokedexAPI.model.Pokemon;
import com.front_backend.pokedexAPI.repository.PokemonRepository;

@Service
public class JpaPokemonDetailsService {
    
    
    private final PokemonRepository pokemonRepository;

    public JpaPokemonDetailsService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Iterable<Pokemon> loadPokemonDetails() throws Exception {
        return pokemonRepository.findAll();
    }
}
