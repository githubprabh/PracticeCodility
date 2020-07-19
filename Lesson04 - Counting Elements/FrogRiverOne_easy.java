import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
                HashSet set = new HashSet();
        for(int i=0; i < A.length; i++){
            if(A[i] <= X) set.add(A[i]);
            if(set.size() == X) return i;
        }
        return -1;
    }
}
