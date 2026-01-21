package com.front_backend.pokedexAPI.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.front_backend.pokedexAPI.model.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, UUID> {
    
}
