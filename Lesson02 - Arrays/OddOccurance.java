class Solution{
	public int solution(int[] A) {
		int result=0;
        if (A.length==1)
            return A[0];
        int oddOcc = 0;
        for (int i=0; i<A.length; i++)
            oddOcc ^= A[i];
        return oddOcc;
	}
} 
