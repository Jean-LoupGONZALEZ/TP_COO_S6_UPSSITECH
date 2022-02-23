package modele;

public class FabriqueProfil {
	//attributs
	
	public static Profil creerProfil(ProfilUtilisateur profilUtilisateur,String nom, String prenom, String mdp) {
		Profil profil = null;
		
		switch(profilUtilisateur) {
		case PERSONNEL:
			Personnel personnel = new Personnel(nom,prenom,mdp);
			profil = personnel;
			break;
		case GERANT:
			Personnel gerant = new Personnel(nom,prenom,mdp);
			gerant.definirGerant();
			profil = gerant;
			break;
		default:
			Client client = new Client(nom,prenom,mdp);
			profil = client;
			break;
		}
		
		return profil;
	}
	
}
