package fr.diginamic.utils;

/**
 * Classe qui fournit des services de traitements de chaines de caractères
 * 
 * @author DIGINAMIC
 */
public final class StringUtils {

	/**
	 * Retourne la distance de Levenshtein entre 2 chaines de caractères
	 * 
	 * @param lhs chaine 1
	 * @param rhs chaine 2
	 * @return distance
	 */
	public static Integer levenshteinDistance(CharSequence lhsChar, CharSequence rhsChar) {
		if (lhsChar != null || rhsChar != null) {
			String lhs = lhsChar.toString().toUpperCase();
			String rhs = rhsChar.toString().toUpperCase();
			
			Integer len0 = lhs.length() + 1;
			Integer len1 = rhs.length() + 1;

			Integer[] cost = new Integer[len0];
			Integer[] newcost = new Integer[len0];

			for (Integer i = 0; i < len0; i++) {
				cost[i] = i;
			}

			for (Integer j = 1; j < len1; j++) {
				newcost[0] = j;

				for (Integer i = 1; i < len0; i++) {
					Integer match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;

					Integer costReplace = cost[i - 1] + match;
					Integer costInsert = cost[i] + 1;
					Integer costDelete = newcost[i - 1] + 1;

					newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
				}

				Integer[] swap = cost;
				cost = newcost;
				newcost = swap;
			}
			return cost[len0 - 1];
		}
		return null;
	}
}
