class DominatorTest{
	int solution(int[] A) {
		
		Stack<Integer> numberStack = new Stack<Integer>();
		for(int i=0;i<A.length;i++) {
			if(numberStack.isEmpty()) {
				numberStack.push(A[i]);
			}
			else {
				if(numberStack.peek().intValue() == A[i]) {
					numberStack.push(A[i]);
				}
				else {
					numberStack.pop();
				}
			}
		}
		if(numberStack.isEmpty()) {
			return -1;
		}
		int leader = numberStack.peek().intValue();
		int leaderCount=0;
		int leaderIndex = -1;
		
		for(int i=0;i<A.length;i++) {
			if(A[i] == leader) {
				leaderCount++;
				if(leaderIndex < 0) {
					leaderIndex = i;
				}
			}
		}
		if(leaderCount > (A.length/2))
			return  leaderIndex;
		return -1;
		
	}
}
