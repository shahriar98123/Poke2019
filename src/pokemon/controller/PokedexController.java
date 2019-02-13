package pokemon.controller;

import java.util.ArrayList;

public class PokedexController 
{
	
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Eevee());
		pokemonList.add(new Magenmite());
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()

}

	public String[] buildPokedexText() {
		// TODO Auto-generated method stub
		return null;
	}
