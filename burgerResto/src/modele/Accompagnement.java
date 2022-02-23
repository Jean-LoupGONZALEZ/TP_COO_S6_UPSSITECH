package modele;

public class Accompagnement extends Aliment{
	
	private String nom;
	
	public Accompagnement(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	

}
