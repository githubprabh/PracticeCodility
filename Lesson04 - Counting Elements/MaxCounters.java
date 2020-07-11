/////////////////////////////////SOLUTION 1////////////////////////////

class Solution{
	public int[] solution(int N, int[] A) {
		int[] counterArray = new int[N];
		final int[] zeroedArray = new int[N];
		int biggestCounter = 0;
		int maxCounter = 0;
		for (int i = 0; i < A.length; i++) {		
		    if (A[i] <= N) {
		        counterArray[A[i] - 1]++;
		        if (counterArray[A[i] - 1] + maxCounter > biggestCounter)
		            biggestCounter = counterArray[A[i] - 1] + maxCounter;		
		    } else if (A[i] == N + 1) {
		        maxCounter = biggestCounter;
		        System.arraycopy(zeroedArray, 0, counterArray, 0, zeroedArray.length);
		    }		
		}
		for (int j = 0; j < counterArray.length; j++)
		    counterArray[j] += maxCounter;
		return counterArray;
	}
}


//////////////////////////////////SOLTUION 2////////////////////////////



class MaxCounters{
    public int[] solution(int N, int A[]) {
        
        int countersArray[] = new int[N];
        
        int maxCounter = 0; // for the next reset 
        int lastResetCounter  = 0; // for the output array to hold at last
        
        for(int i=0;i<A.length;i++) 
        {
            if(A[i] <= N) 
            {
                if(countersArray[A[i]-1] < lastResetCounter)
                {
                    countersArray[A[i]-1] = lastResetCounter;
                }
                countersArray[A[i]-1]++;
                
                //store the max counter to set all the counters to 
                    //this value while next reset
                if(countersArray[A[i]-1] > maxCounter ) {
                    maxCounter = countersArray[A[i]-1];
                }
            }
            else 
            {        // identify the last reset counter
                lastResetCounter  = maxCounter;
            }
        }
        for(int i=0;i< countersArray.length;i++) {
            if(countersArray[i] < lastResetCounter  )
            {
                countersArray[i] = lastResetCounter ;
            }
        }
        return countersArray;
    }
}
public class MaxCountersTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxCounters maxCnt = new MaxCounters();
        int array1[]= {3,4,4,6,1,4,4};
        int output1[] = maxCnt.solution(5,array1);
        for (int i : output1) {
            System.out.print(" "+i);
        }
    }
}
