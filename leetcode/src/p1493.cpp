#include <iostream>
#include <vector>

using namespace std;

int longestSubarray(vector<int>& nums) {
    int max_count = 0;
    int temp_count = 0;
    int zero_count = 0;

    int beg = 0;
    for(int i = 0; i < size(nums); ++i) {
        if(nums[i] == 0) {
            zero_count++;
        }
        while(zero_count > 1) {
            if(nums[beg] == 0) zero_count--;
            beg++;
        }
        max_count = max(i - beg, max_count);
    }        
    return max_count;
}

int main() 
{
    // vector<int> nums = {0,1,1,1,0,1,1,0,1};
    vector<int> nums = {1,1,0,0,1,1,1,0,1};

    int res = longestSubarray(nums);

    cout << "Longest Subarray of 1's is: " << res << endl;
    return 0;
}


//[1,1,0,0,1,1,1,0,1]
// 1,2,3,4