package vueconsole;

import java.util.List;

import controleur.ControlCommander;
import modele.Hamburger;

public class BoundaryCommander {

	//attributs
	private BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires;
	private ControlCommander controlCommander;
	
	public BoundaryCommander(ControlCommander controlCommander,BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires) {
		this.controlCommander = controlCommander;
		this.boundaryEnregistrerCoordonneesBancaires = boundaryEnregistrerCoordonneesBancaires;
	}

	//methodes
	public void commander(int numClient) {
		boolean clientConnecte = controlCommander.verifierIdentification(numClient);
		
		if(clientConnecte) {
			int numBurger = selectionnerBurger();
			int numAccompagenment = selectionnerAccompagnement();
			int numBoisson = selectionnerBoisson();
			boolean carteRenseignee = controlCommander.verifierExistenceCarteBancaire(numClient);

			if(!carteRenseignee) {
				carteRenseignee = boundaryEnregistrerCoordonneesBancaires.enregistrerCoordonneesBancaires(numClient);
			}
			
			if(carteRenseignee) {
				int numeroCommande = controlCommander.enregistrerCommande(numClient, numBurger,numAccompagenment, numBoisson);
				System.out.println("votre numero de commande est le : " + numeroCommande);
			}
		}
	}
	
	private int selectionnerBurger() {
		int chiffre = 1;
		List<String>listeNomHamburger = controlCommander.donnerListeHamburger();
		
		System.out.println("veuillez selectionner le numero de votre hamburger :");
		
		for (String hamburger : listeNomHamburger) {
			System.out.println("\n" + chiffre + ": " + hamburger);
			chiffre++;
		}
		int numeroBurger = Clavier.entrerClavierInt();
		
		return numeroBurger;
	}
	
	private int selectionnerAccompagnement() {
		int chiffre = 1;
		List<String>listeNomAccompagnement = controlCommander.donnerListeAccompagnement();
		
		System.out.println("veuillez selectionner le numero de votre accompagnement :");
		
		for (String accompagnement : listeNomAccompagnement) {
			System.out.println("\n" + chiffre + ": " + accompagnement);
			chiffre++;
		}
		int numeroAccompagnement = Clavier.entrerClavierInt();
		
		return numeroAccompagnement;
		
	}
	
	private int selectionnerBoisson() {
		int chiffre = 1;
		List<String>listeNomBoisson = controlCommander.donnerListeBoisson();
		
		System.out.println("veuillez selectionner le numero de votre boisson :");
		
		for (String boisson : listeNomBoisson) {
			System.out.println("\n" + chiffre + ": " + boisson);
			chiffre++;
		}
		int numeroBoisson = Clavier.entrerClavierInt();
		
		return numeroBoisson;
		
	}
}
