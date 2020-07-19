///////////////100%////////////////
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] A) {
        HashMap<Integer, int[]> candidates = new HashMap<>();
        if(A.length == 0){
            return(-1);
        } else if(A.length == 1){
            return(0);
        }
        for(int i = 0; i < A.length; i++){
            if(candidates.containsKey(A[i])){
                int[] increment = {candidates.get(A[i])[0], candidates.get(A[i])[1] + 1};
                candidates.put(A[i], increment);
                if(candidates.get(A[i])[1] > (double)A.length/2){
                    return(candidates.get(A[i])[0]);
                }
            } else{
                int[] initialiser = {i, 1};
                candidates.put(A[i], initialiser);
            }
        }
        return(-1);
    }
}
