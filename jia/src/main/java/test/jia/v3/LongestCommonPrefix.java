package test.jia.v3;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] s= {"flow", "flower", "flight"};
		System.out.println(divide(s));
	}
	
	public static String divide(String[] s) {
		if (s == null)
			return null;
		if (s[0] == "")
			return "";
		return divide(s, 0, s.length - 1);
	}

	// divide the String[] to two comparision

	private static String divide(String[] s, int from, int to) {
		if (from >= to)
			return s[from];
		int middle = (from + to) / 2;
		divide(s, from, middle);
		divide(s, middle + 1, to);
		return getPrefix(s, from, to);
	}

	private static String getPrefix(String[] s, int from, int to) {// flow flower
		int minLength = Math.min(s[from].length(), s[to].length());
		for (int i = 0; i < minLength; i++) {
			if(s[from].charAt(i) != s[to].charAt(i)) {
				return s[from].substring(0, i);
			}
		}

		return s[from].substring(0, minLength);
	}

}
