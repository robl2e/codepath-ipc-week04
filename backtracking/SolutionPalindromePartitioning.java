public class SolutionPalindromePartitioning {
    ArrayList<ArrayList<String>> ans = new ArrayList<>();
	public ArrayList<ArrayList<String>> partition(String a) {
	    if (a == null || a.isEmpty()) return ans;

	    ArrayList<String> part = new ArrayList<String>();
        partitionUtil(a, part, 0);
	    return ans;
	}

	public void partitionUtil(String a,
	        ArrayList<String> part, int start) {

        // System.out.println("part = " + part.toString());
        if (start >= a.length()) {
            ans.add(new ArrayList<String>(part));
            return;
        }

        for (int i = start; i < a.length(); i++) {
            String perm = a.substring(start, i+1);
            // System.out.println("perm = " + perm
            //     + " i = " + i + " start = " + start
            //     + " part = " + part.toString()
            //     );

            if (isPalindrome(perm)) {

                part.add(perm);
                partitionUtil(a, part, i+1);

//                System.out.println("b4 remove part = " + part.toString());
                // Remove last element
                part.remove(part.size()-1);
            }
            // System.out.println("end perm = " + perm
            //     + " i = " + i + " start = " + start
            //     + " part = " + part.toString()
            //     );
        }
	}

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
