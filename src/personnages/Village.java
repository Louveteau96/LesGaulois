package personnages;

public class Village {

	 private String nom; 
	 private Chef chef; 
	 private Gaulois[] habitants;
	 private int nbVillageois = 0;
	 
	 
	 public Village(String nom, int nbVillageoisMaximum) { 
		 this.nom = nom; 
		 this.habitants = new Gaulois[nbVillageoisMaximum];
	 } 
	 
	 public void setChef(Chef chef) { 
	 this.chef = chef; 
	 } 
	 
	 public String getNom() { 
	 return nom; 
	 } 
	 
	 public void ajouterHabitant(Gaulois gaulois){
		 this.habitants[nbVillageois] = gaulois;
		 nbVillageois++;
	 }
	 
	 public Gaulois trouverHabitant(int numeroHabitant) {
		 return habitants[numeroHabitant];
		 
	 }
	 
	 public void afficherVillageois() {
			String texte = "Dans le village du chef ";
			texte += this.chef.getNom();
			texte += " vivent les légendaires gaulois :";
			for (int i = 0; i < nbVillageois; i++) {
				texte += "\n - ";
				texte += this.habitants[i].getNom();
			}
			System.out.println(texte);
	 }
	 
	 public static void main(String[] args) {
		Village village = new Village ("Village des Irréductibles",30);
		Chef chef = new Chef ("Abraracourcix",6, village);
		Gaulois gauloisAsterix = new Gaulois ("Asterix",8);
		Gaulois gauloisObelix = new Gaulois ("Obelix",25);
		village.ajouterHabitant(gauloisAsterix);
		village.ajouterHabitant(gauloisObelix);
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		*/
		village.afficherVillageois();
		
	}

	 
	 /*Si le nombre de villageois cherché est 30 alors que la
	  * limite est 30 ce sera out of bound car la liste vas de 
	  * 0 à 30
	 */
	
	 

}
