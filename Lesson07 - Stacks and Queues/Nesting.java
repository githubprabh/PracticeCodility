class NestingTest { 
	int solution(String expr) 
	{ 
		if(expr.length()%2 != 0 ) {return 0;} //odd length
		if(expr.length() == 0) {return 1;}
		Deque<Character> stack = new ArrayDeque<Character>();
	    String str;
	    Character Ch;
	    char ch;
	    int n;
	    for(int i=0; i<expr.length();i++)
	    {
	    	ch=expr.charAt(i);
	    	switch(ch){
		    case '(': case '[': case '{': 
		    	 	stack.push(new Character(ch)); 
		    	 	break;
		    case ')': case ']': case '}':
		    	 	if(stack.isEmpty()) {
//			    	   	System.out.println("Extra "+ch+" at position "+(i+1));
			    	   	return 0;  	   	
			    	 	}
		    	 	else{
					     Ch=(Character)stack.peek();
					     if(ch==match(Ch.charValue()))
					     stack.pop();
//					     else
//					     System.out.println("Extra "+ch+" at position "+(i+1));
		    	 	}
	    	}
	     }	
     if(stack.isEmpty()) {return 1;}
     
	return 0; 
	}
	private static char match(char ch) {
	      switch(ch)
	         {
	          case '(': return ')';
	          case '[': return ']';
	          case '{': return '}';
	         }
	      return ch;
	 }
}
