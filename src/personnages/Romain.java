package personnages;

public class Romain {
	private String texte;
	//TP3
	private String nom;
	private int force;
	private Equipement[] listeEquipement;
	private int nbEquipement;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0;
		this.listeEquipement=new Equipement[2];
		this.nbEquipement = 0;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	//TP3
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		assert force < oldForce;
		return equipementEjecte;
		}
	
	//
	//TP3
	//
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((listeEquipement[i] != null &&
					listeEquipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup < 0) {
			forceCoup = 0;
		}
		return forceCoup;
	}
	
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[this.nbEquipement];
			System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
			int nbEquipementEjecte = 0;
			for (int i = 0; i < this.nbEquipement; i++) {
				if (listeEquipement[i] != null) {
					equipementEjecte[nbEquipementEjecte] = listeEquipement[i];
					nbEquipementEjecte++;
					listeEquipement[i] = null;
				}
			}
		return equipementEjecte;
		}
		
	
	private String ajouterEquipement(Equipement equipement, String texte) {
		this.listeEquipement[this.nbEquipement]=equipement;
		this.nbEquipement++;
		texte += " s'équipe avec un " + equipement.getEquipement() + "!";
		return texte;
	}
	
	public String sEquiper(Equipement equipement) {
		String phrase = "Le soldat ";
		phrase+=this.getNom();
		switch (this.nbEquipement) {
		case 2: {
			phrase+= " est déjà bien protégé!";
			return phrase;
		}
		case 1: if (this.listeEquipement[this.nbEquipement-1]==equipement) {
			phrase+= " a déjà un " + equipement.getEquipement() + "!";
			return phrase;
		}else {
			return ajouterEquipement(equipement,phrase);
		}
		case 0:
			return ajouterEquipement(equipement,phrase);
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.nbEquipement);
		}
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		System.out.println(romain.prendreParole());
		System.out.println(romain.sEquiper(Equipement.CASQUE));
		System.out.println(romain.sEquiper(Equipement.CASQUE));
		System.out.println(romain.sEquiper(Equipement.BOUCLIER));
		System.out.println(romain.sEquiper(Equipement.CASQUE));
		romain.parler("Je vais te détruire!");
		romain.recevoirCoup(4);
		romain.recevoirCoup(5);
	}
}