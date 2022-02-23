package modele;

import java.util.HashMap;
import java.util.Map;


public class BDPersonnel {
	//attributs
	private int numeroPersonnel = 0;
	private Map<Integer,Personnel> listePersonnel;
	
	//constructeur prive 
	private BDPersonnel() {
		this.listePersonnel = new HashMap<Integer, Personnel>();
	}
	
	//holder
	private static class BDPersonnelHolder{
		private final static BDPersonnel instance = new BDPersonnel();
	}
	
	//point d'acces pour l'instance unique du singleton
	public static BDPersonnel getInstance() {
		return BDPersonnelHolder.instance;
	}
	
	//methodes
	public void ajouterPersonnel (Personnel personnel) {
		listePersonnel.put(numeroPersonnel, personnel);
		numeroPersonnel++;	
	}
	
	public int connexionPersonnel (String login,String mdp){
        for(Map.Entry<Integer,Personnel> set : listePersonnel.entrySet()){
            Personnel personnel = set.getValue() ;
            if(personnel.verifierCorrespondanceProfil(login,mdp)){
            	personnel.connexionProfil();
                return set.getKey();
            }
            else {}
        }
        return -1;
    }
	
	public Personnel trouverPersonnel (int numeroPersonnel){
		return listePersonnel.get(numeroPersonnel);
	}

	@Override
	public String toString() {
		return "BDPersonnel [listePersonnel=" + listePersonnel + "]";
	}

}
