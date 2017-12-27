public class SolutionNumberOf1Bits {
	public int numSetBits(long a) {
	    int count = 0;
	    while (a != 0) {
	        boolean isOne = (a & 1) == 1;
	        if (isOne) {
	            count++;
	        }
	        a = a >> 1; // shift bits to 1 space to right
	    }
	    return count;
	}
}
