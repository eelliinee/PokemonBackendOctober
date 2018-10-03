package nl.mizora.pokemon.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.mizora.pokemon.domein.Pokemon;

@Service
@Transactional
public class PokemonService {
	@Autowired
	private PokemonRepository pokemonRepository;
	
	public Iterable<Pokemon> showAllPokemon(){
		return pokemonRepository.findAll();
	}
	
	public Optional<Pokemon> individualPokemon(Long id){
		return pokemonRepository.findById(id);
	}
	
	public Pokemon savePokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public void releasePokemon(Long id) {
		pokemonRepository.deleteById(id);
	}

}
