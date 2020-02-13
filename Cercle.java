/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe : 000001 
 * Fichier : Cercle.java
 * Date    : 17 f�vrier 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 1)
 */

// La classe Cercle contient les donn�es et les m�thodes pour d�finir un cercle.

public class Cercle {
	private double rayon;

	// Champ d'instance de la classe Cercle.
	// On doit trouver une seule donn�e priv�e (champ d'instance), le rayon du cercle (un double).

	// TODO (� COMPL�TER).

	/*
	 * Le constructeur de la classe Cercle permet de construire un cercle.
	 * 
	 * Param�tre : le rayon du cercle.
	 */

	public Cercle( double rayon ) {

		this.setRayon( rayon );

		// Ex�cuter la m�thode mutateur appropri�e pour modifier le champ d'instance par la valeur re�ue en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getRayon() permet de retourner le rayon du cercle.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le rayon du cercle.
	 */

	public double getRayon() {
		return this.rayon;
		// Retourner le rayon du cercle.
		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setRayon() permet de modifier le rayon du cercle.
	 * 
	 * Param�tre : le nouveau rayon du cercle.
	 * 
	 * Retourne : rien.
	 */

	public void setRayon( double rayon ) {

		this.rayon = rayon;
		// Modifier le rayon du cercle par celui re�u en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode calculerDiametre() permet de calculer le diam�tre du cercle.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le diam�tre du cercle.
	 */

	public double calculerDiametre() {
		double diametre;

		diametre = 2 * rayon;
		return diametre;

		// Calculer et retourner le diam�tre du cercle selon la formule suivante : 2 * rayon.
		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode calculerCirconference() permet de calculer la circonf�rence du cercle.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : la circonf�rence du cercle.
	 */

	public double calculerCirconference() {
		double circonf�rence;

		circonf�rence = 2 * Math.PI * rayon;
		return circonf�rence;

		// Calculer et retourner la circonf�rence du cercle selon la formule suivante : diam�tre * PI.
		// Utiliser la m�thode calculerDiametre() pour obtenir la valeur du diam�tre.
		// Utiliser Math.PI pour obtenir la valeur de PI.
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode calculerSurface() permet de calculer la surface du cercle.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : la surface du cercle.
	 */

	public double calculerSurface() {
		double surface;
		surface = Math.PI * rayon * rayon;
		return surface;

		// Calculer et retourner la surface du cercle selon la formule suivante : PI * rayon * rayon.
		// Utiliser Math.PI pour obtenir la valeur de PI.
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode afficherCercle() permet d'afficher toutes les propri�t�s du cercle.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherCercle() {
		double diametre, surface, circonference;
		diametre = calculerDiametre();
		surface = calculerSurface();
		circonference = calculerCirconference();

		System.out.println( "" + rayon + ", " + diametre + ", " + circonference + ", " + surface );

		// Voir la page 3 de l'�nonc� du TP1 pour le format d'affichage.
		// Le format d'affichage doit �tre int�gralement respect�.

		// TODO (� COMPL�TER).

	}
}