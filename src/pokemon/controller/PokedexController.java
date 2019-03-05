package pokemon.controller;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import javax.swing.JOptionPane;
import pokemon.model.*;

public class PokedexController 
{
	private String saveFile = "backup.pokemon";
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

	

	public void updatePokemon(int index, String[] data) {
	
	}
	
	
	public void addPokemon()
	public void start()
	public ArrayList<Pokemon> getPokemonList()
	public PokedexFrame getFrame()
	public boolean isDouble(String text)
	public boolean isDouble(String text)
	public boolean isInt(String text)
	poublic void updatePokemon(int index, String [] data)
	public String[] buildPokedexText()
	public void savePokedex()
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
			
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			inputClose();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException error)
		{
			
			JOptionPane.showMessageDialog(appFrame,  "No Save file",  "Loading Pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (ClassNotFoundException pokemonError)
		{
			JOptionPane.showMessageDialog(appFrame,  pokemonError.getMessage(), "Type error", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	public void start()
	public ArrayList<Pokemon> getPokemonList()
	public PokedexFrame getFrame()
	public boolean isDouble(String text)
	public boolean isInt(String text)
	public void updatePokemon(int index, String [] data)
	public String [] getPokeData(int index)
	{
		String [] data = new String [6];
		data[0] = current.getAttackPoints() + "";
		data[1] = current.getEnhancementModifier() + "";
		data[2] = current.getHealthPoints()+ "";
		data[3] = current.getName() + "";
		data[4] = current.isCanEvolve() + "";
		data[5] = current.getNumber() + "";
		return data;
	
	}
	
	public String[] buildPokedexText()
	
	public void saePokedex()

	private void loadPokedex()
	}

