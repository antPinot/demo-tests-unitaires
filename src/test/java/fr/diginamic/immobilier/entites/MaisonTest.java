/**
 * 
 */
package fr.diginamic.immobilier.entites;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author antPinot
 *
 */
public class MaisonTest {
	
	private static final double DELTA = 1e-15;

	Cuisine cuisine = new Cuisine(0, 25);
	Chambre chambrePrincipale = new Chambre(1, 15);
	Chambre chambreDesAmis = new Chambre(1, 14);
	Chambre chambreDesEnfants = new Chambre(1, 11);
	Salon salon = new Salon(0, 30);
	SalleDeBain salleDeBain1 = new SalleDeBain(1, 16);
	SalleDeBain salleDeBain2 = new SalleDeBain(0, 12);
	WC toilettes1 = new WC(1, 5);
	WC toilettes2 = new WC(0, 3);

	@Test
	public void testAjouterPieceAndNbPiece() {

		Maison maison = new Maison();
		maison.ajouterPiece(chambreDesAmis);
		maison.ajouterPiece(cuisine);
		assertEquals(2, maison.nbPieces());

	}

	@Test
	public void testSuperficieEtage() {
		Maison maison = new Maison();
		maison.ajouterPiece(chambreDesAmis);
		maison.ajouterPiece(chambreDesEnfants);
		maison.ajouterPiece(salleDeBain2);
		assertEquals(25, maison.superficieEtage(1), DELTA);
	}
	
	@Test
	public void testSuperficieTypePiece() {
		Maison maison = new Maison();
		maison.ajouterPiece(chambreDesAmis);
		maison.ajouterPiece(chambreDesEnfants);
		maison.ajouterPiece(salleDeBain2);
		maison.ajouterPiece(salleDeBain1);
		assertEquals(28, maison.superficieTypePiece("Salle de bain"), DELTA);
		
	}
	
	@Test
	public void testCalculerSurface() {
		Maison maison = new Maison();
		maison.ajouterPiece(chambreDesAmis);
		maison.ajouterPiece(chambreDesEnfants);
		maison.ajouterPiece(salleDeBain2);
		maison.ajouterPiece(salleDeBain1);
		assertEquals(53, maison.calculerSurface(), DELTA);	
	}
	

}
