/*
 * Auteurs : Alec et Christian Mongeon,	Groupe :  000001
 * Fichier : PointXY.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 2)
 */

// La classe PointXY contient les données et les méthodes qui permettent de définir un point dans un plan cartésien.

public class PointXY {
	double x;
	double y;

	// Champs d'instance de la classe PointXY.
	// On doit trouver seulement deux données privées (champs d'instance),
	// l'abscisse x (un double) et l'ordonnée y (un double).

	// TODO (À COMPLÉTER).

	/*
	 * Le premier constructeur de la classe PointXY permet de construire un point à l'origine.
	 * 
	 * Paramètre : aucun.
	 */

	public PointXY() {
		this.setX( 0 );
		this.setY( 0 );
		// Exécuter le deuxième constructeur avec les valeurs de base 0,0.
		// Voir la classe Temps (page 16) du document 1 pour vous aider.

		// TODO (À COMPLÉTER).

	}

	/*
	 * Le deuxième constructeur de la classe PointXY permet de construire un point à une position x et y dans le plan
	 * cartésien.
	 * 
	 * Paramètres : une position x et y.
	 */

	public PointXY( double x, double y ) {
		modifierPoint( x, y );
		// Exécuter la méthode modifierPoint(). Vous devez envoyer les bons paramètres à la méthode.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getX() permet de retourner l'abscisse x.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : l'abscisse x.
	 */

	public double getX() {
		return x;
		// Retourner l'abscisse x.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getY() permet de retourner l'ordonnée y.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : l'ordonnée y.
	 */

	public double getY() {
		return y;
		// Retourner l'ordonnée y.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setX() permet de modifier l'abscisse x.
	 * 
	 * Paramètre : la nouvelle abscisse x.
	 * 
	 * Retourne : rien.
	 */

	public void setX( double x ) {
		this.x = x;
		// Modifier l'abscisse x par celle reçue en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setY() permet de modifier l'ordonnée y.
	 * 
	 * Paramètre : la nouvelle ordonnée y.
	 * 
	 * Retourne : rien.
	 */

	public void setY( double y ) {
		this.y = y;
		// Modifier l'ordonnée y par celle reçue en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode modifierPoint() permet de modifier les coordonnées du point.
	 * 
	 * Paramètres : une nouvelle position nouveauX et nouveauY.
	 * 
	 * Retourne : rien.
	 */

	public void modifierPoint( double nouveauX, double nouveauY ) {
		this.setX( nouveauX );
		this.setY( nouveauY );
		// Exécuter les deux méthodes mutateurs appropriées pour modifier les coordonnées x et y du point par
		// les valeurs reçues en paramètres.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode deplacerPoint() permet de déplacer le point en x et en y dans le plan cartésien.
	 * 
	 * Paramètres : un déplacement en x (deplX) et un déplacement en y (deplY).
	 * 
	 * Retourne : rien.
	 */

	public void deplacerPoint( double deplX, double deplY ) {

		x += deplX;
		y += deplY;
		// Il suffit d'ajouter tout simplement les déplacements reçus en paramètres aux coordonnées x et y.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode estOrigine() permet de déterminer si le point est à l'origine (0,0).
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : true si le point est à l'origine (0,0) et false dans le cas contraire.
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
		// Le point est à l'origine si sa coordonnée x est à 0 et que sa coordonnée y est aussi à 0.
		// Aucun message ne doit apparaître à l'écran.
		// L'énoncé return doit se trouver une seule fois, à la fin de la méthode.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode calculerDistance() permet de calculer la distance du point par rapport à l'origine.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : la distance du point par rapport à l'origine.
	 */

	public double calculerDistance() {
		double h;

		h = Math.hypot( x, y );
		return h;

		// On est en présence d'un triangle rectangle.
		// On peut donc appliquer le théorème de Pythagore pour calculer l'hypoténuse qui se trouve à être la distance.
		// Le carré de l'hypoténuse est égal à la somme des carrés des deux autres côtés (h2 = x2 + y2),
		// donc h = racine carrée( x2 + y2 ).
		// Il existe une méthode dans la classe Math qui permet de calculer l'hypoténuse.
		// La distance du point par rapport à l'origine est calculée selon la formule suivante : Math.hypot( x, y ).
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode afficherPoint() permet d'afficher toutes les caractéristiques du point.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherPoint() {

		// Constantes de la méthode.

		final String MESS_ORIGINE = "Le point se trouve à l'origine.";
		final String MESS_PAS_ORIGINE = "Le point ne se trouve pas à l'origine.";
		boolean estOrigine = estOrigine();
		double distancePoint = calculerDistance();
		System.out.println( "Coordonnées du point : ( " + x + ", " + y + " )" );

		if ( estOrigine == true ) {
			System.out.println( "" + MESS_ORIGINE );

		} else {
			System.out.println( "" + MESS_PAS_ORIGINE );
		}
		System.out.println( "Distance du point par rapport à l'origine : " + distancePoint );

		// Voir la page 5 de l'énoncé du TP1 pour le format d'affichage. Le format d'affichage doit être respecté.
		// Utiliser la méthode estOrigine() pour savoir si le point est à l'origine.
		// Utiliser la méthode calculerDistance() pour le calcul de la distance.
		// La distance est affichée seulement si le point n'est pas à l'origine.
		// Utiliser les constantes aux endroits appropriés.

		// TODO (À COMPLÉTER).

	}
}