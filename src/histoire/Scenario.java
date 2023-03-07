package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public Scenario() {
	
	}

	public static void main(String[] args) {
//		Gaulois asterix= new Gaulois("Asterix",8);
//		Romain minus= new Romain("Minus", 6);
//		asterix.parler("Bonjour à tous");
//		minus.parler("UN GAU... UN GAUGAU");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);

		Druide panoramix= new Druide("Panoramix",5,10);
		Gaulois obelix=new Gaulois("Obélix",8);
		Gaulois asterix= new Gaulois("Asterix",8);
		Romain minus= new Romain("Minus", 6);
		
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
