package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	
	
	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent,seigneur);

		
	}
	
	public int getTraitrise() {
		return this.niveauTraitrise;
	}
	
	
	public void ranconner(Commercant commercant) {
		if (this.getTraitrise() < 3) {
			int argentTotal = commercant.getArgent();
			int argentRanconner = argentTotal*2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			
			String texteTraitre = "Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi ";
			texteTraitre += argentRanconner + " sous ou gare à toi !";
			this.parler(texteTraitre);
			
			String texteVictime = "Tout de suite grand " + this.getNom() + ".";
			commercant.parler(texteVictime);
			this.niveauTraitrise += 1;
			
		}
		else {
			String texte = "Mince je ne peux plus ranconner personne sinon un Samouraï risque de me démasquer.";
			this.parler(texte);
			
		}
		
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte = "Mais je suis un traitre et mon niveau de traitrise est de : ";
		texte+=this.getTraitrise() + ". Chut !";
		parler(texte);
	}
	
	
	public void faireLeGentil (){
		if (this.nbrconnaissances < 1) {
			String texte = "Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.";
			this.parler(texte);
		}
		else {
			String nomTraitre = this.getNom();
			
			//On trouve l'ami à qui donner l'argent :
			
			Random rand = new Random();
			int int_random = rand.nextInt(this.nbrconnaissances - 1);
			Humain ami = this.memoire[int_random];
			
			
			
			
			//------------------------------------------------------------------------------------
			
			//On calcul la valeur du don :
			
			int don = this.getArgent() /20;
			
			//------------------------------------------------------------------------------------
			
			
			
			
			//Le traitre parle :
			
			String nomAmi = ami.getNom();
			
			
				//Il parle à soit même
			
			String texte = "Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".";
			this.parler(texte);
			
			
				// Il parle à l'ami
			
			texte = "Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.";
			this.parler(texte);
			
			//------------------------------------------------------------------------------------
			
			
			
			
			//Echange d'agent
			
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			
			//------------------------------------------------------------------------------------
			
			
			//Remerciement
			
			
			texte = "Merci " + nomTraitre + ". Vous êtes quelqu'un de bien.";
			ami.parler(texte);
			
			//------------------------------------------------------------------------------------
			
			
			// Baisse du niveau de traitrise
			
			if (this.niveauTraitrise > 1) {
				this.niveauTraitrise -= 1;
			}
			
			
		}
		
	}

}
