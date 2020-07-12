class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
                int N = A.length;
        
        // test for every possible slice of length 2 or 3
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        for (int p=0; p<N-1; p++) {
            double sum = A[p];
            for (int q=p+1; q<=p+2 && q<N; q++) { 
            	// only slices length 2 or 3 (any larger slice is made up of smaller ones,
            	// so it can't have smaller average)
                sum += A[q];
                double avg = sum / (q-p+1);
                if (avg < min) {
                    min = avg;
                    minIndex = p;
                }
            }
        }

        return minIndex;
    }
}
