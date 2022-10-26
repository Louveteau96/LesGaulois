package personnages;

public class Village {
	public String nom;
	public int nbVillageois = 0;
	public Gaulois[] population;
	public Chef chef;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.population =new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois habitant) {
		if (this.nbVillageois<this.population.length) {
			this.population[this.nbVillageois]=habitant;
			this.nbVillageois++;
		}else {
			System.err.println("Le vilalge est plein, il n'y a plus de place!");
		}
	}
	
	public Gaulois trouverHabitant(int numero) {
		return this.population[numero];
	}
	
	public void afficherVillageois() {
		String texte = "Dans le village du chef ";
		texte += getChef().getNom();
		texte += " vivent les légendaires gaulois :";
		for (int i = 0; i < nbVillageois; i++) {
			texte += "\n - ";
			texte += this.population[i].getNom();
		}
		System.out.println(texte);
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		Chef chef = new Chef("Abraracourcix", 6,village);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		Gaulois gaethan = new Gaulois("Gaethan",2000);
		Gaulois josephine = new Gaulois ("Joséphine ange gardien",1);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(gaethan);
		village.ajouterHabitant(josephine);
		village.afficherVillageois();
	}
}