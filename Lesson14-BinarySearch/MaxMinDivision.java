class MinMaxDivisionTest{
	
//	int solution(int K, int M, int[] A) {
		 int solution(int k, int m, int[] a) {
		    
		    int sum=a[0], n=a.length;
		    for(int i=1;i<n;i++){
		        sum+=a[i];
		    }
		    
		    int l=0, r=sum, mid = l+(r-l)/2, ans=0;  
		    while(l<=r){
		        mid = l+(r-l)/2;
		        int part = countPartition(a,mid,k);
		        if(part>k){            // if number of partition with sum<=mid is less than mid
		            l=mid+1;        // sum<=mid cannot be the answer
		        }else{
		            ans=mid;
		            r=mid-1;
		        }
		    }
		    return ans;
		}
		 int countPartition(int a[], int sum, int k){        // count number of partition possible with max subarray sum <= given sum
		    
		    int n = a.length, s=0, c=1;
		    for(int i=0;i<n;i++){
		        if(a[i]>sum){
		            return k+1;
		        }
		        s+=a[i];
		        if(s>sum){
		            s=a[i];
		            c++;
		        }
		    }
		    return c;
		}
	}
