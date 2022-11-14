package personnages;

public class Gaulois {
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private String nom;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	//TP3
	
	private String prendreParole() {
		return "Le gaulois " + this.nom + " : ";
		}
	
//TP3
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesObtenus= romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesObtenus != null && i < tropheesObtenus.length 
				&& tropheesObtenus[i] != null ; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesObtenus[i];
		}
	}

	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "
				+ forcePotion 
				+ " fois décuplée.");		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	//Donner au musée
	
	public void faireUneDonation(Musee musee) {
		if (trophees != null ) {
			String texte = "Je donne au musee tout mes trophees";
			for (int i=0; i<nbTrophees; i++) {
				texte += "\n-" + trophees[i].getEquipement();
			}
			this.parler(texte);
		}
		else {
			parler("Je n'ai pas de trophées");
		}
	}
	
}