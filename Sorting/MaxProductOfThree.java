class maxProductOfThreeTest{
	int solution(int[] a) {
	//find top three numbers
	Arrays.sort(a);
	int max = 0;int temp = 0 ;
	if(a.length >2) {
		max = a[a.length -1] * a[a.length -2] * a[a.length -3];
		temp = a[0] *a[1]* a[a.length-1];
	}
	else return -1;
	
	if(temp>max) max=temp;

	return max;
	}
}
