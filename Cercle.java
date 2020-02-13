/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe : 000001 
 * Fichier : Cercle.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 1)
 */

// La classe Cercle contient les données et les méthodes pour définir un cercle.

public class Cercle {
	private double rayon;

	// Champ d'instance de la classe Cercle.
	// On doit trouver une seule donnée privée (champ d'instance), le rayon du cercle (un double).

	// TODO (À COMPLÉTER).

	/*
	 * Le constructeur de la classe Cercle permet de construire un cercle.
	 * 
	 * Paramètre : le rayon du cercle.
	 */

	public Cercle( double rayon ) {

		this.setRayon( rayon );

		// Exécuter la méthode mutateur appropriée pour modifier le champ d'instance par la valeur reçue en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getRayon() permet de retourner le rayon du cercle.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le rayon du cercle.
	 */

	public double getRayon() {
		return this.rayon;
		// Retourner le rayon du cercle.
		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setRayon() permet de modifier le rayon du cercle.
	 * 
	 * Paramètre : le nouveau rayon du cercle.
	 * 
	 * Retourne : rien.
	 */

	public void setRayon( double rayon ) {

		this.rayon = rayon;
		// Modifier le rayon du cercle par celui reçu en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode calculerDiametre() permet de calculer le diamètre du cercle.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le diamètre du cercle.
	 */

	public double calculerDiametre() {
		double diametre;

		diametre = 2 * rayon;
		return diametre;

		// Calculer et retourner le diamètre du cercle selon la formule suivante : 2 * rayon.
		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode calculerCirconference() permet de calculer la circonférence du cercle.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : la circonférence du cercle.
	 */

	public double calculerCirconference() {
		double circonférence;

		circonférence = 2 * Math.PI * rayon;
		return circonférence;

		// Calculer et retourner la circonférence du cercle selon la formule suivante : diamètre * PI.
		// Utiliser la méthode calculerDiametre() pour obtenir la valeur du diamètre.
		// Utiliser Math.PI pour obtenir la valeur de PI.
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode calculerSurface() permet de calculer la surface du cercle.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : la surface du cercle.
	 */

	public double calculerSurface() {
		double surface;
		surface = Math.PI * rayon * rayon;
		return surface;

		// Calculer et retourner la surface du cercle selon la formule suivante : PI * rayon * rayon.
		// Utiliser Math.PI pour obtenir la valeur de PI.
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode afficherCercle() permet d'afficher toutes les propriétés du cercle.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherCercle() {
		double diametre, surface, circonference;
		diametre = calculerDiametre();
		surface = calculerSurface();
		circonference = calculerCirconference();

		System.out.println( "" + rayon + ", " + diametre + ", " + circonference + ", " + surface );

		// Voir la page 3 de l'énoncé du TP1 pour le format d'affichage.
		// Le format d'affichage doit être intégralement respecté.

		// TODO (À COMPLÉTER).

	}
}