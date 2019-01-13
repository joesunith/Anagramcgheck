package hostelworldtest;

import java.util.Arrays;

/**
 * 
 * @author Sunith
 *
 */
public class AnagramCheck {

	/**
	 * The Anagram Check function implements a program simply verifies whether given
	 * two strings are anagram or not and return boolean value true or false
	 * 
	 * @param input1
	 * @param input2
	 * @return boolean value true or false
	 */
	// Two string inputs are passed as parameters for the function
	public boolean anagramCheckFunction(String input1, String input2) {
		/**
		 * All the non-word characters in the two string inputs are removed using the
		 * regular expression '\W' and converted to Upper case. The string length of the
		 * resultant strings are compared. characters in two Strings are stored to char
		 * array and sorted in ascending and checked for equality.
		 */

		String Str1 = input1.replaceAll("\\W", "");
		Str1 = Str1.toUpperCase();

		String Str2 = input2.replaceAll("\\W", "");
		Str2 = Str2.toUpperCase();

		if (Str1.length() != Str2.length()) {
			return false;
		}

		else {

			char[] Str1_tochar = Str1.toCharArray();
			Arrays.sort(Str1_tochar);

			char[] Str2_tochar = Str2.toCharArray();
			Arrays.sort(Str2_tochar);

			return Arrays.equals(Str1_tochar, Str2_tochar);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnagramCheck ac = new AnagramCheck();

		String[] data1 = new String[] { "Punishment", "The Morse code", "Snooze alarms", "Halley's Comet",
				"One good turn deserves another" };
		String[] data2 = new String[] { "Nine Thumps", "Here come dots", "Alas! No more Zs", "Shall yet come",
				"Do rogues endorse that? No,never!" };

		for (int i = 0; i < data1.length; i++) {
			boolean result = ac.anagramCheckFunction(data1[i], data2[i]);

			if (result == true) {
				System.out.println(data1[i] + " and " + data2[i] + " is anagram");

			}

			else {
				System.out.println(data1[i] + " and " + data2[i] + " is not anagram");

			}

		}
	}
}
