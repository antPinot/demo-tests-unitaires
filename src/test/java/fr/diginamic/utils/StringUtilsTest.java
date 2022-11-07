/**
 * 
 */
package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author antPinot
 *
 */
public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
			
		assertEquals((Integer)2, StringUtils.levenshteinDistance("Chine", "Chien"));
		assertEquals((Integer)1, StringUtils.levenshteinDistance("Aviron", "Avion"));
		
	}
	
	@Test
	public void testLevenshteinDistanceCase() {
		assertEquals((Integer)1, StringUtils.levenshteinDistance("Aviron", "avion"));
	}
	
	@Test
	public void testLevenshteinDistanceNull() {
		assertNull(StringUtils.levenshteinDistance(null, null));
	}

}
