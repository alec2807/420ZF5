package RochonAlec.AT01;

import java.util.Scanner;

/**
 * 
 * @author 1870464
 *
 *         Programme qui permettra à l’utilisateur d’effectuer diverses
 *         opérations mathématiques.
 */
public class Atelier01 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int valeurEntiere1, valeurEntiere2, valeurEntiere3, base, valeurMax, valeurExposee = 0, exposant, nbEntiers,
				sommeEntiers, valMax, choixValide;
		double notePourcent;
		float moyenne;
		char choix, lettrePourcent;
		String croissantOuDecroissant;

		do {
			System.out.println("Menu principal");
			System.out.println("-------------------------");
			System.out.println("1 -Calcul moyenne");
			System.out.println("2 -Determine ordre");
			System.out.println("3 -Exposant maximal");
			System.out.println("4 -Calcul somme");
			System.out.println("5 -Exercice multiplication");
			System.out.println("6 -Table multiplication");
			System.out.println("7 -Conversion d'une note");
			System.out.println("9 -Quitter");
			System.out.println("Votre choix > ");
			choix = clavier.next().charAt(0);
			switch (choix) {

			case '1':
				choixValide = 1;
				do {
				System.out.println("Entrez 3 valeurs separees par des espaces :");
				valeurEntiere1 = clavier.nextInt();
				valeurEntiere2 = clavier.nextInt();
				valeurEntiere3 = clavier.nextInt();
				if ((valeurEntiere1 > 100)||(valeurEntiere2 > 100)||(valeurEntiere3 > 100)) {
					System.out.println("Erreur, 1 ou plusieurs données sont invalide (s)");
					
				
				}//Fin if
				}while (choixValide != 0);
				choixValide = 0;

				moyenne = calculerMoyenne(valeurEntiere1, valeurEntiere2, valeurEntiere3);
				System.out.println("La moyenne vaut: " + moyenne);

				break;
			case '2':// Erreur avec le croissant: me dit quelquonque même quand croissant
				System.out.println("Entrez 3 valeurs separees par des espaces :");
				valeurEntiere1 = clavier.nextInt();
				valeurEntiere2 = clavier.nextInt();
				valeurEntiere3 = clavier.nextInt();
				croissantOuDecroissant = ordre(valeurEntiere1, valeurEntiere2, valeurEntiere3);
				System.out.println("Valeurs en ordre " + croissantOuDecroissant);

				break;
			case '3':
				System.out.println("Entrez une base: ");
				base = clavier.nextInt();
				System.out.println("Entrez la valeur recherchee :");
				valeurMax = clavier.nextInt();

				exposant = expMax(base, valeurMax);
				valeurExposee = valeurExposee(base, valeurMax);
				System.out.println("La valeur la plus pres de la valeur recherchee est : " + valeurExposee
						+ " en utilisant la base = " + base + " et l'exposant = " + exposant);

				break;
			case '4':
				System.out.println("Calcule la somme des n premiers entiers. Inscrivez n : ");
				nbEntiers = clavier.nextInt();
				sommeEntiers = somme(nbEntiers);
				System.out.println("La somme des " + nbEntiers + " premiers entiers vaut " + sommeEntiers);

				break;
			case '5':
				System.out.println("Insrivez la valeur maximale voulue :  ");
				valMax = clavier.nextInt();
				exMult(clavier, valMax);

				break;
			case '6':
				System.out.println("Indiquez la valeur maximale de la table :");
				valMax = clavier.nextInt();
				if ((valMax < 1) || (valMax > 25)) {
					do {
						System.out.println(
								"Erreur. Table non comprise entre 1 et 25. Veuillez indiquez la valeur maximale de la table :");
						valMax = clavier.nextInt();
					} while ((valMax < 1) || (valMax > 25));
				} // Fin if
			case '7':
				System.out.println("Entrez la note en pourcentage : ");
				notePourcent = clavier.nextDouble();
				lettrePourcent = conversionNote ( notePourcent );
				System.out.println("La note en lettre est: "+lettrePourcent);
				break;
				
			}
			System.out.println("-------------------------");
		} while (choix != 9);

		System.out.println("Au revoir");
		clavier.close();
	}// Fin public static void main

	public static float calculerMoyenne(float valeurEntiere1, float valeurEntiere2, float valeurEntiere3) {
		float moyenne = 0;
		moyenne = (valeurEntiere1 + valeurEntiere2 + valeurEntiere3) / 3;
		
		if((valeurEntiere1 < 0)||(valeurEntiere1 > 100)||(valeurEntiere2 < 0)||(valeurEntiere2 > 100)||(valeurEntiere3 < 0)||(valeurEntiere3 > 100) ){
		
		moyenne = -1;
		return moyenne;
		}//Fin if
		else {
			moyenne = (valeurEntiere1 + valeurEntiere2 + valeurEntiere3) / 3;

		return moyenne;
		}

	}// Fin public static double calculerMoyenne

	
	/*
	 * croissantOuDecroissant String est la variable contenant soit croissant, décroissant ou quelquonque selon le cas
	 * nb1 int est le premier nombre entré par l'utilisateur
	 * nb2 int est le deuxième nombre entré par l'utilisateur
	 * nb3 int est le troisième nombre entré par l'utilisateur
	 */
	public static String ordre(int nb1, int nb2, int nb3) {
		String croissantOuDecroissant = "Quelquonque";
		if ((nb1 < nb2) && (nb2 < nb3) && (nb1 < nb3)) {// if1
			croissantOuDecroissant = "croissant";
			return croissantOuDecroissant; 
		} // Fin if1

		if ((nb1 > nb2) && (nb2 > nb3) && (nb1 > nb3)) {// if2
			croissantOuDecroissant = "decroissant";
			return croissantOuDecroissant;
		} // Fin if2
		if((nb1 == nb2) && (nb2 == nb3) && (nb1 == nb3)) {// if 3
			croissantOuDecroissant = "constant";
			return croissantOuDecroissant;
		}// Fin if3
		if ((nb1 == nb2)&&(nb1 < nb3)) {
			croissantOuDecroissant = "croissant";
			return croissantOuDecroissant;
		}//Fin if4
		if ((nb1 < nb2)&&(nb2 == nb3)) {
			croissantOuDecroissant = "croissant";
			return croissantOuDecroissant;
		}//Fin if5
		if ((nb1 == nb2)&&(nb1 > nb3)){
			croissantOuDecroissant = "decroissant";
			return croissantOuDecroissant;
		}//Fin if6
		if ((nb1 > nb2)&&(nb2 == nb3)){
			croissantOuDecroissant = "decroissant";
			return croissantOuDecroissant;
		}
		else {
			croissantOuDecroissant = "quelquonque";
		    return croissantOuDecroissant;	
		}//Fin else
		
	}// Fin public static string ordre

	
	/*
	 * base int est la base à utiliser
	 * ValeurExposee int est la valeur maximale de la base exposée sans dépasser valeurMax
	 * valeurMax int est la valeur à ne pas dépasser
	 * exposant int est l'exposant utilisé pour exposer la base
	 */
	public static int expMax(int base, int valeurMax) {
		int valeurExposee, exposant = 0;
		if ((valeurMax < 1)||(base < 1)){
		exposant = -1;
		return exposant;
		}
		else {

		do {// début do
			valeurExposee = (int) Math.pow(base, exposant);
			++exposant;
		} while (valeurExposee <= valeurMax);// Fin do
		exposant = exposant - 2;
		valeurExposee = (int) Math.pow(base, exposant);
		return exposant;
		}//Fin else

	}// Fin public static int somme
	
	
	/*
	 * base int est la base à utiliser
	 * ValeurExposee int est la valeur maximale de la base exposée sans dépasser valeurMax
	 * valeurMax int est la valeur à ne pas dépasser
	 * exposant int est l'exposant utilisé pour exposer la base
	 */
	public static int valeurExposee(int base, int valeurMax) {
		int valeurExposee = 0, exposant = 0;
		if ((valeurMax < 1)||(base < 1)){
			exposant = -1;
			return exposant;
		}
		else {
		do {// début do
			valeurExposee = (int) Math.pow(base, exposant);
			++exposant;
		} while (valeurExposee <= valeurMax);// Fin do
		exposant = exposant - 2;
		valeurExposee = (int) Math.pow(base, exposant);
		return valeurExposee;
		}//Fin else

	}// Fin public static valeurExposee

	
	/**
	 * Variable nouvelEntier int est chaque entier à additionner à valeurAdd int dans la boucle
	 * Variable nbF	int est le nombre de fois que la boucle doit se répéter 
	 * @param nbMax Variable int représentant le nombre d'entiers à additionner
	 * @return valeurAdd int étant la valeur additionnée et compilée de chaque entier
	 */
	public static int somme(int nbMax) {
		int valeurAdd = 0, nbF = 0, nouvelEntier = 0;
		do {
			nouvelEntier++;
			valeurAdd = valeurAdd + nouvelEntier;
			nbF++;

		} while (nbF < nbMax);// Fin do
		if ((nbMax < 0)||(valeurAdd > Integer.MAX_VALUE)){
		valeurAdd = -1;
		return valeurAdd;
		}//Fin if
		if(nbMax == 0){
		valeurAdd = 0;
		return valeurAdd;
		}//Fin if2
		else {
		return valeurAdd;
		}//Fin else
	}// Fin public static sommeEntiers

	
	/*
	 * reponse int est définit par le quotient de la réponse de
	 * random_int et random_int2 
	 * reponseEntree int est une variable entrée par l'utilisateur
	 * bonOuNon est une variable booléenne utilisée pour savoir si l'utilisateur entre la
	 * même réponse que la variable reponse (Bonne réponse == true, Mauvaise réponse
	 * == False)
	 */
	public static void exMult(Scanner clavier, int valMax) {
		int reponse, reponseEntree;
		boolean bonOuNon = true;

		do {
			int random_int = (int) (Math.random() * (valMax - 0));
			int random_int2 = (int) (Math.random() * (valMax - 0));
			reponse = random_int * random_int2;

			System.out.println("Combien font " + random_int + "*" + random_int2);
			reponseEntree = clavier.nextInt();
			if (reponseEntree == reponse) {
				System.out.println("BRAVO! Vous avez la bonne réponse");

			} else {
				System.out.println("Erreur, le resultat de " + random_int + " * " + random_int2 + " est " + reponse);
				bonOuNon = false;
			} // Fin else

		} while (bonOuNon != false);
	}// Fin public static void exMult

	/*
	 * String Espace est une variable utilisée pour formatter l'affichage dans la console
	 * String Espace2 est une variable utilisée pour formatter l'affichage dans la console
	 * valAff int est la variable utilisée pour afficher les nombre en haut du tableau
	 * nbF est un compteur utilisée pour une des boucles
	 * nbF1 est un compteur utilis pour une des boucles
	 * valChange int est la variable utilisée pour afficher les nombres à la gauche du tableau ainsi que les
	 * nombres horizontalement sur une ligne à l'aide d'une boucle
	 * multiplicateur int est le multiplicateur de la variablle valChange en fonction de valMax et de la boucle
	 */
	public static void tableMult(int valMax) {
		String Espace = " X |";
		String Espace2 = " |";
		int valAff = 1, nbF = 0, valChange = 1, nbF1 = 0, mutliplicateur = 1;

		System.out.print(String.format("%-4s", Espace));

		do {
			System.out.print(String.format("%4d", valAff));
			valAff++;
			nbF++;
		} while (nbF < valMax - 1);// Fin do
		System.out.println(String.format("%4d", valAff));
		System.out.print("---+");
		nbF = 0;
		do {
			System.out.print("----");
			nbF++;
		} while (nbF < valMax - 1);// Fin do
		System.out.println("----");
		nbF = 0;//reset compteur
		
		do {
		   System.out.print(String.format("%2d", valChange));
		   System.out.print(String.format("%2s", Espace2));
		   nbF = 0;
		   mutliplicateur = 1;
		
		    do {
		        System.out.print(String.format("%4d", valChange * mutliplicateur));	
		    	mutliplicateur++;
		    	nbF++;
		    } while (nbF < valMax - 1);// Fin do
		    System.out.println(String.format("%4d", valChange * mutliplicateur));	
		valChange++;    
		nbF1++;
		} while (nbF1 < valMax);// Fin do

	}// Fin public static void tableMult
	
	
    public static char conversionNote (double notePourcent) {
    char lettre = 'X';
    if((notePourcent <= 100)&&(notePourcent >= 91)) {
        lettre = 'A';
    }//Fin if
    
    if((notePourcent <= 90)&&(notePourcent >= 75)) {
        lettre = 'B';	
    }//Fin if
    if((notePourcent <= 74)&&(notePourcent >= 61)) {
        lettre = 'C';	
    }//Fin if
    if((notePourcent <= 60)&&(notePourcent >= 51)) {
        lettre = 'D';	
    }//Fin if
    if((notePourcent <= 50)&&(notePourcent >= 0)) {
        lettre = 'E';	
    }//Fin if
    if ((notePourcent > 100)|| (notePourcent < 0)){
    	lettre = 'X';
    }//Fin if 
    else {
    	
    }//Fin else
    
    return lettre;	
    }//Fin public satic char conversionNote

}// Fin public class Atelier 01
