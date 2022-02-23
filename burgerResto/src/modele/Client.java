package modele;

public class Client extends Profil{
	
	private CarteBancaire carteBancaire;
	
	//constructeur
	public Client(String nom, String prenom, String mdp) {
		super(nom, prenom, mdp);
		
	}
	
	public void enregistrerCoordonneesBancaires(int numeroCarte, int dateCarte) {
		this.carteBancaire = new CarteBancaire(numeroCarte, dateCarte);
	}
	
	public boolean verifierExistenceCarteBancaire() {
		if (this.carteBancaire != null) {
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + this.getNom() + ", prenom=" + this.getPrenom() + ", login=" + this.getLogin() + ", mdp=" + this.getMdp() + ", connecte=" + this.isConnecte() + carteBancaire.toString() + "]";
	}
	
}
