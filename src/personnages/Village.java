package personnages;

public class Village {

	 private String nom; 
	 private Chef chef; 
	 private Gaulois[] habitants;
	 private int nbVillageois = 0;
	 
	 
	 public Village(String nom, int nbVillageoisMaximum,Chef chef) { 
		 this.chef = chef;
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
	 
	 public static void main(String[] args) {
		Village village = new Village ("Village des Irréductibles",30);
		Chef chef = new Chef ("Abraracourcix",6);
		ajouterHabitant(chef);
		
	}

	 
	 /*Si le nombre de villageois cherché est 30 alors que la
	  * limite est 30 ce sera out of bound car la liste vas de 
	  * 0 à 30
	 */
	
	 

}
