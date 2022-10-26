package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof= new Humain("Prof","kombusha",54);
		prof.direBonjour();
		prof.acheter("un kombusha", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco",15);
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yakulenoir = new Yakuza("Yaku le noir", "Whisky", 30, "Warsong",0);
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
		Ronin roro = new Ronin("Roro","shochu",50);
		roro.donner(marco);
		
	}
}
