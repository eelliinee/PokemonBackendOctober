package nl.mizora.pokemon.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String species;
	private int level;
	private String type;
	
	private int baseHP;
	private int baseAttack;
	private int baseDefense;
	private int baseSpeed;
	
	private int maxHP =  (baseHP*2*level/100)+level+10;
	private int maxAttack =  (baseAttack*2*level/100)+5;
	private int maxDefense = (baseDefense*2*level/100)+5;
	private int maxSpeed = (baseSpeed*2*level/100)+5;

	private int currentHP = maxHP;
	private int currentAttack = maxAttack;
	private int currentDefense = maxDefense;
	private int currentSpeed = maxSpeed;

	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getMaxAttack() {
		return maxAttack;
	}
	public void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}
	public int getMaxDefense() {
		return maxDefense;
	}
	public void setMaxDefense(int maxDefense) {
		this.maxDefense = maxDefense;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getCurrentAttack() {
		return currentAttack;
	}
	public void setCurrentAttack(int currentAttack) {
		this.currentAttack = currentAttack;
	}
	public int getCurrentDefense() {
		return currentDefense;
	}
	public void setCurrentDefense(int currentDefense) {
		this.currentDefense = currentDefense;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
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
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
