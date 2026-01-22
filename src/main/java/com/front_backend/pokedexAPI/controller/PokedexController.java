package com.front_backend.pokedexAPI.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.front_backend.pokedexAPI.model.Pokemon;
import com.front_backend.pokedexAPI.service.JpaPokemonDetailsService;

@RestController
public class PokedexController {
    
    private JpaPokemonDetailsService jpaPokemonDetailsService;

    @Autowired
    public PokedexController(JpaPokemonDetailsService jpaPokemonDetailsService){
        this.jpaPokemonDetailsService = jpaPokemonDetailsService;
    }

    @GetMapping("/pokedex")
    public Iterable<Pokemon> getPokedex() {
        return jpaPokemonDetailsService.loadPokemonDetails();
    }

    @PostMapping("/pokedex")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return jpaPokemonDetailsService.addToPokedex(pokemon);
    }

    @DeleteMapping("/pokedex/{id}")
    public void deletePokemon(@PathVariable UUID id) {
        jpaPokemonDetailsService.deleteFromPokedex(id);
    }
}
