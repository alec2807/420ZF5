/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe :  000001
 * Fichier : ClientBanque.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 3)
 */

// La classe ClientBanque contient les données et les méthodes pour définir un client de la banque.

public class ClientBanque {
	private String nomClient;
	private Compte compte;

	// Champs d'instance de la classe ClientBanque.
	// On doit trouver seulement deux données privées (champs d'instance),
	// le nom du client (un String) et le compte du client (un Compte).

	// TODO (À COMPLÉTER).

	/*
	 * Le constructeur de la classe ClientBanque permet de construire un client de la banque.
	 * 
	 * Paramètres : un nom, un numéro de compte et un solde.
	 */

	public ClientBanque( String nom, String noCompte, double solde ) {
		this.setNom( nom );
		this.setCompte( noCompte, solde );

		// Exécuter les méthodes mutateurs appropriées pour modifier
		// les champs d'instance par les valeurs reçues en paramètres.
		// Voir la classe Personne (pages 23-24) du document 1 pour vous aider.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getNom() permet de retourner le nom du client.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le nom du client.
	 */

	public String getNom() {
		return nomClient;

		// Retourner le nom du client.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getCompte() permet de retourner le compte du client.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le compte du client.
	 */

	public Compte getCompte() {

		return this.compte;
		// Retourner le compte du client.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setNom() permet de modifier le nom du client.
	 * 
	 * Paramètre : le nouveau nom du client.
	 * 
	 * Retourne : rien.
	 */

	public void setNom( String nom ) {

		this.nomClient = new String( nom );
		// Modifier le nom du client par celui reçu en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setCompte() permet de créer un compte.
	 * 
	 * Paramètres : un nouveau numéro de compte et un nouveau solde.
	 * 
	 * Retourne : rien.
	 */

	public void setCompte( String noCompte, double solde ) {
		this.compte = new Compte( noCompte, solde );
		// Créer un compte avec les informations reçues en paramètre.
		// Voir la méthode setDateNaissance de la classe Personne (page 24) du document 1 pour vous aider.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode afficherClientBanque() permet d'afficher toutes les informations du client.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherClientBanque() {

		System.out.println( "Nom :                   " + nomClient );
		this.getCompte().afficherCompte();

		// Voir en bas de la page 8 de l'énoncé du TP1 pour le format d'affichage.
		// Le format d'affichage doit être respecté.
		// Utiliser la méthode afficherCompte() du compte pour afficher les informations du compte de banque.
		// Le nom du client doit être aligné avec les valeurs du compte.
		// Voir la méthode afficherPersonne() de la classe Personne (page 24) du document 1 pour vous aider.

		// TODO (À COMPLÉTER).

	}
}