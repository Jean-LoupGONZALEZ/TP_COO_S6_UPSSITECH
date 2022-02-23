package controleur;

import modele.Accompagnement;
import modele.Aliment;
import modele.AlimentMenu;
import modele.Boisson;
import modele.FabriqueAliment;
import modele.Hamburger;
import modele.Menu;
import modele.ProfilUtilisateur;

public class ControlAjouterAlimentMenu {
	private Menu menu = Menu.getInstance();
	private ControlVerifierIdentification controlVerifierIdentification;
	

	public boolean verifierIdentification(ProfilUtilisateur profilUtilisateur, int numeroProfil) {
		return controlVerifierIdentification.verifierIdentification(profilUtilisateur.GERANT, numeroProfil);
	}
	
	public void ajouterAliment(AlimentMenu typeAliment, String nomAliment) {
		switch(typeAliment) {
		case HAMBURGER:
			Hamburger hamburger = (Hamburger) FabriqueAliment.creerAliment(AlimentMenu.HAMBURGER, nomAliment);
			menu.ajouterAliment(hamburger);
			break;
		case ACCOMPAGNEMENT:
			Accompagnement accompagnement = (Accompagnement) FabriqueAliment.creerAliment(AlimentMenu.ACCOMPAGNEMENT,nomAliment);
			menu.ajouterAliment(accompagnement);
			break;
		case BOISSON:
			Boisson boisson = (Boisson) FabriqueAliment.creerAliment(AlimentMenu.BOISSON, nomAliment);
			menu.ajouterAliment(boisson);
			break;
		}
		
	}
	
	public ControlAjouterAlimentMenu(ControlVerifierIdentification controlVerifierIdentification) {
		this.controlVerifierIdentification = controlVerifierIdentification;
	}

	
	public String visualiserMenu() {
		return menu + "]";
	}

	
	
	
	
}
