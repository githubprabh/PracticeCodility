

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] peaks = new int[A.length];
        int peakStart = 0;
        int peakEnd = 0;
        
        //Find peaks
        //we don't want to traverse the array where peaks hasn't started, yet
        //or where peaks doesn't occur any more.
        //Therefore, find start and end points of the peak as well.
        for(int i = 1; i < A.length-1; i++) {
            if(A[i-1] < A[i] && A[i+1] < A[i]) {
                peaks[i] = 1;
                peakEnd = i + 1;
            }
            if(peakStart == 0) {
                peakStart = i;
            }
        }
        
        int x = 1;
        //the maximum number of flags can be √N
        int limit = (int)Math.ceil(Math.sqrt(A.length));
        int prevPeak = 0;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        
        while(x <= limit) {
            counter = 0;
            prevPeak = 0;
            for(int y = peakStart; y < peakEnd; y++) {
                //find the peak points when we have x number of flags
                if(peaks[y] == 1 && (prevPeak == 0 || x <= (y - prevPeak))) {
                    counter++;
                    prevPeak = y;
                }
                //If we don't have any more flags stop.
                if(counter == x ) {
                    break;
                }
            }
            //if the number of flags set on the peaks starts to reduce stop searching.
            if(counter <= max) {
                return max;
            }
            //Keep the maximum number of flags we set on.
            max = counter;
            x++;
        }
        return max;
    }
}

