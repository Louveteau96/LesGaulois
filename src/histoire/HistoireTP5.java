package histoire;

import personnages.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 60);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto","saké", 80, "Akimoto");
		
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(roro);
//		marco.listerConnaissances();
//		roro.listerConnaissances();
//		yaku.listerConnaissances();
//		
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissances();
//		akimoto.boire("thé");
		
		Traitre masako = new Traitre("Masako","whisky" ,100 ,"Miyamoto");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		masako.faireConnaissanceAvec(akimoto);
		masako.ranconner(kumi);
		
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		
		masako.faireConnaissanceAvec(roro);
		Samourai akira = new Traitre("Akira", "whisky", 50,"Miyamoto");
		Ronin hiro = new Traitre("Hiro", "saké", 20,"Miyamoto");
		Humain nori = new Traitre("Nori", "whisky", 70,"Miyamoto");
		akira.direBonjour();
		hiro.direBonjour();
		nori.direBonjour();
		
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
		
	}

}
