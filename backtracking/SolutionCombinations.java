public class SolutionCombinations {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        if (A <= 0 || A < B) {
            return ans;
        }
        ArrayList<Integer> set = new ArrayList<>();
        combineUtil(A, B, 1, set);
        return ans;
    }

    public void combineUtil(int A, int B, int start
        , ArrayList<Integer> set) {
       // System.out.println("set = " + set.toString());

        if (set.size() == B) {
            ArrayList<Integer> ret = new ArrayList<>(set);
            ans.add(ret);
            return;
        }

        for (int i = start; i <= A; i++) {
            set.add(i);
            combineUtil(A, B, i+1, set);
            set.remove(set.size()-1); // remove last element
        }
    }
}
