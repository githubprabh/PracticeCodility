class GeonomicTest{
	int[] solution(String S,int[] P,int[] Q) {
		int[] result = new int[S.length()];
		int min = Integer.MAX_VALUE;
		int[] duplicateOfString = new int[S.length()];
		int[] minImpact= {1,2,3,4}; //ACGT
//		System.out.println("h/ello");
		for(int i = 0; i<S.length();i++) {
//			System.out.println("hello" + S.length());
			if(S.charAt(i) == 'A') {
				duplicateOfString[i] = 1;
			}
			else if(S.charAt(i) == 'C') {
				duplicateOfString[i] = 2;
			}
			else if(S.charAt(P[i]) == 'G') {
				duplicateOfString[i] = 3;
			}
			else if(S.charAt(P[i]) == 'T') {
				duplicateOfString[i] = 4;
			}
			
		}
		for(int i=0;i<S.length();i++) {
		for(int j = P[i] ; i < Q[i] ; j++) {
			if(duplicateOfString[i] < min) {
				min = duplicateOfString[i];
				}
//			System.out.println(duplicateOfString[i]);
			
		}
		result[i] = min;
		}
		return result;
	}
}
