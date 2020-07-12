class Fish{
	int sizeOfFish;
	int directionOfFish;
	public Fish(int sizeOfFish,int directionOfFish) {
		super();
		this.sizeOfFish = sizeOfFish;
		this.directionOfFish = directionOfFish;
	}
	@Override
	public String toString() {
		return "Fish [sizeOfFish=" + sizeOfFish + ", directionOfFish=" + directionOfFish + "]";
	}
	
}
class FishTest{
	int solution(int A[],int B[]) {
		Stack<Fish> fishStack = new Stack<Fish>();
		fishStack.push((new Fish(A[0],B[0])));
	
		final int upstream= 0;
	
	for(int i=1;i<A.length;i++) {
		if(B[i] == fishStack.peek().directionOfFish) {
			fishStack.push(new Fish(A[i],B[i]));
		}
		else
			if(fishStack.peek().directionOfFish == upstream) {
				fishStack.push(new Fish(A[i],B[i]));
			}
			else {
				while(!fishStack.empty()) {
					if(fishStack.peek().directionOfFish == B[i]) {
						fishStack.push(new Fish(A[i],B[i]));
						break;
					}
					else {
						if(fishStack.peek().sizeOfFish  > A[i]) {
							break;
						
						}
						else {
							fishStack.pop();
							continue;
						}
					}
				}//while end
				if(fishStack.isEmpty()) {
					fishStack.push(new Fish(A[i],B[i]));
				}
			}
	}
	return fishStack.size();
	}
}
