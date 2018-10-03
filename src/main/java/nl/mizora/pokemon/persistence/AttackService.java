package nl.mizora.pokemon.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.mizora.pokemon.domein.Attack;

@Service
@Transactional
public class AttackService {
	@Autowired
	private AttackRepository attackRepository;
	
	public Iterable<Attack>showAllAttacks(){
		return attackRepository.findAll();
	}
	
	public Optional<Attack>indvidualAttack(long id){
		return attackRepository.findById(id);
	}
	
	public Attack saveAttack(Attack attack) {
		return attackRepository.save(attack);
	}
	
	public void forgetAttack(Long id) {
		attackRepository.deleteById(id);
	}
	
}
