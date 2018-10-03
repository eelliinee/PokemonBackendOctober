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

import nl.mizora.pokemon.domein.Attack;
import nl.mizora.pokemon.persistence.AttackService;

@RestController
public class AttackEndpoint {
	@Autowired
	private AttackService attackService;
	
	@GetMapping("attack")
	public Iterable<Attack> moveCollection(){
		return attackService.showAllAttacks();
	}
	
	@PostMapping("attack")
	public Attack inventAttack(@RequestBody Attack attack) {
		return attackService.saveAttack(attack);
	}
	
	@PutMapping("attack")
	public Attack changeAttack(@RequestBody Attack attack) {
		return attackService.saveAttack(attack);
	}
	
	@DeleteMapping("attack/{id}")
	public void forgetAttack(@PathVariable Long id) {
		attackService.forgetAttack(id);
	}
	
	@GetMapping("attack/{id}")
	public Optional<Attack>invidualAttack(@PathVariable Long id){
		return attackService.indvidualAttack(id);
	}
	
}
