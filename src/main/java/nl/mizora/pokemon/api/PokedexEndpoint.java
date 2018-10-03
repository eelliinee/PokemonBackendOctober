package nl.mizora.pokemon.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.mizora.pokemon.domein.Pokedex;
import nl.mizora.pokemon.persistence.PokedexService;

@RestController
public class PokedexEndpoint {
	@Autowired
	private PokedexService pokedexService;
	
	@GetMapping("pokedex")
	public Iterable<Pokedex> completePokedex(){
		return pokedexService.showAllSpecies();
	}
	
	@PostMapping("pokedex")
	public Pokedex createSpecies(@RequestBody Pokedex pokedex) {
		return pokedexService.saveSpecies(pokedex);
	}
	
	@PutMapping("pokedex")
	public Pokedex changeSpecies(@RequestBody Pokedex pokedex) {
		return pokedexService.saveSpecies(pokedex);
	}
	
	@DeleteMapping("pokedex/{id}")
	public void extinctSpecies(@PathVariable Long id) {
		pokedexService.extinctSpecies(id);
	}
	
	@GetMapping("pokedex/{id}")
	public Optional<Pokedex> specificSpecies(@PathVariable Long id){
		return pokedexService.specificSpecies(id);
	}
}