package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.perdreArgent(don);
		beneficiaire.gagnerArgent(don);
		String texte = beneficiaire.getnom() + " prends ces " + don + " sous.";
		this.parler(texte);
		beneficiaire.recevoir(don);
	}
	
	public int perdre(int argent) {
		argent = this.getArgent();
		this.perdreArgent(argent);
		String texte = "J'ai perdu contre ce yakuza mon honneur et ma bourse en ont pris un coup";
		this.parler(texte);
		return argent;
	}

}
