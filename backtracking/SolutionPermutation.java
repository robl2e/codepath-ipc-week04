public class SolutionPermutation {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<
        ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<Integer> perm = new ArrayList<Integer>();
	    permuteUtil(a, perm);
	    return ans;
	}

	public void permuteUtil(ArrayList<Integer> a, ArrayList<Integer> perm) {
	    System.out.println("perm = " + perm.toString());
	    if(perm.size() == a.size()) {
	       ans.add(new ArrayList<Integer>(perm));
	       return;
	    }

	    for(int i = 0; i < a.size(); i++){
	        int num = a.get(i);
	        if (perm.contains(num)) {
	            continue;
	        }
	        perm.add(num);
	        permuteUtil(a, perm);
	        perm.remove(perm.size()-1);
	    }
	}
}
