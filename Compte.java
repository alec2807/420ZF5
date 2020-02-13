/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe :  000001
 * Fichier : Compte.java
 * Date    : 17 f�vrier 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 3)
 */

// La classe Compte contient les donn�es et les m�thodes pour d�finir un compte de banque.

public class Compte {

	private String noCompte;
	private double solde;

	// Champs d'instance de la classe Compte.
	// On doit trouver seulement deux donn�es priv�es (champs d'instance),
	// le num�ro du compte (un String) et le solde du compte (un double).

	// TODO (� COMPL�TER).

	/*
	 * Le constructeur de la classe Compte permet de construire un compte de banque.
	 * 
	 * Param�tres : un num�ro de compte et un solde.
	 */

	public Compte( String noCompte, double solde ) {
		modifierCompte( noCompte, solde );

		// Ex�cuter la m�thode modifierCompte(). Vous devez envoyer les bons param�tres � la m�thode.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getNoCompte() permet de retourner le num�ro du compte de banque.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le num�ro du compte de banque.
	 */

	public String getNoCompte() {
		return this.noCompte;
		// Retourner le num�ro du compte de banque.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode accesseur getSolde() permet de retourner le solde du compte de banque.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : le solde du compte de banque.
	 */

	public double getSolde() {
		return this.solde;
		// Retourner le solde du compte de banque.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setNoCompte() permet de modifier le num�ro du compte de banque.
	 * 
	 * Param�tre : le nouveau num�ro du compte de banque.
	 * 
	 * Retourne : rien.
	 */

	public void setNoCompte( String noCompte ) {
		this.noCompte = new String( noCompte );
		// Modifier le num�ro du compte de banque par celui re�u en param�tre.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode mutateur setSolde() permet de modifier le solde du compte de banque.
	 * 
	 * Param�tre : le nouveau solde du compte de banque.
	 * 
	 * Retourne : rien.
	 */

	public void setSolde( double solde ) {
		if ( solde >= 0 ) {
			this.solde = solde;
		} else {

		}
		// Modifier le solde du compte de banque par celui re�u en param�tre.
		// On doit modifier le solde seulement si le solde re�u en param�tre est sup�rieur ou �gal � 0.
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode deposerArgent() permet de d�poser de l'argent dans le compte de banque.
	 * 
	 * Param�tre : le montant � d�poser.
	 * 
	 * Retourne : rien.
	 */

	public void deposerArgent( double montant ) {
		if ( montant > 0 ) {
			this.solde = this.solde + montant;
		} else {

		}
		// On doit ajouter le montant au solde, seulement si le montant re�u en param�tre est sup�rieur � 0.
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode retirerArgent() permet de retirer de l'argent du compte de banque.
	 * 
	 * Param�tre : le montant � retirer.
	 * 
	 * Retourne : rien.
	 */

	public void retirerArgent( double montant ) {
		if ( ( montant > 0 ) && ( montant <= this.solde ) ) {
			this.solde = this.solde - montant;
		} else {

		}
		// On doit retirer le montant du solde, seulement si le montant re�u en param�tre
		// est sup�rieur � 0 et inf�rieur ou �gal au solde actuel.
		// Aucun message ne doit appara�tre � l'�cran.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode modifierCompte() permet de modifier les informations du compte de banque.
	 * 
	 * Param�tres : un nouveau num�ro de compte et un nouveau solde.
	 * 
	 * Retourne : rien.
	 */

	public void modifierCompte( String noCompte, double solde ) {
		this.setNoCompte( noCompte );
		this.setSolde( solde );
		// Ex�cuter les deux m�thodes mutateurs appropri�es pour faire les modifications.

		// TODO (� COMPL�TER).

	}

	/*
	 * La m�thode afficherCompte() permet d'afficher toutes les informations du compte de banque.
	 * 
	 * Param�tre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherCompte() {
		System.out.println( "Informations du compte de banque" );
		System.out.println( "Num�ro du compte :      " + this.noCompte );
		System.out.println( "Solde :                 " + this.solde );

		// Voir en haut de la page 8 de l'�nonc� du TP1 pour le format d'affichage.
		// Le format d'affichage doit �tre respect�.

		// TODO (� COMPL�TER).

	}
}