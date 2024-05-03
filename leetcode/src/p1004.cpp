#include <iostream>
#include <vector>

using namespace std;

int longestOnes(vector<int>& nums, int k) {
    /*First approach*/
    // int beg = 0;
    // int end = 0;
    //int max_count = 0;

    // int temp_count = 0;
    // while(end < nums.size()) {
    //     if(nums[end] == 1) {
    //         temp_count++;
    //         end++;
    //     } else {
    //         if(k != 0) {
    //             k--;
    //             temp_count++;
    //             end++;
    //         } else {
    //             max_count = max(temp_count, max_count);
    //             if(nums[beg] != 0) {
    //                 temp_count--;
    //             } else {
    //                 temp_count--;
    //                 k++;
    //             }
    //             beg++;
    //         }
    //     }
    // }
    //return max_count;

    /*Second approach*/

    int count = 0, temp_count;

    for(temp_count = 0; temp_count < nums.size(); temp_count++) {
        if(nums[temp_count] == 0) {
            k--;
        }
        if(k < 0 && nums[count++] == 0) {
            k++;
        }
    }
    return temp_count - count;    
}

int main() {
    vector<int> nums {1,1,1,0,0,0,1,1,1,1,0};
    int k = 2;

    int res = longestOnes(nums, k);

    cout << "The result is: " << res << "\n";

    return 0;
}