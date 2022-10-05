package personnages;

public class Village {

	 private String nom; 
	 private Chef chef; 
	 private Gaulois[] habitants;
	 private int nbVillageois = 0;
	 
	 
	 public Village(String nom,
			 int nbVillageoisMaximum) { 
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
		 
	 }
	 
	 public static void main(String[] args) {
		
	}

	

}
