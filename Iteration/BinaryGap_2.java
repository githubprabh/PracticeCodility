public class BinaryGap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner var = new Scanner(System.in);
	    System.out.println("Enter  : ");  
	    int number = var.nextInt();
        System.out.println("Binary is " + Integer.toBinaryString(number)); 
        Solution sol = new Solution();
        System.out.println("max zeros : "+ sol.solution(number));    
	}
}

class Solution 
{
    public int solution(int N) 
    {
    //initial checks
		if (N<5)
			return 0;
		else if (N==5)
			return 1;
		else if (N<9)
			return 0;
		
    int mc = 0; 
		int cc = 0; 
		
    while (N>0 && (N&1)==0) //Remove Trailing Zeroes that are in the end
        N>>=1; //N>>=1 <=> N=N>>1 <=> N=N/2
    while (N>0) //Check Digits
    {
        if ((N&1)==0) //If Digit is 0
            cc++; //Increment Count
        else if (cc!=0) //Digit is 1, If Count Isn't Zero
        {
            mc = (cc>mc) ? cc : mc; //Set Max Count if Count is Greater
    cc = 0; //Reset Count
        }

        N>>=1; //Set Next Digit to Check
    }
    return mc; //Return Max Count
    }
}
