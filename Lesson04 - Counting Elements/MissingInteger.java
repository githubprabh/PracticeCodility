/////////////////////////////SOLUTION 1/////////////////////////////////////

class MissingIntegerSolution{
	public int solution(int[] A) {
		HashSet<Integer> valuePresent = new HashSet<Integer>();
		int minimum = 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) 
				valuePresent.add(A[i]);
		}
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			if(!valuePresent.contains(i)) return i;
		}
		return minimum;
	}
}

/////////////////////////////SOLUTION 2/////////////////////////////////////


class MissingInteger
{
    public int solution(int A[])
    {
        Set<Integer> testedSet = new TreeSet<Integer>();
        Set<Integer> perfectSet = new TreeSet<Integer>();
        
        for(int i=0; i<A.length; i++)
        {
            testedSet.add(A[i]); //sort it
            perfectSet.add(A[i]+1); //set to find missing 
        }
        for(int current : perfectSet) 
        {
            if(!testedSet.contains(current)) {
                return current;
            }
        }
        if(perfectSet.size() == testedSet.size()) {
            return perfectSet.size() + 1;
        }
        return 1;
    }
}


