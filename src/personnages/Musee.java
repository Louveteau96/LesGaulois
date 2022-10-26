package personnages;

public class Musee {
	private String nom;
	private int nbTrophee = 0;
	private Trophee[] collection = new Trophee[200];
	
	public Musee(String nom) {
		this.nom = nom;
	}
	
	public void donnerTrophees (Gaulois donateur, Equipement trophee) {
		collection[nbTrophee] = new Trophee(donateur,trophee);
		nbTrophee +=1;
		
	}
	
}

