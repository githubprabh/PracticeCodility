/////////////100/////////////
class ChocolatesByNumberTest{
	int solution(int N,int M ) {
	      return N/(gcd(N,M));
	    }

	    // using "Euclidean Algorithm" (important)
	    int gcd(int a,int b){
	        if(a % b == 0)
	            return b;            // case 1
	        else
	            return gcd(b,a % b); // case 2 (key point)
	    }
	}
