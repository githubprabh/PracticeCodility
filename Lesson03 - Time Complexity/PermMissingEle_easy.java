import java.util.*; ///////////////my 100%//////////////

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0  ) return 1;
        if(A.length >= 1){
        Arrays.sort(A);
        for(int i =0;i<A.length;i++){
            if(i+1 != A[i]){
                return i+1;
            }
        }
        }
        return A.length+1;
    }
}
