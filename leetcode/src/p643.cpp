#include <iostream>
#include <vector>

template <typename C>
int sz(const C &c) {return static_cast<int>(c.size());}

using namespace std;

double findMaxAverage(vector<int>& nums, int k) {
   int beg = 0;
   int end = k;
   int max_sum = 0;

   for(int i = 0; i < k; ++i){
        max_sum += nums[i];
   }

    int sub_array_sum = max_sum;
   while(end < sz(nums)) {
        sub_array_sum += nums[end] - nums[beg];
        max_sum = max(sub_array_sum, max_sum);
        end++;
        beg++;
   }

   return (double)max_sum / k;    
}

int main() {
    vector<int> nums{1, 12, -5, -6, 50, 3};
    int k = 4;

    double res = findMaxAverage(nums,k);

    cout << res << "\n";
}