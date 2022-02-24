package modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Menu {
	//attributs
	private List<Hamburger> listeHamburger;
	private List<Accompagnement> listeAccompagnement;
	private List<Boisson> listeBoisson;
	
	/*------------SINGLETON--------------------------------*/
	//constructeur prive 
	private Menu() {
		this.listeHamburger = new ArrayList<>();
		this.listeAccompagnement = new ArrayList<>();
		this.listeBoisson = new ArrayList<>();
	}
		
	//holder
	private static class MenuHolder{
		private final static Menu instance = new Menu();
	}
		
	//point d'acces pour l'instance unique du singleton
	public static Menu getInstance() {
		return MenuHolder.instance;
	}
	/*------------------------------------------------------*/
	
	//methodes
	public void ajouterAliment(Hamburger hamburger) {
		listeHamburger.add(hamburger);
	}
	
	public void ajouterAliment(Accompagnement accompagnement) {
		listeAccompagnement.add(accompagnement);
	}
	
	public void ajouterAliment(Boisson boisson) {
		listeBoisson.add(boisson);
	}
	
	public List<Hamburger> getListHamburger(){
		return listeHamburger;
	}

	public List<Accompagnement> getListeAccompagnement() {
		return listeAccompagnement;
	}

	public List<Boisson> getListeBoisson() {
		return listeBoisson;
	}
	
	public Hamburger choixHamburger (int numeroHamburger) {
		return this.listeHamburger.get(numeroHamburger-1);
	}
	
	public Accompagnement choixAccompagnement (int numeroAccompagnement) {
		return this.listeAccompagnement.get(numeroAccompagnement-1);
	}
	
	public Boisson choixBoisson (int numeroBoisson) {
		return this.listeBoisson.get(numeroBoisson-1);
	}

	@Override
	public String toString() {
		return "Menu [listeHamburger=" + listeHamburger + ", listeAccompagnement=" + listeAccompagnement
				+ ", listeBoisson=" + listeBoisson + "]";
	}

}
