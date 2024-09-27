package Histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scénario {

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
//		asterix.parler("Bonjour à tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
		panoramix.preparerPotion();
		
	}

}
