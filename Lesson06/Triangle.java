	int solution(int A[]) {
		if(A.length<3) return 0;
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i = 0;i <A.length;i++) {
			numList.add(A[i]);
		}
		Collections.sort(numList);
		long[] orderEle =new long[A.length];
		int index =0;
		for(Integer value:numList) {
			orderEle[index++] =value;
		}
		for(int i=orderEle.length-1;i>=2;i--) {
			if(orderEle[i-1] + orderEle[i-2] > orderEle[i]) {
				return 1;
			}
		}
		return 0;}
