public class SolutionMinXORValue {
    public int min = Integer.MAX_VALUE;
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);

        for (int i = 0; i < A.size()-1; i++) {
            int num1 = A.get(i);
            int num2 = A.get(i+1);

            int xor = num1 ^ num2;
            min = Math.min(xor, min);
        }
        return min;
    }


    // recursive inefficient solution
    public void findMinXorUtil(ArrayList<Integer> A,
        ArrayList<Integer> set, int start) {
        System.out.println("set = " + set.toString());
        if (set.size() == 2) {
            int num1 = set.get(0);
            int num2 = set.get(1);

            int xor = num1 ^ num2;
            System.out.println("ans set = " + set.toString()
                + " xor = " + xor);
            min = Math.min(xor, min);
            return;
        }

        for (int i = start; i < A.size(); i++) {
            int num = A.get(i);
            set.add(num);
            findMinXorUtil(A, set, i+1);
            set.remove(set.size()-1);
        }
    }

}
