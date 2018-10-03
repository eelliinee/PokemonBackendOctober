package nl.mizora.pokemon.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.mizora.pokemon.domein.Attack;

@Component
public interface AttackRepository extends CrudRepository<Attack, Long>{

}
