package projet_java.Bestiole.java_Bestiole.GUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.Cursor;


public class FramePlateau extends Frame 
{
	private Lance  ctlr;

	public FramePlateau (Lance  ctl )
	{
		this.ctlr  = ctl;
		this.setTitle   ( "Plateau" );
		this.setSize    ( 1400,700 );
		this.setLocation(  50, 50 );

		this.add ( new PanelPlateau() );

		// Gestion de la fermture de la fenêtre
		this.addWindowListener( new WindowAdapter(){ public void windowClosing(WindowEvent e){System.exit(0);} } );

		this.setVisible(true);
	}
}