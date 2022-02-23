package modele;

import java.util.HashMap;
import java.util.Map;


public class BDClient {

	//attributs
	private int numeroClient=0;
	private Map<Integer,Client>listeClient;
	
	//constructeur prive 
	private BDClient() {
		this.listeClient = new HashMap<Integer, Client>();
	}
	
	//holder
	private static class BDClientHolder{
		private final static BDClient instance = new BDClient();
	}
	
	//point d'acces pour l'instance unique du singleton
	public static BDClient getInstance() {
		return BDClientHolder.instance;
	}
	
	//methodes
	public void ajouterClient(Client client) {
		listeClient.put(numeroClient, client);
		numeroClient++;	
	}
	
	 public int connexionClient(String login,String mdp){
	       for(Map.Entry<Integer,Client> set : listeClient.entrySet()){
	           Client client = set.getValue() ;
	           if(client.verifierCorrespondanceProfil(login,mdp)){
	               client.connexionProfil();
	               return set.getKey();
	           }
	           else {}
	       }
	       return -1;
	  }
	 
	 public Client trouverClient(int numeroClient) {
		 return listeClient.get(numeroClient);
	 }

    public int getNumeroClient() {
		return numeroClient;
	}
	@Override
	public String toString() {
		return "BDClient [listeClient=" + listeClient + "]";
	}
	
}
