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

import nl.mizora.pokemon.domein.Pokemon;
import nl.mizora.pokemon.persistence.PokemonService;

@RestController
public class PokemonEndpoint {
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("pokemon")
	public Iterable<Pokemon> pokebox(){
		return pokemonService.showAllPokemon();
	}
	
	@PostMapping("pokemon")
	public Pokemon catchPokemon(@RequestBody Pokemon pokemon) {
		return pokemonService.savePokemon(pokemon);
	}
	
	@PutMapping("pokemon")
	public Pokemon statsChangePokemon(@RequestBody Pokemon pokemon) {
		return pokemonService.savePokemon(pokemon);
	}
	
	@DeleteMapping("pokemon/{id}")
	public void releasePokemon(@PathVariable Long id) {
		pokemonService.releasePokemon(id);
	}

	@GetMapping("pokemon/{id}")
	public Optional<Pokemon> individualPokemon(@PathVariable Long id){
		return pokemonService.individualPokemon(id);
	}
	
}
