public static int solution(int x[]) {
		int j=1, p=0, q=1, n=x.length;
		ArrayList<Integer> fib= new ArrayList<Integer>();					//store fibonacci numbers
		fib.add(0); 			fib.add(1);
		
		while(fib.get(j)+fib.get(j-1) <=(n+1)) {									//compute the fibonacci series
			fib.add(fib.get(j)+fib.get(j-1));
			j++;
		}
		int fibLen = fib.size();
		
		int a[] = new int[n+1];						
		for(int i=0;i<n;i++) {
			a[i] = x[i];
		}
		a[n] = 1;
		
		int min[] = new int[n+1];												//store the minimum steps required to reach ith step
		Arrays.fill(min, 1000000);	
		
		for(int i=0;i<=n;i++) {													// iterate the array
			if(a[i]==1) {
				for(int k=0;k<fibLen;k++) {									// iterate the fibonacci array
					int fn = fib.get(k);
					if(i-fn==-1){
						min[i] = 1;															// update the minimum steps required to reach step i
					}else if(i-fib.get(k)>=0 && a[i-fn]==1) {
						min[i] = Math.min(min[i], min[i-fn]+1);	// update the minimum steps required to reach step i
					}
				}
			}
		}
		if(min[n]==1000000)return -1;
		return min[n];
	}
