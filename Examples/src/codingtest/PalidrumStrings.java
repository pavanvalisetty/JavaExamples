package codingtest;

public class PalidrumStrings {

	static int minimumChar(String S1, String S2) {
		int n = S1.length();
		int m = S2.length();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < m - n + 1; i++) {
			int minRemovedChar = 0;

			for (int j = 0; j < n; j++) {
				if (S1.charAt(j) != S2.charAt(i + j)) {
					minRemovedChar++;
				}
			}

			ans = Math.min(minRemovedChar, ans);
		}

		return ans;
	}

	// Driver Code
	public static void main(String[] args) {
		String S1 = "archit";
		String S2 = "ar";

		System.out.println(minimumChar(S1, S2));
	}
}