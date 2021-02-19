package Modele;

import java.awt.Point;
import java.util.ArrayList;

public class Tour extends Pieces {

	private boolean aBouger;
	private ArrayList<String> mouvementPossible;

	public Tour(String nom, boolean couleur, Point emplacement) {
		super(nom, couleur, emplacement);
		aBouger = false;
	}

	public boolean isaBouger() {
		return aBouger;
	}

	public void setaBouger() {
		this.aBouger = true;
	}

	public ArrayList<String> getMouvementPossible() {
		return mouvementPossible;
	}

	 
	public void setMouvementPossible(Object[][] plateau) {
		
	}

}
