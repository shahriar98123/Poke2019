package pokemon.view;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pokemon.controller.PokedexController;

public class PokedexPanel 
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/Pikachu.jpg"));
		
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		numberField = new JTextField("My pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		healthLabel = new JLabel("This pokemon health is");
		numberLabel = new JLabel("This pokemon number is");
		
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon attack level is");
		enhanceLabel = new JLabel("This pokemon enhancement level is");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("Pokemon goes here", pokemonIcon, JLabel.CENTER);
		changeButton = new JButton("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox();
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupDropdown() {
		// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(pokedexDropdown);
		this.add(healthField);
		this.add(numberField);
		this.add(evolveField);
		this.add(enhancementField);
		this.add(attackField);
		this.add(nameField);
		
		this.add(healthLabel);
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(enhanceLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(imageLabel);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	
	private void setupDropDown()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void repaint() {
		// TODO Auto-generated method stub
		
	}

	private void add(JLabel healthLabel2) 
	{
		// TODO Auto-generated method stub
		
	}

	private void add(JTextField healthField2) 
	{
		// TODO Auto-generated method stub
		
	}

	private void add(JComboBox pokedexDropdown2) 
	{
		// TODO Auto-generated method stub
		
	}

	private void setLayout(SpringLayout appLayout2) 
	{
		// TODO Auto-generated method stub
		
	}

	private void setupLayout()
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(app.isInt(attackField.getText()) && app.isDouble(enhancementField.getText()) && app.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			app.updatePokemon(index, data);
		}
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
			}
				});
		
		pokedexDropdown.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}

			private void changeImageDisplay(String name) {
				// TODO Auto-generated method stub
				
			}
				});
		
	}

	public Object getComponents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
