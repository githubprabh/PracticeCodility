class AbsoluteDistinct {
    public int solution(int A[]) {
        //lets make it in a caterpillar way
        int N = A.length;        int head =0;        int tail = N -1; 
                        //                -5            6                    
        int currentMaxValue = Math.max(Math.abs(A[head]), Math.abs(A[tail]));
        //System.out.println("current Max Value "+currentMaxValue);
        
        int counter=1;
        
        while(head <= tail) //  0 to 6
        {
                //5
            int currentHeadValue = Math.abs(A[head]); // -5 is 5
            if(currentHeadValue == currentMaxValue) {    head++;    continue;    }
            
            int currentTailValue = Math.abs(A[tail]);            
            if(currentTailValue == currentMaxValue) {    tail--;    continue;    }
            
            if(currentHeadValue > currentTailValue) {
                currentMaxValue = currentHeadValue;        head++;
            }
            else {
                currentMaxValue = currentTailValue;        tail--;
            }
            counter++;
        }
        
        return counter;
    }
}
