

import java.util.Scanner;

public class test {
	
/* public static int [] numeroSecret = new int [1000];
public static int aleatoire =(int)(Math.random()*numeroSecret.length);

	public static void main(String[] args) {		
		
		System.out.println(aleatoire);
		
		int nbreEssais = 10;
		
		while (nbreEssais > 0) {
			System.out.println("Entre un chiffre entre 0 et 1000 :");
			Scanner chiffreRecup = new Scanner (System.in);
			int a = chiffreRecup.nextInt();
			
			
			if (a == aleatoire) {
				System.out.println("C'est gagné !!!");
				nbreEssais = -1 ;
			}
			
			else if (a < aleatoire ) {
				System.out.println("Ton chiffre est trop petit");
				nbreEssais--;
				
			}
			else if (a > aleatoire ){
				System.out.println("Ton chiffre est trop grand");
				nbreEssais--;
			}
			if (nbreEssais == 0) {
				System.out.println("Game Over");
			}
			if (nbreEssais == 1) {
				System.out.println("Attention, plus qu'une dernière chance");
			}
		}	
	} */
	boolean calculAge (int a) {
		//l'utilisateur entre son age
		
		System.out.println("Quelle est ton age?");
		Scanner ageEntre = new Scanner (System.in);
		int majorite = ageEntre.nextInt();
		
		boolean calculAge = false;
		
		if( majorite >= 18) {
			System.out.println("Tu es majeur, bienvenue");
			return true;
		}
			else {
				System.out.println("Tu es mineur, tu dois avoir 18 ans pour jouer");
				return false;
			}
		}
}
