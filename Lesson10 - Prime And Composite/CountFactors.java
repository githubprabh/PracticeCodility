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
