import java.util.Stack;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array= {23171,21011,21123,21366,21013,21367};
        MaxProfitTest sol = new MaxProfitTest();
        int result = sol.solution(array);
        System.out.println(result);
	}
}
class MaxProfitTest{
	int solution(int[] A) {
		
		int rightEnd = 0 ;
		int shareSlice = 0;
		
		if(A.length == 2) {
			return 0;
		}
		for(int i=1;i<A.length;i++) {
			int a = A[i] - A[i-1];
			int b = rightEnd + a;
			rightEnd = Math.max(0, b);
			shareSlice = Math.max(shareSlice, b);
		}
		if(shareSlice < 0) {
			return 0;
		}
		return shareSlice;
	}
}
