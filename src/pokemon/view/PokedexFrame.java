package pokemon.view;
import java.awt.image.SampleModel;

import javax.swing.JFrame;

public class PokedexFrame<GUIController> extends JFrame
{
	private GUIController PokedexPanel;
	private SampleModel PokedexPanel;
	
	public void SampleFrame(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPage(PokedexPanel);
		this.setTitle("MY GUI APP");
		this.setSize(1000,  500);
		this.setResizable(false);
		this.setVisible(true);
	}
	

}
