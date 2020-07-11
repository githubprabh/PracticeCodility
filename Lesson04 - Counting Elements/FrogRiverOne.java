import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FrogRiver {
	public static void main(String args[]) {
		int arry[]= {1,3,1,4,2,3,5,4};
		int X=4;
		FrogRiverOne frogobject = new FrogRiverOne();
		System.out.println(frogobject.solution(X,arry));
	}
}

class FrogRiverOne{
	public int solution(int X,int A[]) {
		Set<Integer> requiredLeaveSet = new HashSet<Integer>();
		for(int i=1;i<=X;i++) {
			requiredLeaveSet.add(i);
		}
//		for (Integer integer :requiredLeaveSet) {}
//		System.out.println(integer);
		Set<Integer> currentLeaveSet = new HashSet<Integer>();
		
		for(int p=0;p<A.length;p++) {
			currentLeaveSet.add(A[p]);
			if(currentLeaveSet.size() < requiredLeaveSet.size())
				continue;
			if(currentLeaveSet.containsAll(requiredLeaveSet)) 
			{
				return p;
			}
		}
		return -1;
	}
}
