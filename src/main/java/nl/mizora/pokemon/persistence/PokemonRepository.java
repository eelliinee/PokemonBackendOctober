package nl.mizora.pokemon.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.mizora.pokemon.domein.Pokemon;

@Component
public interface PokemonRepository extends CrudRepository<Pokemon, Long>{

}
