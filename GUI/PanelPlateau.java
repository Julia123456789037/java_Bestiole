package projet_java.Bestiole.java_Bestiole.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import projet_java.Bestiole.java_Bestiole.metier.CarteBestiole;
import projet_java.Bestiole.java_Bestiole.metier.PaquetBestiole;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.IOException;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;



public class PanelPlateau extends JPanel 
{
	private JLabel 			lblMessage;
	private PaquetBestiole	lstJoueur1;
	private PaquetBestiole	lstJoueur2;
	private PaquetBestiole 	lstCarte;
	private Lance			ctlr;
	private BufferedImage 	backgroundImage;


	public PanelPlateau(Lance ctl)
	{
		this.ctlr  = ctl;
		this.setBackground(new Color(206,154,82));

		try {
			// Charger l'image de fond
			backgroundImage = ImageIO.read(new File("C:\\Users\\justi\\Desktop\\JUSTINE\\projet info\\projet_java\\Bestiole\\java_Bestiole\\Image/Fond.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERREUR IMAGE");
		}

		this.setLayout(new FlowLayout());
		/* ---------------------------- */
		/* Création des composants      */
		/* ---------------------------- */

		//this.lblMessage  = new JLabel();
		//this.lblMessage.setBackground(Color.white);
		//this.lblMessage.setText (" Panneau du Plateau ");

		this.lstJoueur1   	= new PaquetBestiole(1);								//Arraylist vide par défaut
		this.lstJoueur2   	= new PaquetBestiole(1);	
		this.lstCarte	    = new PaquetBestiole(0);		//Arraylist de carte pleine changeant en fonction du int récup


		//JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\justi\\Desktop\\JUSTINE\\projet info\\projet_java\\Bestiole\\java_Bestiole\\Image/roue.png"));
        //imageLabel.setBounds(1000, 800, 50, 50); // Définir les coordonnées et la taille de l'image normale


		


		/* ---------------------------- */
		/* Postionnement des composants */
		/* ---------------------------- */
		//this.add( this.lblMessage );
		//this.add(imageLabel);


		/* ---------------------------- */
		/* Activation des composants    */
		/* ---------------------------- */ 




		this.setVisible(true);
	}


	/**
	 * Dessine la ligne pointillée dans le panneau.
	 *
	 * @param g L'objet Graphics utilisé pour dessiner la ligne.
	 */
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		// Dessiner l'image de fond
		if (backgroundImage != null) {
			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
		}

		try {
			// Charger l'image de fond
			g.drawImage( ImageIO.read(new File("C:\\Users\\justi\\Desktop\\JUSTINE\\projet info\\projet_java\\Bestiole\\java_Bestiole\\Image/roue.png")), 1050, 350, 300, 300, this);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERREUR IMAGE");
		}
		
		// Convertir l'objet Graphics en Graphics2D

		// Définir le motif du trait (pointillé)
		float[] dashPattern = {5.0f, 5.0f};
		BasicStroke dashStroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10.0f, dashPattern, 0.0f);

		// Appliquer le motif du trait au Graphics2D
		g2d.setStroke(dashStroke);

		// Dessiner la ligne pointillée
		int x1 = 0;
		int y1 = 350;
		int x2 = 1400;
		int y2 = 350;
		Line2D line = new Line2D.Double(x1, y1, x2, y2);
		g2d.draw(line);



		for (CarteBestiole c : this.lstCarte.getPaquet())
			g.drawImage(c.getImage(), c.getPosX()-50, c.getPosY(), this);
		
		if( this.lstJoueur1.taille() != 0 )
		{
			for(CarteBestiole c : this.lstJoueur1.getPaquet())
			try 
			{
				g.drawImage( ( ImageIO.read( new File("../Images/Dos.png") ) ), 800-50, 60, this);
			} catch (Exception ex) { System.out.println("Exception lors du chargement de l'image"); }
		}


	}

}
