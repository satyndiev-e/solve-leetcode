#include <iostream>
#include <vector>

using namespace std;

int pivotIndex(vector<int>& nums) {
    int leftSum = 0;
    int rightSum = 0;
    int idx = -1;

    for(vector<int>::iterator it = nums.begin(); it != nums.end(); ++it) {
        rightSum += *it;
    }

    for(int i = 0; i < nums.size(); ++i) {
        rightSum -= nums[i];
        if(rightSum == leftSum) {
            return i;
        }
        leftSum += nums[i];
    }
    return idx;
}

int main() {
    vector<int> nums {1,7,3,6,5,6};

    int res = pivotIndex(nums);

    cout << "The result is: " << res << endl;
}