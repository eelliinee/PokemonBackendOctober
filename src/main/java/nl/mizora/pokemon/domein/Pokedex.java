package nl.mizora.pokemon.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokedex {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String species;
	private String type;
	
	private int baseHP;
	private int baseAttack;
	private int baseDefense;
	private int baseSpeed;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBaseHP() {
		return baseHP;
	}
	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}
	public int getBaseAttack() {
		return baseAttack;
	}
	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}
	public int getBaseDefense() {
		return baseDefense;
	}
	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}
	public int getBaseSpeed() {
		return baseSpeed;
	}
	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
}
