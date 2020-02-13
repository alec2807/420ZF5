/*
 * Auteurs : Alec et Christian Mongeon,	Groupe :  000001
 * Fichier : PointXY.java
 * Date    : 17 f�vrier 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 2)
 */

// La classe PointXY contient les donn�es et les m�thodes qui permettent de d�finir un point dans un plan cart�sien.

public class PointXY {
	double x;
	double y;

	// Champs d'instance de la classe PointXY.
	// On doit trouver seulement deux donn�es priv�es (champs d'instance),
	// l'abscisse x (un double) et l'ordonn�e y (un double).

	// TODO (� COMPL�TER).

	/*
	 * Le premier constructeur de la classe PointXY permet de construire un point � l'origine.
	 * 
	 * Param�tre : aucun.
	 */

	public PointXY() {
		this.setX( 0 );
		this.setY( 0 );
		// Ex�cuter le deuxi�me constructeur avec les valeurs de base 0,0.
		// Voir la classe Temps (page 16) du document 1 pour vous aider.

		// TODO (� COMPL�TER).

	}

	/*
	 * Le deuxi�me constructeur de la classe PointXY permet de construire un point � une position x et y dans le plan
	 * cart�sien.
	 * 
	 * Param�tres : une position x et y.
	 */

	public PointXY( double x, double y ) {
		modifierPoint( x, y );
		// Ex�cuter la m�thode modifierPoint(). Vous devez envoyer les bons param�tres � la m�thode.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getX() permet de retourner l'abscisse x.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : l'abscisse x.
	 */

	public double getX() {
		return x;
		// Retourner l'abscisse x.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getY() permet de retourner l'ordonn�e y.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : l'ordonn�e y.
	 */

	public double getY() {
		return y;
		// Retourner l'ordonn�e y.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setX() permet de modifier l'abscisse x.
	 * 
	 * Param�tre : la nouvelle abscisse x.
	 * 
	 * Retourne : rien.
	 */

	public void setX( double x ) {
		this.x = x;
		// Modifier l'abscisse x par celle re�ue en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setY() permet de modifier l'ordonn�e y.
	 * 
	 * Param�tre : la nouvelle ordonn�e y.
	 * 
	 * Retourne : rien.
	 */

	public void setY( double y ) {
		this.y = y;
		// Modifier l'ordonn�e y par celle re�ue en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode modifierPoint() permet de modifier les coordonn�es du point.
	 * 
	 * Param�tres : une nouvelle position nouveauX et nouveauY.
	 * 
	 * Retourne : rien.
	 */

	public void modifierPoint( double nouveauX, double nouveauY ) {
		this.setX( nouveauX );
		this.setY( nouveauY );
		// Ex�cuter les deux m�thodes mutateurs appropri�es pour modifier les coordonn�es x et y du point par
		// les valeurs re�ues en param�tres.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode deplacerPoint() permet de d�placer le point en x et en y dans le plan cart�sien.
	 * 
	 * Param�tres : un d�placement en x (deplX) et un d�placement en y (deplY).
	 * 
	 * Retourne : rien.
	 */

	public void deplacerPoint( double deplX, double deplY ) {

		x += deplX;
		y += deplY;
		// Il suffit d'ajouter tout simplement les d�placements re�us en param�tres aux coordonn�es x et y.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode estOrigine() permet de d�terminer si le point est � l'origine (0,0).
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : true si le point est � l'origine (0,0) et false dans le cas contraire.
	 */

	public boolean estOrigine() {
		boolean estOrigine;

		if ( ( x == 0 ) && ( y == 0 ) ) {
			estOrigine = true;
		} // Fin if
		else {
			estOrigine = false;
		} // Fin else
		return estOrigine;
		// Le point est � l'origine si sa coordonn�e x est � 0 et que sa coordonn�e y est aussi � 0.
		// Aucun message ne doit appara�tre � l'�cran.
		// L'�nonc� return doit se trouver une seule fois, � la fin de la m�thode.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode calculerDistance() permet de calculer la distance du point par rapport � l'origine.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : la distance du point par rapport � l'origine.
	 */

	public double calculerDistance() {
		double h;

		h = Math.hypot( x, y );
		return h;

		// On est en pr�sence d'un triangle rectangle.
		// On peut donc appliquer le th�or�me de Pythagore pour calculer l'hypot�nuse qui se trouve � �tre la distance.
		// Le carr� de l'hypot�nuse est �gal � la somme des carr�s des deux autres c�t�s (h2 = x2 + y2),
		// donc h = racine carr�e( x2 + y2 ).
		// Il existe une m�thode dans la classe Math qui permet de calculer l'hypot�nuse.
		// La distance du point par rapport � l'origine est calcul�e selon la formule suivante : Math.hypot( x, y ).
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode afficherPoint() permet d'afficher toutes les caract�ristiques du point.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherPoint() {

		// Constantes de la m�thode.

		final String MESS_ORIGINE = "Le point se trouve � l'origine.";
		final String MESS_PAS_ORIGINE = "Le point ne se trouve pas � l'origine.";
		boolean estOrigine = estOrigine();
		double distancePoint = calculerDistance();
		System.out.println( "Coordonn�es du point : ( " + x + ", " + y + " )" );

		if ( estOrigine == true ) {
			System.out.println( "" + MESS_ORIGINE );

		} else {
			System.out.println( "" + MESS_PAS_ORIGINE );
		}
		System.out.println( "Distance du point par rapport � l'origine : " + distancePoint );

		// Voir la page 5 de l'�nonc� du TP1 pour le format d'affichage. Le format d'affichage doit �tre respect�.
		// Utiliser la m�thode estOrigine() pour savoir si le point est � l'origine.
		// Utiliser la m�thode calculerDistance() pour le calcul de la distance.
		// La distance est affich�e seulement si le point n'est pas � l'origine.
		// Utiliser les constantes aux endroits appropri�s.

		// TODO (� COMPL�TER).

	}
}