package nl.mizora.pokemon.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.mizora.pokemon.domein.Pokedex;

@Service
@Transactional
public class PokedexService {
	@Autowired
	private PokedexRepository pokedexRepository;
	
	public Iterable<Pokedex> showAllSpecies(){
		return pokedexRepository.findAll();
	}
	
	public Optional<Pokedex> specificSpecies(Long id){
		return pokedexRepository.findById(id);
	}
	
	public Pokedex saveSpecies(Pokedex pokedex) {
		return pokedexRepository.save(pokedex);
	}
	
	public void extinctSpecies(Long id) {
		pokedexRepository.deleteById(id);
	}

}
