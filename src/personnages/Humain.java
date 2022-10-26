package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain (String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public String getnom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public void direBonjour() {
		String texte = "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite
				+ ".";
		parler(texte);
	}
	
	
	public void boire() {
		String texte = "Hmmm un bon verre de " + this.boissonFavorite + " ! GLOUPS !";
		parler(texte);
	}
	
	public void acheter (String bien, int prix) {
		String texte = "J'ai " + this.argent + " sous en poche.";
		if (this.argent - prix < 0) {
			texte = "Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même plus m'acheter un "
			+ bien + " à " + prix + " sous." ;
		}
		else {
			perdreArgent(prix);
			texte += " Je vais pouvoir m'acheter " + bien +" à "+ prix + " sous.";
			
		}
		parler(texte);
		
		
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}

}
