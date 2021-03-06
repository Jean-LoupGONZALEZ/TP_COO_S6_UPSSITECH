package vueconsole;

import controleur.ControlCreerProfil;
import modele.ProfilUtilisateur;


public class BoundaryCreerProfilClient{
	
	private ControlCreerProfil controlCreerProfil;
	
	public BoundaryCreerProfilClient(ControlCreerProfil controlCreerProfil)
	{
		this.controlCreerProfil = controlCreerProfil;
	}
	
	public void creerProfilClient(){
		System.out.println("Veuillez entrer votre nom:");
		String nom = Clavier.entrerClavierString();

		System.out.println("Veuillez entrer votre prenom:");
		String prenom = Clavier.entrerClavierString();

		System.out.println("Veuillez entrer votre mot de passe:");
		String mdp = Clavier.entrerClavierString();
		
		this.controlCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, nom, prenom, mdp);
	}

}