package ArraysAndStrings;
import java.util.*;

public class IsUnique
{
	public static boolean IsUniqueSort(String inputString) {
		char[] charArray = inputString.toCharArray();
		Arrays.sort(charArray);

		for (Integer i = 0; i < charArray.length - 1; ++i) {
			if (charArray[i] == charArray[i + 1])
				return false;
		}
		return true;
	}

	static boolean IsUniqueHashMap(String inputString) {
		char[] charArray = inputString.toCharArray();
		HashMap<Character, Integer> charCounts = new HashMap<>();
		for (int i = 0; i < charArray.length; ++i) {
			if (charCounts.get(charArray[i]) == null) {
				charCounts.put(charArray[i], 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
