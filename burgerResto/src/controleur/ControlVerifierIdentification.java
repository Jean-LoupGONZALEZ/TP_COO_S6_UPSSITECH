package controleur;

import modele.BDClient;
import modele.BDPersonnel;
import modele.Client;
import modele.Personnel;
import modele.ProfilUtilisateur;

public class ControlVerifierIdentification {
	
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();
	private BDClient bdClient = BDClient.getInstance();
	
	public boolean verifierIdentification(ProfilUtilisateur profilUtilisateur, int numeroProfil) {
		boolean connexionOk = false;
		switch(profilUtilisateur) {
		case CLIENT:
			Client client = bdClient.trouverClient(numeroProfil);
			if(client!=null) {
				connexionOk = client.isConnecte();
			}
			break;
		case PERSONNEL:
			Personnel personnel=  bdPersonnel.trouverPersonnel(numeroProfil);
			if(personnel!=null) {
				connexionOk = personnel.isConnecte();			
			}
			break;
		default:
			Personnel gerant=  bdPersonnel.trouverPersonnel(numeroProfil);
			if(gerant!=null) {
				connexionOk = gerant.isConnecte();
			}
			break;
		}
		return connexionOk;
	}
}
