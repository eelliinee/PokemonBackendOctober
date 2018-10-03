package nl.mizora.pokemon.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attack {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String type;
	private int power;
	private int missChance;
	private int maxPP;
	private int currentPP = maxPP;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getMissChance() {
		return missChance;
	}
	public void setMissChance(int missChance) {
		this.missChance = missChance;
	}
	
	public int getMaxPP() {
		return maxPP;
	}
	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}
	
	public int getCurrentPP() {
		return currentPP;
	}
	public void setCurrentPP(int currentPP) {
		this.currentPP = currentPP;
	}
	
	
}
