
		HashMap<Integer, Integer> peaks = new HashMap<Integer, Integer>();
		for(int i = 1 ; i < A.length-1 ; i++ ) {
			if(A[i] > A[i-1] && A[i] > A[i+1]) {
				peaks.put(i, A[i]);
			}
			
		}
		int blocks = 0;
//		System.out.println(peaks); 

		
		for(int i = 1 ; i < A.length/2 ; i++ ) {
			if(A.length % i == 0 ) {
				int blockSize = A.length / i;
				int blockStart = -1;
				int blockEnd = -1;
				int numberOfBlocks = A.length / blockSize;
				int peak =0;
				
				for(int j=1 ; j<=numberOfBlocks ;j++) {
					blockStart = blockEnd + 1;
					blockEnd = j * blockSize - 1;
					for(int position = blockStart; position<=blockEnd;position++) {
						if(peaks.containsKey(position)) {
							peak++;
							break;
						}
					}
				}
				if(peak >= numberOfBlocks) {
					blocks  = numberOfBlocks;
				}
			}
		}
		return blocks;

	}
