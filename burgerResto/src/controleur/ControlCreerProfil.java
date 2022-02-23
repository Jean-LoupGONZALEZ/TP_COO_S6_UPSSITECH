package controleur;

import modele.BDClient;
import modele.BDPersonnel;
import modele.Client;
import modele.FabriqueProfil;
import modele.Personnel;
import modele.Profil;
import modele.ProfilUtilisateur;

public class ControlCreerProfil {
	//attributs
	private BDPersonnel bdPersonnel = BDPersonnel.getInstance();
	private BDClient bdClient = BDClient.getInstance();
	
	//methodes
	public void creerProfil(ProfilUtilisateur profilUtilisateur, String nom, String prenom, String mdp){
		Profil profil = FabriqueProfil.creerProfil(profilUtilisateur,nom,prenom,mdp);
		if (profilUtilisateur == ProfilUtilisateur.CLIENT) {
			bdClient.ajouterClient((Client) profil);
		}
		else {
			bdPersonnel.ajouterPersonnel((Personnel) profil);
		}
		
	}

	public String visualiserBDUtilisateur() {
		return this.bdPersonnel + "\n" + this.bdClient;
	}

}
