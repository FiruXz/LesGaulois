package Histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Sc�nario {

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
//		asterix.parler("Bonjour � tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
		panoramix.preparerPotion();
		
	}

}
