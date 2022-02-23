package modele;

public class CarteBancaire {
	

		int numeroCarte;
		int dateCarte;
		
		public CarteBancaire(int numeroCarte, int dateExpcarte) {
			this.numeroCarte=numeroCarte;
			this.dateCarte=dateExpcarte;
		}
		
		public String toString() {
			return ", CarteBancaire [numeroCarte=" + numeroCarte + ", dateCarte=" + dateCarte + "]";
		}
		
}
