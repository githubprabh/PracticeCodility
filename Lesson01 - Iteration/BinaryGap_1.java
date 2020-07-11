import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
		  public static int solution(int N) {
		    String binaryString = Integer.toBinaryString(N);
		    List onesList = new ArrayList<Integer>();
		   int i;
		    for( i=0; i<binaryString.length(); i++) {
		      if(binaryString.charAt(i) == '0') continue;
		      onesList.add(i);
		    }
		    int longestBinaryGap = 0;
		    for( i=0; i<onesList.size() - 1; i++) {
		      //subtract 1 so that don't count 1's next to each other as having any gap
		      int indicesDiff = (int)onesList.get(i+1) - (int)onesList.get(i) - 1;
		      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
		    }
		    return longestBinaryGap;
		 }
		  public static void main(String args[]) {
			  solution(529);
		  }
}


/*

        //////////////////////////**********************************************************

        ANOTHER SOLUTION
        
        ///////////////////////////*********************************************************
        
*/



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
		
    int maxcounter = 0; 
		int currentcounter = 0; 
		
    while (N>0 && (N&1)==0) //Remove Trailing Zeroes that are in the end
        N>>=1; //N>>=1 <=> N=N>>1 <=> N=N/2
    while (N>0) //Check Digits
    {
        if ((N&1)==0) //If Digit is 0
            currentcounter++; //Increment Count
        else if (currentcounter!=0) //Digit is 1, If Count Isn't Zero
        {
            maxcounter = (cc>maxcounter) ? currentcounter : maxcounter; //Set Max Count if Count is Greater
            currentcounter = 0; //Reset Count
        }

        N>>=1; //Set Next Digit to Check
    }
    return maxcounter; //Return Max Count
    }
}






