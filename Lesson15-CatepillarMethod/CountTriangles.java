/////////  100 % correct  ////////////63 % performance////////////////////////

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 3){
            return 0;
        }
        long count=0;
        // int i1=0;
        // int i2=0;
        // int i3=0;
        for(int P = 0;P<A.length-2;P++){
            for(int Q = 1;Q<A.length-1;Q++){
                for(int R = 2;R<A.length;R++){
                    //
                    if(A[P] + A[Q] > A[R]) {
                    if (A[Q] + A[R] > A[P]) {
                    if (A[R] + A[P] > A[Q]){
                        if(P!=Q && Q!=R && P!=R){
                            if( P<Q && Q<R ){
                            count++;
                            // System.out.println(P+" "+Q+" "+R);
                        }}}}
                    
                }
                }
                
            }
            
        }

        return (int)count;
    }
}
