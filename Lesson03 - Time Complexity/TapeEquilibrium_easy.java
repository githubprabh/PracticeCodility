import java.util.*;   ////////////////////////similar to prefix sum approach//////////100 %/////////////////

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int globalResult=Integer.MAX_VALUE;
        if(A.length < 2){ return 0;}
        else{
            int[] rightSum = new int[A.length];
            int[] leftSum = new int[A.length];
            
            leftSum[0] = A[0]; leftSum[A.length-1] = 0;
            rightSum[A.length -1] = A[A.length-1]; rightSum[0] =0;

            for(int i =1;i< A.length-1;i++){
                leftSum[i] = leftSum[i-1] + A[i] ;
            }
            // System.out.println(Arrays.toString(lSum));
            for(int i =A.length -2;i> 0;i--){
                rightSum[i] = rightSum[1+i] + A[i] ;
            }
            // System.out.println(Arrays.toString(rSum));
            //compare
            int localResult=1;
            
            for(int i = 0;i<A.length-1;i++){
                localResult = Math.abs(leftSum[i] - rightSum[i+1]);
                // System.out.println(leftSum[i]+ " b "+ rightSum[i+1]);
                globalResult = globalResult > localResult ? localResult : globalResult;
                // System.out.println(gResult+ " a "+ lResult);
            }
            
        }
        return globalResult;
    }
}
