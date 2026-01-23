package com.front_backend.pokedexAPI.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.front_backend.pokedexAPI.model.Pokemon;
import com.front_backend.pokedexAPI.model.NoteUpdate;
import com.front_backend.pokedexAPI.service.JpaPokemonDetailsService;

@RestController
public class PokedexController {

    private JpaPokemonDetailsService jpaPokemonDetailsService;

    @Autowired
    public PokedexController(JpaPokemonDetailsService jpaPokemonDetailsService) {
        this.jpaPokemonDetailsService = jpaPokemonDetailsService;
    }

    @GetMapping("/pokedex/by-name")
    public Iterable<Pokemon> getPokedexByName() {
        return jpaPokemonDetailsService.loadPokemonByName();
    }

    @GetMapping("/pokedex/by-date")
    public Iterable<Pokemon> getPokedexByDate() {
        return jpaPokemonDetailsService.loadPokemonByDate();
    }

    @PostMapping("/pokedex")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return jpaPokemonDetailsService.addToPokedex(pokemon);
    }

    /*
     * https://www.geeksforgeeks.org/springboot/spring-deletemapping-and-putmapping-
     * annotation/
     */
    @PutMapping("/pokedex/{id}")
    public void updatePokedexNote(@PathVariable UUID id, @RequestBody NoteUpdate noteupdate) {
        System.out.println("WHAT I GOT" + noteupdate.getNoteUpdate());
        jpaPokemonDetailsService.modifyPokedexEntry(noteupdate.getNoteUpdate(), id);
    }

    @DeleteMapping("/pokedex/{id}")
    public void deletePokemon(@PathVariable UUID id) {
        jpaPokemonDetailsService.deleteFromPokedex(id);
    }
}
