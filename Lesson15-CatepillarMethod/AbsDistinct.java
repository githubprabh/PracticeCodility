class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int i =0 ; i < A.length ; i ++){
            if(A[i] < 0){
                hashset.add(Math.abs(A[i]));
            }
            else{
                hashset.add(A[i]);
            }
        }
        return hashset.size();
    }
}
