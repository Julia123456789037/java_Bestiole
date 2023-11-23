package projet_java.Bestiole.java_Bestiole.metier;


import java.util.ArrayList;
import java.util.Collections;

import projet_java.Bestiole.java_Bestiole.metier.*;




/** Paquet de carte du jeux Bestiolle présent dans my time at sandrock
 * Cette classe permet de créer un paquet avec toutes les cartes du jeux Bestiolle.
 * @author Justine BONDU
*  @version 1 du 09/11/2023
*/


public class PaquetBestiole
{
	private ArrayList<CarteBestiole>    paquet;
	private boolean 			    scenario;	


	public PaquetBestiole(int num)
	{
		this.paquet	= new ArrayList<CarteBestiole>();
		
		if ( num == 0 )
		{
			this.initPioche();
			this.scenario = false;
		}
			
			
		if ( num == 1 )
		{
			this.paquet.clear();
			this.paquet	= new ArrayList<CarteBestiole>();
			this.scenario = false;
		}

		if ( num == 50 )
		{
			this.paquet.clear();
			this.paquet	= new ArrayList<CarteBestiole>();
			this.scenario = true;
		}

		if ( num == 5 )
		{
			this.initPioche();
			this.echangeCarte(0, 3);
			this.echangeCarte(1, 4);
			this.scenario = true;
		}
		
		if ( num == 6 ) //POUR SCENARIO 1
		{
			this.initPioche();
			this.echangeCarte(0, 2); 
			this.echangeCarte(1, 3); 
			this.echangeCarte(2, 3); 
			this.echangeCarte(3, 4); 
			this.scenario = true;
		}

		if ( num == 7 )
		{
			this.initPioche();
			this.scenario = false;
		}
		
	}





	public void initPioche()
	{
		new CarteBestiole().resetNUM();
		this.paquet.clear();
		this.paquet	= new ArrayList<CarteBestiole>();

		for ( int cpt=0; cpt < 40; cpt++ ) { this.addCarteBestiole(new CarteBestiole()); }	
			
	}


	public void melanger() 
	{ 
		if ( this.taille() != 0 )
			Collections.shuffle(this.paquet); 		
	}

	public CarteBestiole piocher()
	{
		if ( ! this.scenario )
			this.melanger();

		if ( this.taille() == 0 )
			return null;
		return this.paquet.remove(0);
	}



	public ArrayList<CarteBestiole>	getPaquet()				{	return this.paquet;							}
	public CarteBestiole			getCarteBestiole(int indice)	{	return this.paquet.get(indice);				}
	public CarteBestiole			getLast()				{	return this.paquet.get(this.taille()-1);	}
	public boolean			getScenario()			{	return this.scenario;	}
	public void				addCarteBestiole(CarteBestiole carte)	{	this.paquet.add(carte);						}
	public int				taille()				{	return this.paquet.size();					}



	public void init2()
	{
		this.echangeCarte(0, 1);
		this.echangeCarte(1, 2);
		this.echangeCarte(2, 3);
	}


	public void echangeCarte(int ind1, int ind2)
	{
		CarteBestiole c1, c2;

		if ( ind1 < ind2 )
		{
			c2 = this.paquet.remove(ind2);
			c1 = this.paquet.remove(ind1);
			this.paquet.add(ind1, c2);
			this.paquet.add(ind2, c1);
		}
		else 
		{
			c1 = this.paquet.remove(ind1);
			c2 = this.paquet.remove(ind2);
			this.paquet.add(ind1, c2);
			this.paquet.add(ind2, c1);
		}
	}


	public String toString() 
	{
		String s;
		s= "" + this.paquet;
		return "" + this.paquet; 
	} 


	public static void main(String[] argv)
	{
		PaquetBestiole        PaTempo;


		PaTempo = new PaquetBestiole(0);
		System.out.print(PaTempo);
		System.out.println ();
		PaTempo.melanger();
		System.out.println ();
		System.out.println ("-------------------------------------------------------");
		System.out.println ();
		System.out.print(PaTempo);
		System.out.println ("-------------------------------------------------------");
		//System.out.print(PaTempo);
		System.out.println ();
		

	}
}