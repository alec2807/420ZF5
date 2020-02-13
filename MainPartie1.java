/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe : 000001
 * Fichier : MainPartie1.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 1, Cercle)
 */

// La classe MainPartie1 contient la méthode principale main() qui permet de tester la classe Cercle.

public class MainPartie1 {

	// Méthode principale main().

	public static void main( String[] args ) {
		Cercle cercle1, cercle2, cercle3;

		System.out.println( "\nTESTER new Cercle() pour les cercles 1 et 2." );

		cercle1 = new Cercle( 10 );
		cercle2 = new Cercle( 30 );
		cercle3 = new Cercle( 40 );

		System.out.println( "\nTESTER afficherCercle() pour le cercle 1 (10.0, 20.0, 62.831, 314.159)." );

		cercle1.afficherCercle();

		System.out.println( "\nTESTER afficherCercle() pour le cercle 2 (30.0, 60.0, 188.495, 2827.433)." );

		cercle2.afficherCercle();

		System.out.println( "\nTESTER setRayon( 15 ) pour le cercle 2." );

		cercle2.setRayon( 15 );

		System.out.println( "\nTESTER getRayon() pour le cercle 2." );

		System.out.println( "\nNouveau rayon du cercle2 (15.0) : " + cercle2.getRayon() );

		System.out.println( "\nTESTER calculerDiametre() pour le cercle 2." );

		System.out.println( "\nNouveau diamètre du cercle2 (30.0) : " + cercle2.calculerDiametre() );

		System.out.println( "\nTESTER calculerCirconference() pour le cercle 2." );

		System.out.println( "\nNouvelle circonférence du cercle2 (94.247) : " + cercle2.calculerCirconference() );

		System.out.println( "\nTESTER calculerSurface() pour le cercle 2." );

		System.out.println( "\nNouvelle surface du cercle2 (706.858) : " + cercle2.calculerSurface() );

		System.out.println( "\nTESTER NOUVELLES INSTRUCTIONS.\n" );

		System.out.println( "\nNOUVELLES INSTRUCTIONS: \n" );

		System.out.println( "\nTESTER afficherCercle() pour le cercle 3 :" );

		cercle3.afficherCercle();

		System.out.println( "\nTESTER setRayon( 17 ) pour le cercle 3." );

		cercle3.setRayon( 17 );

		System.out.println( "\nNouveau diamètre du cercle3 ( 34 ) : " + cercle3.calculerDiametre() );

		// TODO (À COMPLÉTER).

		// Vous devez ajouter des instructions qui permettent de (en utilisant les méthodes appropriées) :
		//
		// • créer un autre objet cercle3 de la classe Cercle en utilisant une valeur de rayon de votre choix;
		// • d'afficher toutes les propriétés de l'objet cercle3;
		// • de modifier le rayon de l'objet cercle3 par la valeur 17;
		// • d'afficher seulement le nouveau diamètre de l'objet cercle3, accompagné d'un message approprié.

	}
}