////////////////////////////////SOLTUION 1///////////////////////

class PermCheckTest{
	public int solution(int[] a) {
		//some checks
		if(a.length < 1 || a.length > 100000){return 0;}
		if(a.length == 1 ){return a[0] == 1 ? 1: 0;}
		//need sorting
		HashSet<Integer> countMap = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i] > a.length){
				return 0;
			}
			if(countMap.contains(a[i])){
				return 0;
			}else{
				countMap.add(a[i]);
			}
		}	
	return 1;
}
}
