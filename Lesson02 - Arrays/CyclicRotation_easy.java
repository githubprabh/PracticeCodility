////////////////////my try////// 100%/////////////


class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int N = A.length;       

        if 	(K==0) return A;
        if	(N==0) return A;
        
        if 	(K >= N)	K = K%N;
		int[] B = new int[A.length];
		
        int j =0;
		for(int i = A.length - K; i < A.length ; i++) {
			B[j]=A[i];
			j++;
		}

		for(int i=0;i<A.length-K ;i++) {
			B[j]=A[i];
			if(j!=N-1)
			j++;
		}
		return B;
    }
}
