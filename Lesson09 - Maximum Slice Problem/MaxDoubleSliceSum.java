class MaxDoubleSliceSumTest{
	int solution(int A[]) {
		int s1[] = new int[A.length];
		int s2[] = new int[A.length];
		
		for(int i=1;i<A.length-1;i++) {
			s1[i] = Math.max(s1[i-1] +A[i], 0);
//			System.out.print(s2[i]+ " ");
		}
//		System.out.println();
		for(int i=A.length-2; i>0 ; i--) {
			s2[i] = Math.max(s2[i+1] +A[i], 0);
//			System.out.print(s2[i]+" ");
		}
		int max=0;
		for(int i=1 ; i<A.length-1 ; i++) {
			max = Math.max(max,(s1[i-1] + s2[i+1]));
//			System.out.println(max);
		}
		return max;
	}
}
