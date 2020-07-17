class MaxNonOverlappingSegmentTest{
	int solution(int[] A, int[] B) {
		 int N = A.length;
	        if (N <= 1) {
	            return N;
	        }
	        int count = 1;
	        int right = B[0];
	        
	        int left;
	        for ( left = 1; left < N; left++) {
	            if (A[left] > right) {
	                count++;
	                right = B[left];
	            }
	        }
	        
	        return left;
		
	}
}
