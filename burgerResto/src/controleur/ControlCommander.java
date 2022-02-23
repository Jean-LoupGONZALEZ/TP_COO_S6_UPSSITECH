package controleur;

import java.util.ArrayList;
import java.util.List;

import modele.Accompagnement;
import modele.BDClient;
import modele.BDCommande;
import modele.Boisson;
import modele.Client;
import modele.Hamburger;
import modele.Menu;
import modele.ProfilUtilisateur;

public class ControlCommander {
	
	//attributs
	private BDCommande bdCommande = BDCommande.getInstance();
	private BDClient bdClient = BDClient.getInstance();
	private Menu menu = Menu.getInstance();
	private ControlVerifierIdentification controlVerifierIdentification;
	
	//methodes
	public boolean verifierIdentification(int numClient) {
		return controlVerifierIdentification.verifierIdentification(ProfilUtilisateur.CLIENT, numClient);
	}
	
	public List<String> donnerListeHamburger(){
		List<Hamburger>  listeHamburger = menu.getListHamburger();
		List<String> listeNomHamburger = new ArrayList<>();
		
		for (Hamburger hamburger : listeHamburger) {
			listeNomHamburger.add(hamburger.getNom());
		}
		
		return listeNomHamburger;
	}
	
	public List<String> donnerListeAccompagnement(){
		List<Accompagnement>  listeAccompagnement = menu.getListeAccompagnement();
		List<String> listeNomAccompagnement = new ArrayList<>();
		
		for (Accompagnement accompagnement : listeAccompagnement) {
			listeNomAccompagnement.add(accompagnement.getNom());
		}
		
		return listeNomAccompagnement;	
		
	}
	
	public List<String> donnerListeBoisson(){
		List<Boisson>  listeBoisson = menu.getListeBoisson();
		List<String> listeNomBoisson = new ArrayList<>();
		
		for (Boisson boisson : listeBoisson) {
			listeNomBoisson.add(boisson.getNom());
		}
		
		return listeNomBoisson	;	
	}
	
	public boolean verifierExistenceCarteBancaire(int numClient) {
		Client client = bdClient.trouverClient(numClient);
		boolean carteRenseignee = client.verifierExistenceCarteBancaire();
		return carteRenseignee;
	}
	
	public int enregistrerCommande(int numClient, int numHamburger, int numAccompagnement , int numBoisson) {
		Hamburger hamburger = menu.choixHamburger(numHamburger);
		Accompagnement accompagnement =  menu.choixAccompagnement(numAccompagnement);
		Boisson boisson = menu.choixBoisson(numBoisson);
		int numeroCommande = bdCommande.enregistrerCommande(numClient, hamburger, accompagnement, boisson);
		return numeroCommande;
	}

}
