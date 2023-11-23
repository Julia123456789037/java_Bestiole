package projet_java.Bestiole.java_Bestiole.GUI;

//import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Graphics;


public class PanelPlateau extends JPanel 
{
	private JLabel lblMessage;


	public PanelPlateau()
	{
		this.setBackground(new Color(206,154,82));

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
	/**
     * Dessine la ligne pointillée dans le panneau.
     *
     * @param g L'objet Graphics utilisé pour dessiner la ligne.
     */
    @Override
    protected void paintComponent(Graphics g) 
	{
        super.paintComponent(g);

        // Convertir l'objet Graphics en Graphics2D
        Graphics2D g2d = (Graphics2D) g;

        // Définir le motif du trait (pointillé)
        float[] dashPattern = {5.0f, 5.0f};
        BasicStroke dashStroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10.0f, dashPattern, 0.0f);

        // Appliquer le motif du trait au Graphics2D
        g2d.setStroke(dashStroke);

        // Dessiner la ligne pointillée
        int x1 = 80;
        int y1 = 80;
        int x2 = 250;
        int y2 = 250;
        Line2D line = new Line2D.Double(x1, y1, x2, y2);
        g2d.draw(line);
    }

}
