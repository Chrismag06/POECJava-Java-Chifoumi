import java.util.Scanner;

public class JeuDeChifoumi {

	public static void main(String[] args) {
		
		/*
		 * France Pierre Feuille Ciseaux 
		 * Indonésie  Éléphant Être humain Fourmi 
		 *  Malaisie Pistolet Oiseau Eau
		 */
		
		/* 
		 * FR = FRANCE, IN=INDONESIE, MA=MALAISIE
		 */
		
		Scanner myObj = new Scanner(System.in);
		
		String Pays;
		String[] Regles = new String[3];
		
		int ChoixJoueur1;
		int ChoixJoueur2;
				
		int PointJoueur1;
		int PointJoueur2;
		
		int DiffChoix = 0;
		
		int nombreParties = 5;
		int cpt = 1;
		
		Pays = "FR";
		
		ChoixJoueur1 = 0;
		ChoixJoueur2 = 1;
		
		PointJoueur1 = 0;
		PointJoueur2 = 0;
	
		switch(Pays) {
		  case "FR":
			//FRANCE
			Regles[0] = "Ciseaux";
		    Regles[1] = "Feuille"; 
			Regles[2] = "Pierre ";
		    break;
		  case "IN":
			//INDONESIE
			Regles[0] = "Éléphant";
		    Regles[1] = "Être humain"; 
			Regles[2] = "Fourmi";
		    break;
		  case "MA":
			//MALAISIE
			Regles[0] = "Pistolet";
		    Regles[1] = "Oiseau"; 
			Regles[2] = "Eau";
		}
		
		while (cpt <= nombreParties) {
			System.out.println("Partie : " + cpt + " / " + nombreParties);
			
			System.out.println("Choix du Joueur 1");
			ChoixJoueur1 = myObj.nextInt();
			System.out.println("Choix du Joueur 2");
			ChoixJoueur2 = myObj.nextInt();

			if (ChoixJoueur1 != ChoixJoueur2) {
				DiffChoix = ChoixJoueur1 - ChoixJoueur2;
				
				System.out.print("Joueur ");
				switch (DiffChoix) {
				case -1:
					PointJoueur1 += 1;
					System.out.print("1");
					break;
				case 2:
					PointJoueur2 += 1;
					System.out.print("2");
					break;
				case 1:
					PointJoueur2 += 1;
					System.out.print("2");
					break;
				case -2:
					PointJoueur1 += 1;
					System.out.print("1");
					break;
				}
				System.out.println(" gagnant!");
				System.out.println("SCORE : Joueur 1 :" + PointJoueur1 + " Joueur 2:" + PointJoueur2);
				cpt += 1;
			}else {
				System.out.println("égalité recommencez svp");
			}
			System.out.println("                        ");
		}
		
		System.out.print("Félicitations le gagnant de la partie  est le ");
		if (PointJoueur1 > PointJoueur2) {
			System.out.print("Joueur 1 avec " + PointJoueur1);
		}else {
			System.out.print("Joueur 2 avec " + PointJoueur2);
		}
		System.out.print(" points");
		
		myObj.close();
		
		
	}

}
