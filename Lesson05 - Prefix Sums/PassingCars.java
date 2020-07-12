/////////////////


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        	     int counter = 0;
	     int numOfZeros = 0;

	    for (int i = 0; i < A.length; i++) {
	        if (A[i] != 0) {
	            counter += numOfZeros;
	            
	            if (counter > 1000000000) {
	                return -1;
	            }
	        } else {
	        	numOfZeros++;
	        }
	       // System.out.println(" "+counter + " "+numOfZeros);
	    }
	    
	    return counter;
    }
}
