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
