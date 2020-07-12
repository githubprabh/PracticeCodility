class DistinctTest{
	int solution(int[] a) {
		Set<Integer> setStorage = new HashSet();
		for(int i=0;i<a.length;i++) {
			setStorage.add(a[i]);
		}		
		return setStorage.size();
	}
}
