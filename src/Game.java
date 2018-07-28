import java.util.Scanner;

public class Game {
	
	
	//Méthode qui permet de savoir si l'utilisateur est majeur
	
	/*boolean calculAge (int a) {
		//l'utilisateur entre son age
		boolean verification = false;
		
		if( a >= 18) {
			System.out.println("Tu es majeur, bienvenue");
			verification = true;
	}
		else  {
				System.out.println("Tu es mineur, tu dois avoir 18 ans pour jouer");
				verification = false;
			}
	return verification;
		}
		*/
	
	
	//Méthode permettant à l'ordi de trouver de manière aléatoire  un nombre entre 0 et 1000

	int chiffreOrdi(int min, int max) {
		
		//int [] numeroSecret = new int [1000];
		//int aleatoire =(int)(Math.random()*numeroSecret.length);
		//return aleatoire;
		
		//int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
		
		int nombreAleatoire = min+ (int)(Math.random() * ((max - min) + 1));
		return nombreAleatoire;
	}
	
	//Demande à l'user d'entrer un nombre entre 0 et 1000
	
	//System.out.println("Entrer un nombre entre 0 et 1000");
	//Scanner nombreEntre = new Scanner (System.in);
	//int nombreUtilisateur = nombreEntre.nextInt();
	
	//Comparer si la valeur nombreUtilisateur et numeroSecret sont identiques : utilisation d'une boucle
	
	boolean comparaison(int nombreUtilisateur, int nombreAleatoire, int nombreEssais) {
		
		nombreEssais = 10;
		boolean partieGagnee = false;
		
		while(nombreEssais > 0){
			
			
			
			
			Scanner nombreEntre = new Scanner (System.in);
			nombreUtilisateur = nombreEntre.nextInt();
			
		
		
			if(nombreUtilisateur == nombreAleatoire){
				partieGagnee = true;
				nombreEssais = -1;
				System.out.println("C'est gagné ");
			}	
			
			// A chaque essai perdu, le nombre d'essai décrémente de 1
			else if (nombreUtilisateur > nombreAleatoire) {
				partieGagnee = false;
				System.out.println("Ton numero est trop grand");
				nombreEssais --;
			}
			
			
			else if (nombreUtilisateur < nombreAleatoire) {
				partieGagnee = false;
				System.out.println("Ton numero est trop petit");
				nombreEssais --;
			}
			
			//Si le nombre d'essai est à 0 alors, c'est perdu
			if(nombreEssais == 0) {
				System.out.println("Perdu");
			}
		}
			return partieGagnee;
		}
	
	//Déroulement du jeu :	
	void jeuGlobal() throws InterruptedException {
		
		/*System.out.println("Quelle est ton age?");
		Scanner ageEntre = new Scanner (System.in);
		int majorite = ageEntre.nextInt();
		
		
		boolean verification = false;
		verification = calculAge(majorite);*/
		int a = 0;
		int b = 1000;
		int nombreAleatoire = chiffreOrdi(a,b) ;
		
		System.out.println("Entre un nombre entre 0 et 1000");
		Scanner nombreEntre = new Scanner (System.in);
		int nombreUtilisateur = nombreEntre.nextInt();
		
		int nombreEssais = 10;
		boolean partieGagnee;
		partieGagnee = comparaison(nombreUtilisateur, nombreAleatoire, 10);
		
	}
}

