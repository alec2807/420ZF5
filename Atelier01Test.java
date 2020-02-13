package RochonAlec.AT01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Atelier01Test {

	@Test
	public void testMoyenne() {
		
	    // ----- DONNEES VALIDES -----
	    //Cas où les 3 nombres sont des valeurs entières entre 0 et 100 inclusivement
	    assertEquals (60, Atelier01.calculerMoyenne(60,70,50), 0);
	    // ----- DONNEES INVALIDES -----   
	    //Cas où la valeur expectée est la même
	    assertEquals (-1, Atelier01.calculerMoyenne(60,70,-10), 0);
	    
	    assertEquals (-1, Atelier01.calculerMoyenne(110,60,0), 0); 
	    // ----- DONNEES LIMITES -----
	    assertEquals (100, Atelier01.calculerMoyenne(100,100,100), 0);
	    
	    assertEquals (0, Atelier01.calculerMoyenne(0,0,0), 0);
	    
	    // ----- DONNEES MELANGEE -----    
	    assertEquals (50, Atelier01.calculerMoyenne(100,50,0), 0);    
	}//Fin public void testMoyenne()
	
	
	@Test
	public void testOrdre() {
        // ----- DONNEES VALIDES -----	
		//Cas testant des données valides et testant le a == b < || > c, a < || > b == c
		
		//Cas decroissant 
	    String expectedName = "decroissant";
	    assertEquals (expectedName, Atelier01.ordre(4,3,-5));
	    
	    //Cas decroissant a == b > c
	    String expectedName2 = "decroissant";
	    assertEquals (expectedName2, Atelier01.ordre(4,4,2));
	     
	    //Cas decroissant a > b == c
	    String expectedName3 = "decroissant";
	    assertEquals (expectedName3, Atelier01.ordre(4,2,2));
	
	    //Cas croissant 
	    String expectedName4 = "croissant";
	    assertEquals (expectedName4, Atelier01.ordre(3,4,5));
	    
	    //Cas croissant a == b < c
	    String expectedName5 = "croissant";
	    assertEquals (expectedName5, Atelier01.ordre(4,4,5));
	    
	    //Cas croissant a < b == c
	    String expectedName6 = "croissant";
	    assertEquals (expectedName6, Atelier01.ordre(-2,5,5));
	    
	    //Cas constant a == b == c
	    String expectedName7 = "constant";
	    assertEquals (expectedName7, Atelier01.ordre(0,0,0));
	    
	    //Cas quelquonque ne respecant aucune des règles précédentes
	    String expectedName8 = "quelquonque";
	    assertEquals (expectedName8, Atelier01.ordre(-4,3,2));
	
	    // -----AUCUNE DONNÉES INVALIDES (IMPOSSIBLES)-----	
	}//Fin public void testOrdre()
	
	
	@Test
	//Test des deux méthodes pour la valeur exposée et l'exposant
	public void testExpMax() {
		 // ----- DONNEES VALIDES -----
		 assertEquals (16, Atelier01.valeurExposee(4, 20), 0);
		 
		 assertEquals (2, Atelier01.expMax(4, 20), 0);
		 
		// ----- DONNEES INVALIDES -----   
		 
		 assertEquals (-1, Atelier01.valeurExposee(-10, 20), 0);
		 
		 assertEquals (-1, Atelier01.expMax(-10, 20), 0);
		
	}//Fin public void testValeurExposee()
	
	@Test
	public void testSomme() {
		// ----- DONNEES VALIDES -----
		//Cas où l'entier est positif et valide
		assertEquals (10, Atelier01.somme(4), 0);
		
		// ----- DONNEES LIMITES -----
		//Cas où l'entier vaut 0
		assertEquals (0, Atelier01.somme(0), 0);
		 
		// ----- DONNEES INVALIDES ----- 
		//Cas où l'entier est négatif
		assertEquals (-1, Atelier01.somme(-10), 0);
		
		
		 
	}//Fin public void testSomme()
	
	@Test
	public void testConversionNote() {
		// ----- DONNEES VALIDES -----
		//Cas où chaque cas valide possible est testé
		char expectedName = 'A';
		assertEquals (expectedName, Atelier01.conversionNote(92), 0);
		
		char expectedName2 = 'B';
		assertEquals (expectedName2, Atelier01.conversionNote(76), 0);
		
		char expectedName3 = 'C';
		assertEquals (expectedName3, Atelier01.conversionNote(62), 0);
		
		char expectedName4 = 'D';
		assertEquals (expectedName4, Atelier01.conversionNote(52), 0);
		
		char expectedName5 = 'E';
		assertEquals (expectedName5, Atelier01.conversionNote(1), 0);
		
		// ----- DONNEES LIMITES -----
		//Cas où chaque cas limite valide est testé
		
		//Intervalle pour la note A: [100, 91]
		char expectedName6 = 'A';
		assertEquals (expectedName6, Atelier01.conversionNote(100), 0);
		
		char expectedName7 = 'A';
		assertEquals (expectedName7, Atelier01.conversionNote(91), 0);
		
		//Intervalle pour la note B: [90, 75]
		char expectedName8 = 'B';
		assertEquals (expectedName8, Atelier01.conversionNote(90), 0);
		
		char expectedName9 = 'B';
		assertEquals (expectedName9, Atelier01.conversionNote(75), 0);
		
		//Intervalle pour la note C: [74, 61]
		char expectedName10 = 'C';
		assertEquals (expectedName10, Atelier01.conversionNote(74), 0);
		
		char expectedName11 = 'C';
		assertEquals (expectedName11, Atelier01.conversionNote(61), 0);
		
		//Intervalle pour la note D: [60, 51]
		char expectedName12 = 'D';
		assertEquals (expectedName12, Atelier01.conversionNote(60), 0);
		
		char expectedName13 = 'D';
		assertEquals (expectedName13, Atelier01.conversionNote(51), 0);
		
		//Intervalle pour la note E: [50, 0]
		char expectedName14 = 'E';
		assertEquals (expectedName14, Atelier01.conversionNote(50), 0);
		
		char expectedName15 = 'E';
		assertEquals (expectedName15, Atelier01.conversionNote(0), 0);
		
		// ----- DONNEES INVALIDES -----
		//Cas où la note vaut -10
		char expectedName16 = 'X';
		assertEquals (expectedName16, Atelier01.conversionNote(-10), 0);
		
		//Cas où la note vaut 110
		char expectedName17 = 'X';
		assertEquals (expectedName17, Atelier01.conversionNote(110), 0);
	}//Fin public void testConversionNote()
	
	

}//Fin public static class Atelier01Test

