package projet_java.Bestiole.java_Bestiole;

import projet_java.Bestiole.java_Bestiole.*;

public class Lance 
{

    //private FrameJoueur   frameJoueur1;
    //private FrameJoueur   frameJoueur2;
	private FramePlateau  framePlateau;


	public Lance()
	{
		this.framePlateau = new FramePlateau(this);
	}

    public static void main(String[] a){ new Lance(); }
    
}
