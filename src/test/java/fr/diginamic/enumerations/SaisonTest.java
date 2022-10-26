/**
 * 
 */
package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * Classe de Test de l'énumération Saison
 * @author antPinot
 *
 */
public class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		
		String testNominalPrintemps = "Printemps";
		String testNominalEte = "Eté";
		String testNominalAutomne = "Automne";
		String testNominalHiver = "Hiver";
		
		List<String> testNominaux = new ArrayList(Arrays.asList(testNominalPrintemps, testNominalEte, testNominalAutomne, testNominalHiver));
		
		Saison[] saisons = Saison.values();
		
		for (int i=0; i<testNominaux.size(); i++) {
			assertEquals(saisons[i], Saison.valueOfLibelle(testNominaux.get(i)));
		}
	}
	
	@Test
	public void testValueOfLibelleNull() {
		assertNull(Saison.valueOfLibelle(null));
	}
	
	@Test
	public void testValueOfLibelleSpaces() {
		assertEquals(Saison.HIVER, Saison.valueOfLibelle(" Hiver"));
	}

}
