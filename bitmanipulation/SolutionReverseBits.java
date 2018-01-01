public class SolutionReverseBits {
	public long reverse(long a) {
	    long ans = 0;
	    int index = 0;

	    while (index < 32) {
	      boolean isSet = isSet(a, index);
	      if (isSet) {

	          int reverseIndex = 32 - index - 1;
	          ans += Math.pow(2, reverseIndex);

            //   System.out.println("isSet = " + isSet +
            //     " index = " + index +
            //     " reverseIndex = " + reverseIndex
            //     );
	      }
	      index++;
	    }
	    return ans;
	}

	public boolean isSet(long a, int index) {
	    return (a & (1 << index)) != 0;
	}
}
