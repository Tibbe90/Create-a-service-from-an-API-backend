package com.front_backend.pokedexAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        System.out.println("user body" + pokemon);
        return jpaPokemonDetailsService.addToPokedex(pokemon);
    }
}
