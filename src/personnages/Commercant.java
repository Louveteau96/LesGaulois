package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
				
	}
	
	
	public void seFaireExtorquer(){
		String texte = "J'ai tout perdu le monde est trop injuste.";
		this.perdreArgent(getArgent());
		parler(texte);
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		String texte = argent + " sous ! Je te remercie généreux donnateur";
		parler(texte);
	}

}
