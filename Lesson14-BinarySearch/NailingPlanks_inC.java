#include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;
bool nails_enough(int j,vector<int> &A, vector<int> &B, vector<int> &C); 
int solution(vector<int> &A, vector<int> &B, vector<int> &C) {
    // write your code in C++11
    //int j= // initial min nail number 
    int last = (int)C.size();
    int bgn = 0; 
    int mid=0;
    int result =-1; 
    while(bgn<=last)
    {
        mid = (last+bgn)/2;
        if(nails_enough(mid,A,B,C))
        {

            last=mid-1;
            result = mid; 
        }else
            bgn=mid+1;
    }
    return result; 
}

bool nails_enough(int j,vector<int> &A, vector<int> &B, vector<int> &C)
{
    std::vector<int> used_nails (C.begin(),C.begin()+j); 
    //for(int j = 0; j < (int)used_nails.size();j++)
    //    cout<<used_nails[j]<<endl;
    sort(used_nails.begin(),used_nails.end()); 
    // binary search again for fitted nail
    
    for(int j = 0; j < (int)A.size();j++)
    {
        int last = (int)used_nails.size()-1; 
        int mid = 0;
        int bgn = 0;
        bool found = false; 
        while (bgn <= last)
        {
            mid = (last+bgn)/2; 
            if (used_nails[mid] >= A[j] && used_nails[mid] <= B[j]) // fit 
            { 
                found = true;
                break;
            }
            if(used_nails[mid] < A[j])
            {
                bgn=mid+1;
            }else if(used_nails[mid] > B[j])
            {
                last = mid-1;
            }
        }
        if (found == false)
            return false;
    }
    return true;
}
