import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String saisie;
		int partie=0;


		System.out.println("Bienvenue sur le jeu du shifumi !");


		System.out.println("Le Shufumi selon quel pays (FR, IN, MA) ?");
		System.out.println("FR = FRANCE, IN=INDONESIE, MA=MALAISIE");			

		saisie = sc.next();

		switch (saisie)
		{
		case "FR":
			System.out.println("Très bien, pour rappel les règles " + saisie + " sont : ");
			System.out.println("WIN Ciseaux = 0 > Feuille  = 1 LOOSE");
			System.out.println("WIN Feuille = 1 > Pierre = 2 LOOSE");
			System.out.println("WIN Pierre = 2 > Ciseaux = 0 LOOSE");
			break;

		case "IN":
			System.out.println("Très bien, pour rappel les règles " + saisie + " sont : ");
			System.out.println("WIN Fourmi = 0 > Humain  = 1 LOOSE");
			System.out.println("WIN Humain = 1 > Elephant = 2 LOOSE");
			System.out.println("WIN Elephant = 2 > Fourmi = 0 LOOSE");
			break;

		case "MA":
			System.out.println("Très bien, pour rappel les règles " + saisie + " sont : ");
			System.out.println("WIN Eau = 0 > Oiseau  = 1 LOOSE");
			System.out.println("WIN Oiseau = 1 > Pistolet = 2 LOOSE");
			System.out.println("WIN Pistolet = 2 > Eau = 0 LOOSE");
		default:
			System.out.println("Veuillez saisir l'indice d'un des 3 pays, s'il vous plait");
			System.out.println("FR = FRANCE, IN=INDONESIE, MA=MALAISIE");			
			break;
		}

		System.out.println("Combien de parties souhaitez-vous faire  1,3,5,7 ou 9 ?");
		partie= Integer.parseInt(sc.next());
		
		if (partie % 2 != 0 && partie <=9) {
			System.out.println("Merci que le jeu commence");
			
			
			for (int i=1; i<=partie; i++) {
					System.out.println("Choix du joueur 1 (0, 1 ou2)");
					String choixj1 = sc.next();
					System.out.println("Choix du joueur 2 (0, 1 ou2)");
					String choixj2 = sc.next();
			}
		}
		else {
			System.out.println("Veuillez saisir un des chiffres suivant : 1,3,5,7,9");
		}
	}

}

