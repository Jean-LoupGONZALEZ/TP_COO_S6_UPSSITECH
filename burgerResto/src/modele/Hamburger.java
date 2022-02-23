package modele;

public class Hamburger extends Aliment {

	private String nom;
	
	public Hamburger(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public String getNom(){
		return nom;
	}
}
