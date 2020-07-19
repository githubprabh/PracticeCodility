///////////////////////////////////////////////////////


public int solution(int[] a){
    if (a.length == 0) return 0;
    if (a.length == 1) return a[0];
    int sum = 0;
    for (int i=0;i<a.length;i++){
        sum += Math.abs(a[i]);
    }
    int[] indices = new int[a.length];
    indices[0] = 0;
    int half = sum/2;
    int localSum = Math.abs(a[0]);
    int minLocalSum = Integer.MAX_VALUE;
    int placeIndex = 1;
    for (int i=1;i<a.length;i++){
        if (localSum<half){
            if (Math.abs(2*minLocalSum-sum) > Math.abs(2*localSum - sum))
                minLocalSum = localSum;
            localSum += Math.abs(a[i]);
            indices[placeIndex++] = i;
        }else{
            if (localSum == half)
                return Math.abs(2*half - sum);

            if (Math.abs(2*minLocalSum-sum) > Math.abs(2*localSum - sum))
                minLocalSum = localSum;
            if (placeIndex > 1) {
                localSum -= Math.abs(a[indices[placeIndex--]]);
                i = indices[placeIndex];
            }
        }
    }
    return (Math.abs(2*minLocalSum - sum));

}
