public static int[] solution(int[] A, int[] B) {
    int len = A.length;
    int Fib[] = new int[len + 1]; 
    Fib[0] = 1;
    Fib[1] = 1;
    int p = (1 << 30) - 1;
    for (int i = 2; i < len+1; ++i)
    {
        Fib[i] = (Fib[i-1] + Fib[i-2]) & p;
    }
    
    int ans[] = new int[len];
    for (int i = 0; i < len; ++i)
    {
        p = (1 << B[i]) - 1;
        ans[i] = Fib[A[i]] & p;
    }
     
    return ans;
}
