package modele;

public abstract class Aliment {
	
	private String nom;

	@Override
	public String toString() {
		return "Aliment [nom=" + nom + "]";
	}
	
	public Aliment (String nom) {
		this.nom = nom;
	}

}
