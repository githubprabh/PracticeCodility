import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0) {return 0;}
        Arrays.sort(A);
        
        for(int i =0;i<A.length-1;i+=2){
            if(A[i] != A[i+1]){
                return A[i];
            }
        }
        
        return A[A.length-1];
    }
}
