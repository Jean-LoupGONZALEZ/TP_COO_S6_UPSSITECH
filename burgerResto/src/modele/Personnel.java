package modele;

public class Personnel extends Profil {
	//attributs
	private boolean gerant = false;

	
	//constructeurs
	public Personnel(String nom, String prenom, String mdp) {
		super(nom, prenom,mdp);
	}
	
	//methodes
	public void definirGerant() {
		gerant=true;
	}
	public boolean isGerant() {
		return gerant;
	}

	@Override
	public String toString() {
		return "Personnel [gerant=" + this.isGerant() + ", nom=" + this.getNom() + ", prenom=" + this.getPrenom() + ", login=" + this.getLogin() + ", mdp=" + this.getMdp() + ", connecte=" + this.isConnecte() + "]";
	}

}
