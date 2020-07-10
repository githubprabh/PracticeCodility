package PrimeAndCompositeNum;


public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = 64;
		
		CountFactorsTest sol = new CountFactorsTest();
		int result = sol.solution(S);
		System.out.println(result);
	}

}
class CountFactorsTest{
	int solution (int S) {
		
		int count = 0 ;
		for (int i=1; i<=Math.sqrt(S); i++) 
        { 
            if (S%i==0) {
            	if (S/i == i) {
                    count++; 
            	}
                else // Otherwise print both 
                {
                	count+=2;
                	
                }
            	System.out.println(S/i + " " + i);
            }
        }
		return count;
	}
}
