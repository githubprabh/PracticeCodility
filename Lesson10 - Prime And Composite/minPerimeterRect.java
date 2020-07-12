class MinPerimeterRectTest{
	int solution (int S) {
		int perimeter = 0;
		int minperi = Integer.MAX_VALUE;
		for (int i=1; i<=Math.sqrt(S); i++) 
		{ 
            if (S%i==0) {
//            	if (S/i == i) {
//                    count++; 
//            	}
//                else // Otherwise print both 
//                {
//                	count+=2;
//                	
//                }
            	System.out.println(S/i + " " + i);
            	perimeter = 2 * (S/i + i);
            	minperi = minperi < perimeter ? minperi :perimeter;
		}
		}
		return minperi;
	}
}
