public boolean itHasSamePrimeDivisors(int a, int b) {
    int gcdValue = gcd(a,b); // 15 75   --- 15
    
    int gcdA; int gcdB;
    while(a!=1) {
        gcdA = gcd(a,gcdValue); // 15,15
        if(gcdA==1) 
            break;
        a = a/gcdA;
    }
    if(a!=1) {
        return false;
    }
    while(b!=1) {
        gcdB = gcd(b,gcdValue); // 75 15 -- 15 
        if(gcdB==1) 
            break;
        b = b/gcdB; // 75 / 15 
    }
    
    return b==1;
        
}

public int solution(int A[], int B[]) {
    
    int count=0;
    for(int i=0;i<A.length;i++) {
        if(itHasSamePrimeDivisors(A[i], B[i]))
            count++;
    }
    return count;
}


int gcd(int a, int b) { //calculate the gcd
    if(a % b == 0) 
        return b;
    return gcd(b,a % b);
}
