package histoire;
import personnages.*;

public class Scenario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obélix",8);
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",5);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		Musee louvre = new Musee("Le Louvre");
		asterix.faireUneDonation(louvre);

	}

}