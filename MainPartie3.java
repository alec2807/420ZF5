/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe :  000001
 * Fichier : MainPartie3.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 3, ClientBanque, Compte)
 */

// La classe MainPartie3 contient la méthode principale main() qui permet de tester les classes ClientBanque et Compte.

public class MainPartie3 {

	// Méthode principale main().

	public static void main( String[] args ) {
		ClientBanque client1, client2, client3;

		System.out.println( "\nTESTER new ClientBanque() pour les clients 1 et 2." );

		client1 = new ClientBanque( "Catherine", "00123", 2000 );
		client2 = new ClientBanque( "Vincent", "00456", 5000 );
		client3 = new ClientBanque( "Lec", "00280", 2500 );

		System.out.println( "\nTESTER afficherClientBanque() pour le client 1 (Catherine, 00123, 2000)." );

		client1.afficherClientBanque();

		System.out.println( "\nTESTER afficherClientBanque() pour le client 2 (Vincent, 00456, 5000)." );

		client2.afficherClientBanque();

		System.out.println( "\nTESTER setNom( \"Simon\" ) pour le client 2 et\nTESTER getNom() (Simon)." );

		client2.setNom( "Simon" );
		System.out.println( "\nNom du client2 : " + client2.getNom() );

		System.out.println( "\nTESTER setCompte( \"00789\", 10000 ) pour le client 1 et\nTESTER "
				+ "getCompte().getNoCompte() (00789) et getCompte().getSolde() (10000)." );

		client1.setCompte( "00789", 10000 );
		System.out.println( "\nNuméro de compte du client1 : " + client1.getCompte().getNoCompte() );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().setNoCompte( \"22222\" ) pour le client 2 et\nTESTER "
				+ "getCompte().setSolde( 0 ) pour le client 2 et\nTESTER "
				+ "getCompte().afficherCompte() pour le client 2 (22222, 0)." );

		client2.getCompte().setNoCompte( "22222" );
		client2.getCompte().setSolde( 0 );
		client2.getCompte().afficherCompte();

		System.out.println( "\nTESTER getCompte().setSolde( -50 ) pour le client 1 (10000)" );

		client1.getCompte().setSolde( -50 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().modifierCompte( \"11111\", 3000 ) pour le client 1 et\nTESTER "
				+ "afficherClientBanque() (Catherine, 11111, 3000)." );

		client1.getCompte().modifierCompte( "11111", 3000 );
		client1.afficherClientBanque();

		System.out.println( "\nTESTER getCompte().deposerArgent( 300 ) pour le client 1 (3300)" );

		client1.getCompte().deposerArgent( 300 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().deposerArgent( -300 ) pour le client 1 (3300)" );

		client1.getCompte().deposerArgent( -300 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().retirerArgent( 300 ) pour le client 1 (3000)" );

		client1.getCompte().retirerArgent( 300 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().retirerArgent( -300 ) pour le client 1 (3000)" );

		client1.getCompte().retirerArgent( -300 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().retirerArgent( 3500 ) pour le client 1 (3000)" );

		client1.getCompte().retirerArgent( 3500 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER getCompte().retirerArgent( 3000 ) pour le client 1 (0)" );

		client1.getCompte().retirerArgent( 3000 );
		System.out.println( "\nSolde du client1 : " + client1.getCompte().getSolde() );

		System.out.println( "\nTESTER afficherClientBanque() de client 1 (Catherine, 11111, 0.0)." );

		client1.afficherClientBanque();

		System.out.println( "\nTESTER afficherClientBanque() de client 2 (Simon, 22222, 0.0)." );

		client2.afficherClientBanque();

		System.out.println( "\nTESTER NOUVELLES INSTRUCTIONS.\n" );

		// TODO (À COMPLÉTER).

		System.out.println( "\nTESTER afficherClientBanque() de client 3 (Lec, 00280, 2500.0)." );

		client3.afficherClientBanque();

		client3.setNom( "Théo" );

		client3.getCompte().deposerArgent( 500 );

		System.out.println( "\nTESTER setNom( \"Théo\" ) pour le client 3 et\nTESTER getNom() (Théo)." );

		System.out.println( "Nouveau nom du client3 : " + client3.getNom() );

		System.out.println( "\nTESTER getCompte().deposerArgent( 500 ) pour le client 3 (3000)" );

		System.out.println( "Nouveau solde du client3 : " + client3.getCompte().getSolde() );

		// Vous devez ajouter des instructions qui permettent de (en utilisant les méthodes appropriées) :
		//
		// • créer un autre objet client3 de la classe ClientBanque en utilisant des valeurs de nom,
		// de numéro de compte et de solde de votre choix;
		// • d'afficher toutes les informations de l'objet client3;
		// • de modifier le nom de l'objet client3 par "Théo";
		// • de déposer 500 $ dans le compte de l'objet client3;
		// • d'afficher seulement le nouveau nom de l'objet client3, accompagné d'un message approprié.
		// • d'afficher seulement le nouveau solde de l'objet client3, accompagné d'un message approprié.

	}
}