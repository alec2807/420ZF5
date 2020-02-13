/*
 * Auteurs : Alec Rochon et Christian Mongeon,	Groupe :  000001
 * Fichier : Compte.java
 * Date    : 17 février 2020
 * Cours   : 420-ZD5-MO (TP1, Partie 3)
 */

// La classe Compte contient les données et les méthodes pour définir un compte de banque.

public class Compte {

	private String noCompte;
	private double solde;

	// Champs d'instance de la classe Compte.
	// On doit trouver seulement deux données privées (champs d'instance),
	// le numéro du compte (un String) et le solde du compte (un double).

	// TODO (À COMPLÉTER).

	/*
	 * Le constructeur de la classe Compte permet de construire un compte de banque.
	 * 
	 * Paramètres : un numéro de compte et un solde.
	 */

	public Compte( String noCompte, double solde ) {
		modifierCompte( noCompte, solde );

		// Exécuter la méthode modifierCompte(). Vous devez envoyer les bons paramètres à la méthode.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getNoCompte() permet de retourner le numéro du compte de banque.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le numéro du compte de banque.
	 */

	public String getNoCompte() {
		return this.noCompte;
		// Retourner le numéro du compte de banque.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode accesseur getSolde() permet de retourner le solde du compte de banque.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : le solde du compte de banque.
	 */

	public double getSolde() {
		return this.solde;
		// Retourner le solde du compte de banque.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setNoCompte() permet de modifier le numéro du compte de banque.
	 * 
	 * Paramètre : le nouveau numéro du compte de banque.
	 * 
	 * Retourne : rien.
	 */

	public void setNoCompte( String noCompte ) {
		this.noCompte = new String( noCompte );
		// Modifier le numéro du compte de banque par celui reçu en paramètre.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode mutateur setSolde() permet de modifier le solde du compte de banque.
	 * 
	 * Paramètre : le nouveau solde du compte de banque.
	 * 
	 * Retourne : rien.
	 */

	public void setSolde( double solde ) {
		if ( solde >= 0 ) {
			this.solde = solde;
		} else {

		}
		// Modifier le solde du compte de banque par celui reçu en paramètre.
		// On doit modifier le solde seulement si le solde reçu en paramètre est supérieur ou égal à 0.
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode deposerArgent() permet de déposer de l'argent dans le compte de banque.
	 * 
	 * Paramètre : le montant à déposer.
	 * 
	 * Retourne : rien.
	 */

	public void deposerArgent( double montant ) {
		if ( montant > 0 ) {
			this.solde = this.solde + montant;
		} else {

		}
		// On doit ajouter le montant au solde, seulement si le montant reçu en paramètre est supérieur à 0.
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode retirerArgent() permet de retirer de l'argent du compte de banque.
	 * 
	 * Paramètre : le montant à retirer.
	 * 
	 * Retourne : rien.
	 */

	public void retirerArgent( double montant ) {
		if ( ( montant > 0 ) && ( montant <= this.solde ) ) {
			this.solde = this.solde - montant;
		} else {

		}
		// On doit retirer le montant du solde, seulement si le montant reçu en paramètre
		// est supérieur à 0 et inférieur ou égal au solde actuel.
		// Aucun message ne doit apparaître à l'écran.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode modifierCompte() permet de modifier les informations du compte de banque.
	 * 
	 * Paramètres : un nouveau numéro de compte et un nouveau solde.
	 * 
	 * Retourne : rien.
	 */

	public void modifierCompte( String noCompte, double solde ) {
		this.setNoCompte( noCompte );
		this.setSolde( solde );
		// Exécuter les deux méthodes mutateurs appropriées pour faire les modifications.

		// TODO (À COMPLÉTER).

	}

	/*
	 * La méthode afficherCompte() permet d'afficher toutes les informations du compte de banque.
	 * 
	 * Paramètre : aucun.
	 * 
	 * Retourne : rien.
	 */

	public void afficherCompte() {
		System.out.println( "Informations du compte de banque" );
		System.out.println( "Numéro du compte :      " + this.noCompte );
		System.out.println( "Solde :                 " + this.solde );

		// Voir en haut de la page 8 de l'énoncé du TP1 pour le format d'affichage.
		// Le format d'affichage doit être respecté.

		// TODO (À COMPLÉTER).

	}
}