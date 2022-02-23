package vueconsole;

import controleur.ControlAjouterAlimentMenu;
import modele.AlimentMenu;
import modele.ProfilUtilisateur;

public class BoundaryAjouterAlimentMenu {
	
	private ControlAjouterAlimentMenu controlAjouterAlimentMenu;
	
	public BoundaryAjouterAlimentMenu(ControlAjouterAlimentMenu controlAjouterAlimentMenu) {
		this.controlAjouterAlimentMenu = controlAjouterAlimentMenu;
	}

	public void ajouterAlimentMenu(int numProfil) {
		boolean idOK = controlAjouterAlimentMenu.verifierIdentification(ProfilUtilisateur.GERANT, numProfil);
		if (idOK == true) {
			
			System.out.println("Entrer le numéro du type d'aliment que vous souhaitez ajouter :");
			int choix = 0;
			
			while (!(choix==1 || choix==2 || choix ==3)) {
				System.out.println("1  ajouter un hamburger");
				System.out.println("2  ajouter un accompagement");
				System.out.println("3  ajouter une boisson");
				choix = Clavier.entrerClavierInt();
				
				if(!(choix==1 || choix==2 || choix ==3)) {
					System.out.println("veuillez entrer 1, 2 ou 3");
				}
			}
			
			System.out.println("veuillez entrer le nom de l'aliment : ");
			String nomAliment = Clavier.entrerClavierString();
			
			switch (choix) {
			case 1:
				controlAjouterAlimentMenu.ajouterAliment(AlimentMenu.HAMBURGER, nomAliment);
				break;
			case 2:
				controlAjouterAlimentMenu.ajouterAliment(AlimentMenu.ACCOMPAGNEMENT, nomAliment);
				break;
			case 3:
				controlAjouterAlimentMenu.ajouterAliment(AlimentMenu.BOISSON, nomAliment);
				break;
			default:
				System.out.println("type d'aliment non reconnu");
				break;
			}
		}
		
	}
}
