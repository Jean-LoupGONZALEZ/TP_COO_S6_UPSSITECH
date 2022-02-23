package modele;

public abstract class  Profil {
	//attributs
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	private boolean connecte = false;
	
	//constructeur
	public Profil(String nom, String prenom, String mdp) {
		this.nom=nom;
		this.prenom=prenom;
		this.mdp=mdp;
		this.login=prenom+'.'+nom;
	}
	
	//methodes
	public boolean verifierCorrespondanceProfil(String login, String mdp) {
		if(this.login.equals(login) && this.mdp.equals(mdp)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void connexionProfil() {
		connecte = true;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getLogin() {
		return login;
	}

	public String getMdp() {
		return mdp;
	}

	public boolean isConnecte() {
		return connecte;
	}
	
	
		
}
