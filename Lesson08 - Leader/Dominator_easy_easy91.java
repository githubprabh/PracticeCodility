

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int dominationCount = 1;
        int elementValue=0;
        int temp[] = new int[A.length];
        if(A.length == 1){
            return 0;
        } 
        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = A[i];
        }
        Arrays.sort(A);
        
        for(int i = 0 ; i < A.length-1 ; i++){
            if(A[i] == A[i+1]){
                dominationCount++;
            } else {
                dominationCount = 1;
            }
            
            if(dominationCount > A.length/2 ) {
                elementValue = A[i];
            }
        }
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i] == elementValue){ 
            return i;
            }
        }
        return -1;
    }
}

