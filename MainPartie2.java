/*
* Auteurs : Alec Rochon et Christian Mongeon,	Groupe : 000001
* Fichier : MainPartie2.java
* Date    : 17 février 2020
* Cours   : 420-ZD5-MO (TP1, Partie 2, PointXY)
*/

// La classe MainPartie2 contient la méthode principale main() qui permet de tester la classe PointXY.

public class MainPartie2 {

	// Méthode principale main().

	public static void main( String[] args ) {
		PointXY point1, point2, point3;

		System.out.println( "\nTESTER new PointXY() pour le point 1." );

		point1 = new PointXY();

		System.out.println( "\nTESTER new PointXY( 5, 10 ) pour le point 2." );

		point2 = new PointXY( 5, 10 );

		System.out.println( "\nTESTER afficherPoint() pour le point 1 ( ( 0.0, 0.0 ), origine )." );

		point1.afficherPoint();

		System.out.println( "\nTESTER afficherPoint() pour le point 2 ( ( 5.0, 10.0 ), pas à l'origine, 11.180 )." );

		point2.afficherPoint();

		System.out.println( "\nTESTER estOrigine() pour le point 1 ( 0, 0 ) ( true )." );

		System.out.println( "\nestOrigine() de point 1 : " + point1.estOrigine() );

		System.out.println( "\nTESTER estOrigine() pour le point 2 ( 5, 10 ) ( false )." );

		System.out.println( "\nestOrigine() de point 2 : " + point2.estOrigine() );

		System.out.println( "\nTESTER setX( 0 ) pour le point 2 ( 0, 10 ) " );

		point2.setX( 0 );

		System.out.println( "\nTESTER estOrigine() pour le point 2 ( 0, 10 ) ( false )." );

		System.out.println( "\nestOrigine() de point 2 : " + point2.estOrigine() );

		System.out.println( "\nTESTER setY( 0 ) pour le point 2 ( 0, 0 ) " );

		point2.setY( 0 );

		System.out.println( "\nTESTER estOrigine() pour le point 2 ( 0, 0 ) ( true )." );

		System.out.println( "\nestOrigine() de point 2 : " + point2.estOrigine() );

		System.out.println( "\nTESTER getX() et getY() pour le point 2 ( 0, 0 ) " );

		System.out.println( "\n( x, y ) du point 2 : ( " + point2.getX() + ", " + point2.getY() + " )" );

		System.out.println( "\nTESTER modifierPoint( 2, 0 ) pour le point 1 " );

		point1.modifierPoint( 2, 0 );

		System.out.println( "\n( x, y ) du point 1 : ( " + point1.getX() + ", " + point1.getY() + " )" );

		System.out.println( "\nTESTER estOrigine() pour le point 1 ( 2, 0 ) ( false )." );

		System.out.println( "\nestOrigine() de point 1 : " + point1.estOrigine() );

		System.out.println( "\nTESTER deplacerPoint( 5, 3 ) pour le point 1 ( 7, 3 ) " );

		point1.deplacerPoint( 5, 3 );

		System.out.println( "\n( x, y ) du point 1 : ( " + point1.getX() + ", " + point1.getY() + " )" );

		System.out.println( "\nTESTER deplacerPoint( -1, -5 ) pour le point 1 ( 6, -2 ) " );

		point1.deplacerPoint( -1, -5 );

		System.out.println( "\n( x, y ) du point 1 : ( " + point1.getX() + ", " + point1.getY() + " )" );

		System.out.println( "\nTESTER calculerDistance() pour le point 1 ( 6, -2 ) : (6.324)." );

		System.out.println( "\nDistance du point 1 : " + point1.calculerDistance() );

		System.out.println( "\nTESTER afficherPoint() du point 1 ( ( 6, -2 ), pas à l'origine, 6.324 )." );

		point1.afficherPoint();

		System.out.println( "\nTESTER afficherPoint() du point 2 ( ( 0, 0 ), origine )." );

		point2.afficherPoint();

		System.out.println( "\nTESTER NOUVELLES INSTRUCTIONS.\n" );

		// TODO (À COMPLÉTER).

		// Vous devez ajouter des instructions qui permettent de (en utilisant les méthodes appropriées) :
		//
		// • créer un autre objet point3 de la classe PointXY en utilisant des valeurs de x et de y de votre choix;
		// • d'afficher toutes les caractéristiques de l'objet point3;
		// • de modifier l'objet point3 par la valeur 5 pour le x et la valeur 9 pour le y;
		// • d'afficher seulement la nouvelle distance de l'objet point3, accompagné d'un message approprié.
		point3 = new PointXY( 10, 15 );

		point3.afficherPoint();

		point1.modifierPoint( 5, 9 );

		System.out.println( "\n( x, y ) du point 3 : ( " + point3.getX() + ", " + point3.getY() + " )" );

	}
}