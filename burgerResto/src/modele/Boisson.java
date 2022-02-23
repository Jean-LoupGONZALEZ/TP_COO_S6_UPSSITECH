package modele;

public class Boisson extends Aliment{

		private String nom;
		
	public Boisson(String nom) {
		super(nom);
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

}
