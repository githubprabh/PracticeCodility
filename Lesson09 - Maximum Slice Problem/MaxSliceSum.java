
public class MaxSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array= {3,2,-6,4,0};
        MaxSliceSumTest sol = new MaxSliceSumTest();
        int result = sol.solution(array);
        System.out.println(result);
	}

}
class MaxSliceSumTest {
public int solution(int[] A) {
    int max = -1000000;
    int previousSliceMax = -1000000;
    for(int i = 0 ; i < A.length ; i++) {
        previousSliceMax = A[i] > previousSliceMax + A[i] ? A[i] : previousSliceMax + A[i];
        max = previousSliceMax > max ? previousSliceMax: max;
    	}    
    return max;
	}
}
