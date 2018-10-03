package nl.mizora.pokemon.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.mizora.pokemon.domein.Pokedex;

@Component
public interface PokedexRepository extends CrudRepository<Pokedex, Long>{

}
