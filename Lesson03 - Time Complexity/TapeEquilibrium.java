class Solution{
public static int solution(int[] A) {
    int min = Integer.MAX_VALUE;
    int tsum=0, sum=0;
    for(int i=0;i<A.length;i++)tsum+=A[i];
    for(int i=0;i<A.length-1;i++){
        sum+=A[i];
        min = Math.min(min, Math.abs((tsum-sum)-sum));
    }
    return min;
}
}
