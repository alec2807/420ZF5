/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe :  000001
 * Fichier : ClientBanque.java
 * Date    : 17 f�vrier 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 3)
 */

// La classe ClientBanque contient les donn�es et les m�thodes pour d�finir un client de la banque.

public class ClientBanque {
	private String nomClient;
	private Compte compte;

	// Champs d'instance de la classe ClientBanque.
	// On doit trouver seulement deux donn�es priv�es (champs d'instance),
	// le nom du client (un String) et le compte du client (un Compte).

	// TODO (� COMPL�TER).

	/*
	 * Le constructeur de la classe ClientBanque permet de construire un client de la banque.
	 * 
	 * Param�tres : un nom, un num�ro de compte et un solde.
	 */

	public ClientBanque( String nom, String noCompte, double solde ) {
		this.setNom( nom );
		this.setCompte( noCompte, solde );

		// Ex�cuter les m�thodes mutateurs appropri�es pour modifier
		// les champs d'instance par les valeurs re�ues en param�tres.
		// Voir la classe Personne (pages 23-24) du document 1 pour vous aider.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getNom() permet de retourner le nom du client.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le nom du client.
	 */

	public String getNom() {
		return nomClient;

		// Retourner le nom du client.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getCompte() permet de retourner le compte du client.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le compte du client.
	 */

	public Compte getCompte() {

		return this.compte;
		// Retourner le compte du client.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setNom() permet de modifier le nom du client.
	 * 
	 * Param�tre : le nouveau nom du client.
	 * 
	 * Retourne : rien.
	 */

	public void setNom( String nom ) {

		this.nomClient = new String( nom );
		// Modifier le nom du client par celui re�u en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setCompte() permet de cr�er un compte.
	 * 
	 * Param�tres : un nouveau num�ro de compte et un nouveau solde.
	 * 
	 * Retourne : rien.
	 */

	public void setCompte( String noCompte, double solde ) {
		this.compte = new Compte( noCompte, solde );
		// Cr�er un compte avec les informations re�ues en param�tre.
		// Voir la m�thode setDateNaissance de la classe Personne (page 24) du document 1 pour vous aider.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode afficherClientBanque() permet d'afficher toutes les informations du client.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherClientBanque() {

		System.out.println( "Nom :                   " + nomClient );
		this.getCompte().afficherCompte();

		// Voir en bas de la page 8 de l'�nonc� du TP1 pour le format d'affichage.
		// Le format d'affichage doit �tre respect�.
		// Utiliser la m�thode afficherCompte() du compte pour afficher les informations du compte de banque.
		// Le nom du client doit �tre align� avec les valeurs du compte.
		// Voir la m�thode afficherPersonne() de la classe Personne (page 24) du document 1 pour vous aider.

		// TODO (� COMPL�TER).

	}
}