package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0 : "La force d'un Romain doit �tre positive.";
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "la force doit �tre positive.";
		int ancienneForce = force ;
		force -= forceCoup;
		assert force < ancienneForce : "La force d�un Romain doit avoir diminu�."; 
		if ( force > 0 ) {
			parler("Aie");
		} else {
			parler ("J'abandonne...");
		}
	}
	public static void main(String [] args) {
		Romain minus = new Romain("Minus",6);
		minus.prendreParole();
		minus.parler("Viens te battre");
		minus.recevoirCoup(10);
	}
}
