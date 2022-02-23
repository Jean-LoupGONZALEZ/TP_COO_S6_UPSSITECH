package controleur;

import modele.BDClient;
import modele.BDPersonnel;
import modele.ProfilUtilisateur;

public class ControlSIdentifier {
	
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();
	private BDClient bdClient = BDClient.getInstance();
	
	public int sIdentifier(ProfilUtilisateur profilUtilisateur, String login, String mdp) {
		if (profilUtilisateur == ProfilUtilisateur.CLIENT) {
			return bdClient.connexionClient(login,mdp);
		}
		else {
			return bdPersonnel.connexionPersonnel(login, mdp);
		}
	}
	
	public String visualiserBDUtilisateur() {
		return this.bdPersonnel + "\n" + this.bdClient;
	}
	
}
