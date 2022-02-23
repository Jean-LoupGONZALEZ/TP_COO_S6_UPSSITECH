package vueconsole;

import controleur.ControlEnregistrerCoordonneesBancaires;
import modele.BDClient;
import modele.Client;

public class BoundaryEnregistrerCoordonneesBancaires {

	private ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires;
	private BDClient bdClient;
	
	public BoundaryEnregistrerCoordonneesBancaires(ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires) {
		this.controlEnregistrerCoordonneesBancaires = controlEnregistrerCoordonneesBancaires;
	}

	public boolean enregistrerCoordonneesBancaires(int numClient) {
		System.out.println("veuillez saisir votre numero de carte bancaire :");
		int numeroCarte = Clavier.entrerClavierInt();
		System.out.println("veuillez saisir la date d'expiration de votre carte bancaire (MMAA) :");
		int dateExpCarte = Clavier.entrerClavierInt();
		boolean carteValide = controlEnregistrerCoordonneesBancaires.enregistrerCoordonneesBancaires(numClient, numeroCarte, dateExpCarte);
		
		if(!carteValide) {
			System.out.println("votre carte n'est pas valide, votre commande ne peut aboutir");
		}
		
		return carteValide;
	}
}
