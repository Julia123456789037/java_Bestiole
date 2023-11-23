package projet_java.Bestiole.java_Bestiole.metier;

import java.io.File;
import javax.imageio.ImageIO;

import java.awt.Image;


/** Carte du jeux de crapet 
 * Cette classe permet de créer une carte du jeux de crapet.
 * @author Justine BONDU
*  @version 1 du 09/11/2023
*/

public class CarteBestiole
{
    private static	int			num = 0;
	private static  String[]	typeSigne = {"Eléphant", "Renard", "Chat", "Souris"};
	private  		int			ident;
    private  		String		signe;
	private  		int			posX; 
	private  		int			posY;
	private	 		Image		image;

    public CarteBestiole()
    {
		this.ident = this.num;
		this.num = this.num + 1;

        if ( this.ident < 10 ) 								{ this.signe=typeSigne[0]; } 
        else if ( this.ident > 9  && this.ident < 20 	) 	{ this.signe=typeSigne[1]; }
        else if ( this.ident > 19 && this.ident < 30 	)	{ this.signe=typeSigne[2]; }
        else if ( this.ident > 29 && this.ident < 40 	)	{ this.signe=typeSigne[3]; }


		setImage();
    }

	public void 			resetNUM	() 		{ this.num = 0; 		}
	public int				getIdent	() 		{ return this.ident;	}
    public String			getSigne	() 		{ return this.signe; 	}
    public void 			setPosX		(int x) { this.posX = x; 		}
    public void 			setPosY		(int y) { this.posY = y; 		}
    public int  			getPosX		() 		{ return this.posX; 	}
    public int  			getPosY		()		{ return this.posY; 	}
	public Image			getImage	()		{ return this.image;	}


	public void setImage()
	{
		try 
		{
			this.image = ( ImageIO.read( new File("./carte/" + this.signe + ".png") ) );
		} catch (Exception ex) { System.out.println("Exception lors du chargement de l'image"); }
	}

    public String toString() 
    {
        return "[" + this.ident + "] " + this.signe + ":" + '\n'; 
    } 

    public static void main(String[] argv)
	{
		CarteBestiole        cart1, cart2, cart3, CarTempo;
		//cart1 = new Carte();

        for (int index = 0; index < 40; index++) 
        {
            CarTempo = new CarteBestiole();
            System.out.print(CarTempo);
        }

		System.out.println ();
	}

}