class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int arr[] = new int[2*n + 1]; //store the occurences
        
        for(int i = 0; i < n; i++) 
            arr[A[i]]++;        //calculating the occurances
        
        int ans[] = new int[n]; //output array
        int count = 0;
        for(int i = 0; i < n; i++) { //iterating through output array or input array
            count = 0;
            for(int j = 1; j*j <= A[i]; j++) { 
                if(A[i] % j == 0)   //condition 1 for divisibility check with j
                    count = count + arr[j];
                if(A[i] % (A[i]/j) == 0 && j != A[i]/j) //condition 2 for divisibility check with A[i]/j
                    count = count + arr[A[i]/j];
            }
            ans[i] = n - count;
        }
        return ans;

    }
}
