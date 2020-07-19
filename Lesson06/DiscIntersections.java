class DiscIntTes{
	int solution(int[] A) {
		List<Circle> circlelist = new ArrayList<Circle>();
		for(int i=0;i<A.length;i++) {
			long leftmost = i - A[i];
			long rightmost = i + A[i];
			
			Circle circle = new Circle(leftmost,rightmost);
			circlelist.add(circle);
			
//			System.out.println(circle.LM +" "+circle.RM);
		}
		CircleComparator cirComp = new CircleComparator();
		Collections.sort(circlelist, cirComp);
		
		Circle order[] = new Circle[A.length]; // just ref
		int indexvalue = 0 ;
		for(Circle circleVar: circlelist) {
			order[indexvalue++] = circleVar;
		}
		int intersecting = 0;
		for(int i=0;i<order.length-1;i++) {
			for(int j=i+1;j<order.length;j++)
//			System.out.println("circle " + order[i]);
			if(order[i].RM >= order[j].LM) {
				intersecting++;
			}
			else break;
		}
		return intersecting;
	}
}
class CircleComparator implements Comparator<Circle>{

	@Override
	public int compare(Circle o1, Circle o2) {
		// TODO Auto-generated method stub
		//logic goes here
		if(o1.LM < o2.LM) {return -1;}
		if(o2.LM < o1.LM) {return 1;}
		
		if(o1.RM < o2.RM) {return -1;}
		if(o2.RM < o1.RM) {return 1;}
		
		return 0;  //for equal values 
	}
	
}
class Circle{
	long LM;
	long RM;
	public Circle(long LM,long RM) {
		super();
		this.LM = LM;
		this.RM = RM;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
