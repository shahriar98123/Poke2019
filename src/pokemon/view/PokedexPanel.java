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
	/**
	 * @wbp.nonvisual location=330,41
	 */
	private final JTextField healthField_1 = new JTextField();
	
	public PokedexPanel(PokedexController app)
	{
		super();
		healthField_1.setColumns(10);
		this.app = app;
		
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
		imageLabel = new JLabel("Pokemon goes here");
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
	}
	
	private void setupDropDown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void add(JLabel healthLabel2) {
		// TODO Auto-generated method stub
		
	}

	private void add(JTextField healthField2) {
		// TODO Auto-generated method stub
		
	}

	private void add(JComboBox pokedexDropdown2) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(SpringLayout appLayout2) {
		// TODO Auto-generated method stub
		
	}

	private void setupLayout()
	
	private void setupListeners()
	{
		
	}

	public Object getComponents() {
		// TODO Auto-generated method stub
		return null;
	}

}
