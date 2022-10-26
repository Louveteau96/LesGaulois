package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	

	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);

	}
	
	public void extorquer(Commercant victime) {
		int argent = victime.getArgent();
		this.gagnerArgent(argent);
		
		
		String texte = "Tiens tiens tiens, ne serait-ce pas un faible marchand qui passe par là ?";
		parler(texte);
		String nomVictime = victime.getnom();
		texte = nomVictime + ", si tu tiens à la vie donne moi ta bourse";
		parler(texte);		
		victime.seFaireExtorquer();
		texte = "J'ai piqué les " + argent + " sous de " + nomVictime + ", ce qui me fait " 
		+ this.getArgent() + " dans ma poche. Hi ! Hi ! Hi !";
		parler(texte);
		this.reputation += 1;
	}

}
