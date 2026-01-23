package com.front_backend.pokedexAPI.model;

import java.time.LocalDateTime;
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
    private String trainersNote;
    
    private int pokeApiId;
    private LocalDateTime catchDate;
    
    public Pokemon() {}
    
    public Pokemon(String name, String trainersNote, int pokeApiId) {
        this.name = name;
        this.trainersNote = trainersNote;
        this.pokeApiId = pokeApiId;
        catchDate = LocalDateTime.now();
    }
    
    public LocalDateTime getCatchDate() {
        return catchDate;
    }
    public void setCatchDate(LocalDateTime catchDate) {
        this.catchDate = catchDate;
    }

    public String getTrainersNote() {
        return trainersNote;
    }

    public void setTrainersNote(String trainersNote) {
        this.trainersNote = trainersNote;
    }

    public UUID getPokedexId() {
        return pokedexId;
    }
    public void setPokedexId(UUID pokedexId) {
        this.pokedexId = pokedexId;
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