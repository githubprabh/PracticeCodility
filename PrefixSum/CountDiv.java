class CountDivTest{
	public int solution(int A,int B,int K) {
		//initial checks
		if(A>B) {return 0;}
		if(K==0) {return 0;}
		
		return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
}
}
