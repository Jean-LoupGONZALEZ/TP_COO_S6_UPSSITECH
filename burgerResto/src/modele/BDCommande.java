package modele;

import java.util.HashMap;
import java.util.Map;

public class BDCommande {
	
	//attributs
	private Map<Integer,Commande>mapCommande;
	
	//constructeur privé
	private BDCommande() {
		this.mapCommande = new HashMap<Integer, Commande>();
	}
	
	//holder
	private static class BDCommandeHolder {
		private final static BDCommande instance = new BDCommande();
	}
	
	//getInstance
	public static BDCommande getInstance() {
		return BDCommandeHolder.instance;
	}
	
	//methodes
	public int enregistrerCommande(int numClient, Hamburger hamburger, Accompagnement accompagnement, Boisson boisson) {
		Commande commande = new Commande(numClient, hamburger, accompagnement, boisson);
		int numeroCommande = commande.getNumeroCommandeAttribuee();
		return numeroCommande;
		
	}
}