/* Tableaux de jeu
 * 
 * Tableau de jeu testMoyenne
 * --------------------------
 * Type de test                                        |val1     |val2    |val3    |Résultat attendu
 * Données valides, 3 nombre entiers positifs          |60       |70      | 50     |60              
 * Données invalides, 1 nombre négatif                 |60       |70      |-10     |-1              
 * Données invalides, 1 nombre supérieur à 100         |110      |60      |0       |-1              
 * Données limites, 3 notes de 100                     |100      | 100    |100     |100             
 * Données limites, 3 notes de 0                       |0        | 0      |0       |0               
 * Données mélangées                                   |100      | 50     |0       |50              
 * ----------------------------------------------------------------------------------------------
 * 
 * Tableau de jeu testOrdre
 * ------------------------
 * Type de test                                        |val1     |val2     |val3     |Résultat attendu
 * Données valides, decroissant                        |4        |3        |-5       |"decroissant"   
 * Données valides, decroissant a == b > c             |4        |4        |2        |"decroissant"   
 * Données valides, decroissant a > b == c             |4        |2        |2        |"decroissant"                                                    
 * Données valides, croissant                          |3        |4        |5        |"croissant"   
 * Données valides, croissant a == b < c               |4        |4        |5        |"croissant"      
 * Données valides, croissant a < b == c               |-2       |5        |5        |"croissant"
 * Données valides, constante a == b == c              |0        |0        |0        |"constant"                                             
 * Données valides, mélangées                          |-4       |3        |2        |"quelquonque"                                                    
 * ------------------------------------------------------------------------------------------------
 * 
 * Tableau de jeu testExpMax 
 * -------------------------
 * Type de test                                         |base     |valeur maximale     |Résultat attendu (exposant)                                                     
 * Données valides, base et exposant positifs           |4        |20                  |2
 * Données invalides, base négative                     |-10      |20                  |-1          
 * ------------------------------------------------------------------------------------------------
 * 
 * Tableau de jeu valeurExposee
 * ----------------------------
 * Type de test                                         |base     |valeur maximale     |Résultat attendu (base exposée) 
 * Données valides, base est exposant positifs          |4        |20                  |16
 * Données invalides, base négative                     |-10      |20                  |-1
 * ------------------------------------------------------------------------------------------------
 * 
 * Tableau de jeu testSomme
 * ------------------------                             
 * Type de test                                         |val1     |Résultat attendu
 * Données valides, nombre positif                      |4        |10
 * Données limites                                      |0        |0
 * Données invalides                                    |-10      |-1
 * ------------------------------------------------------------------------------------------------
 * 
 * Tableau de jeu 
 * --------------
 * Type de test                                         |val1     |Résultat attendu
 * Données valides, Intervalle [100, 91]                |92       |'A'
 * Données valides, Intervalle [90, 75]                 |76       |'B'
 * Données valides, Intervalle [74, 61]                 |62       |'C'
 * Données valides, Intervalle [60, 51]                 |52       |'D'
 * Données valides, Intervalle [50, 0]                  |1        |'E'
 * Données limites, Intervalle [100, 91]                |100      |'A'  
 * Données limites, Intervalle [100, 91]                |91       |'A'  
 * Données limites, Intervalle [90, 75]                 |90       |'B'
 * Données limites, Intervalle [90, 75]                 |75       |'B'
 * Données limites, Intervalle [74, 61]                 |74       |'C'  
 * Données limites, Intervalle [74, 61]                 |61       |'C'
 * Données limites, Intervalle [60, 51]                 |60       |'D' 
 * Données limites, Intervalle [60, 51]                 |51       |'D'
 * Données limites, Intervalle [50, 0]                  |50       |'E'
 * Données limites, Intervalle [50, 0]                  |0        |'E'
 * Données invalides, nombre plus petit que 0           |-10      |'X'
 * Données invalides, nombre plus grand que 100         |110      |'X'
 * 
 * 
 * 
 * 
 */
