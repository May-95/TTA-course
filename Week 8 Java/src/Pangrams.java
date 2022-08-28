
public class Pangrams {

	public static void main(String[] args) {

		// sentence that will be evaluated.
		String sentence = "Sixty zippers were quickly picked from the woven jute bag.".toLowerCase();

		// boolean values for each letter of the alphabet. Set to false.
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		Boolean e = false;
		Boolean f = false;
		Boolean g = false;
		Boolean h = false;
		Boolean i = false;
		Boolean j = false;
		Boolean k = false;
		Boolean l = false;
		Boolean m = false;
		Boolean n = false;
		Boolean o = false;
		Boolean p = false;
		Boolean q = false;
		Boolean r = false;
		Boolean s = false;
		Boolean t = false;
		Boolean u = false;
		Boolean v = false;
		Boolean w = false;
		Boolean x = false;
		Boolean y = false;
		Boolean z = false;

		// for-loop checking each letter in the sentence. If the letter matches, the
		// boolean value for that letter is set to true.
		for (int ii = 0; ii < sentence.length(); ii++) {
			switch (sentence.charAt(ii)) {
			case 'a':
				a = true;
				break;
			case 'b':
				b = true;
				break;
			case 'c':
				c = true;
				break;
			case 'd':
				d = true;
				break;
			case 'e':
				e = true;
				break;
			case 'f':
				f = true;
				break;
			case 'g':
				g = true;
				break;
			case 'h':
				h = true;
				break;
			case 'i':
				i = true;
				break;
			case 'j':
				j = true;
				break;
			case 'k':
				k = true;
				break;
			case 'l':
				l = true;
				break;
			case 'm':
				m = true;
				break;
			case 'n':
				n = true;
				break;
			case 'o':
				o = true;
				break;
			case 'p':
				p = true;
				break;
			case 'q':
				q = true;
				break;
			case 'r':
				r = true;
				break;
			case 's':
				s = true;
				break;
			case 't':
				t = true;
				break;
			case 'u':
				u = true;
				break;
			case 'v':
				v = true;
				break;
			case 'w':
				w = true;
				break;
			case 'x':
				x = true;
				break;
			case 'y':
				y = true;
				break;
			case 'z':
				z = true;
				break;
			}
		}

		// if all the letters are true, the message 'is a pangram' is printed onto the
		// console. If all letter of the alphabet have not been found in the sentence,
		// 'not a pangram' is printed onto the console.
		if (a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v
				&& w && x && y && z) {
			System.out.println("The sentence '" + sentence + "' is a pangram!");
		} else {
			System.out.println("The sentence '" + sentence + "' is not a pangram!");
		}
	}
}
