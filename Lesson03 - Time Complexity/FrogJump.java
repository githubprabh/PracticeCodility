///////////////////////////////SOLUTION 1/////////////////////

class FrogJump
{
    public int solution(int X, int Y, int D) {
        int distanceToJump = Y - X;
        int jumpsRequired =  distanceToJump / D;
        
        if(distanceToJump % D != 0 ) {
            jumpsRequired++;
        }
        return jumpsRequired;
    }
}



///////////////////////////////SOLUTION 2/////////////////////


class Solution_frog {
	public int solution(int X,int Y,int D) {
		int count=0;
	    if ((Y-X) <D) count= 1;
	    if((Y-X)%D == 0 ) {
	    	count = (Y-X)/D;
	    }
	    else count = ((Y-X)/D)+1;
	    return count;
	    }
}
