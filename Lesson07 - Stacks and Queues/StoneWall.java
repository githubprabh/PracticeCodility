class stoneWallTest{
	int solution(int H[]) {
		Block currentBlock = new Block(0,H[0]);
		
		Stack<Block> blockStack = new Stack<Block>();
		blockStack.add(currentBlock);
		 
		int blockRequired = 1;
		for(int i=0;i<H.length;i++) {
			Block topStackBlock = blockStack.peek();
//			System.out.println("block top "+ topStackBlock);
			while(topStackBlock.upperHeight > H[i]) {
				blockStack.pop();
				if(!blockStack.isEmpty()) {
					topStackBlock = blockStack.peek();
					
				}
				else break;
			}
			if(blockStack.isEmpty()) {
				blockStack.push(new Block(0,H[i]));	
				System.out.println("block top "+ topStackBlock);
				blockRequired++;
			}
			else if(blockStack.peek().upperHeight - H[i] == 0) {
				continue;
			}
			else {
				topStackBlock = blockStack.peek();
				blockStack.push(new Block(blockStack.peek().upperHeight,H[i]));
				System.out.println("block top "+ topStackBlock);
				blockRequired++;
			}
			
		}
		for(Block block :blockStack) {
			System.out.println("block  "+ block);
		}
		return blockRequired;

	}
}
class Block {
	int lowerHeight;
	int upperHeight;
	
	Block(int lh,int uh){
		this .lowerHeight = lh;
		this.upperHeight = uh;
	}

	@Override
	public String toString() {
		return "Block [lowerHeight=" + lowerHeight + ", upperHeight=" + upperHeight + "]";
	}
	
}
