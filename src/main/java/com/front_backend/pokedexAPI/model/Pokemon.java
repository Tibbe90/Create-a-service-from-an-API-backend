package com.front_backend.pokedexAPI.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pokedexId;
    private String name;
    private int pokeApiId;

    public Pokemon(String name, int pokeApiId) {
        this.name = name;
        this.pokeApiId = pokeApiId;
    }

    public UUID getPokedexId() {
        return pokedexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokeApiId() {
        return pokeApiId;
    }

    public void setPokeApiId(int pokeApiId) {
        this.pokeApiId = pokeApiId;
    }
    
}
