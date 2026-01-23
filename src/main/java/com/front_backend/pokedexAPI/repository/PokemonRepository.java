package com.front_backend.pokedexAPI.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.front_backend.pokedexAPI.model.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, UUID> {

    //Created a custom find all query to be able to return a 
    //List instead of a Iterable because I wanted to use List.sort in the service java
@Query ("SELECT p FROM Pokemon p")
List<Pokemon> findAllList();
    
}
