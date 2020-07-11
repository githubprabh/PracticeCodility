    class Solution {
    public int[] solution(int[] A, int K) {
    int rotArray[]=new int[A.length];
		for(int i=0;i<A.length;i++) {
			int rotIndex = (i+K)%A.length;
			rotArray[rotIndex]=A[i];
		}
		return rotArray;
    }
    }// #100%
