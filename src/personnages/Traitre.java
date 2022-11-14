package personnages;

public class Traitre extends Samourai {
	private int niveauTraitrise;
	
	
	public Traitre(String nom, String boisson, int argent, String seigneur, int niveauTraitrise) {
		super(nom, boisson, argent,seigneur);
		this.niveauTraitrise = niveauTraitrise;
		
	}
	
	
	public void ranconner(Commercant commercant) {
		int argentTotal = commercant.getArgent();
		int argentRanconner = 2/10*argentTotal;
		commercant.perdreArgent(argentRanconner);
		this.gagnerArgent(argentRanconner);
	}
	
	@Override
	public void direBonjour() {
		
	}
	
	
	public void faireLeGentil{
		
	}

}
