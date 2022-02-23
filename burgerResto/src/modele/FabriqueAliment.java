package modele;

public class FabriqueAliment {
	//attributs
	
	public static Aliment creerAliment(AlimentMenu typeAliment, String nom){ 
		
		Aliment aliment = null;
		
		switch(typeAliment) {
		case HAMBURGER:
			Aliment hamburger = new Hamburger(nom);
			aliment  = hamburger;
			break;
		case ACCOMPAGNEMENT:
			Aliment accompagnement = new Accompagnement(nom);	
			aliment = accompagnement;
			break;
		default:
			Boisson boisson = new Boisson(nom);
			aliment = boisson;
			break;
		}
		
		return aliment;
	}
	
}