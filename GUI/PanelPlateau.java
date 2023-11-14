package projet_java.Bestiole.java_Bestiole.GUI;

//import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;

public class PanelPlateau extends JPanel 
{
	private JLabel lblMessage;


	public PanelPlateau()
	{

		this.setLayout(new FlowLayout());
		/* ---------------------------- */
		/* Création des composants      */
		/* ---------------------------- */

		this.lblMessage  = new JLabel();
		this.lblMessage.setBackground(Color.white);
		this.lblMessage.setText (" Panneau du Plateau ");
		


		/* ---------------------------- */
		/* Postionnement des composants */
		/* ---------------------------- */
		this.add( this.lblMessage );


		/* ---------------------------- */
		/* Activation des composants    */
		/* ---------------------------- */ 


	}
}
