
package test;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Game extends JFrame {
	
	public static void main(String[] args) {

		new Game();

	}

	public Game() {
		
		

		super("The lonely Wanderer");
		
		String[] questions = { "DU BEFINDEST DICH IN EINEM DUNKLEN WALD",
				   "DU HAST DURST UND TRIFFST AUF EINEN KLEINEN BACH" 
				 };

		String[][] decisions = { 
					 { "WARTEN","TIEFER IN DEN WALD" },
					 {"TRINKEN","WEITER GEHEN"} 							 
					 };

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, 0, 1430, 600);
		setResizable(true);
		ImageIcon image = new ImageIcon("REY AYANAMI.png");
		setIconImage(image.getImage());
		
		

		Gamepanel panel = new Gamepanel();
		panel.setBackground(new Color(58, 58, 58));
		panel.setBounds(0, 0, 1430, 600);
		
		
		add(panel);
		
		setVisible(true);

	}

	

}
