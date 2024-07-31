#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

bool uniqueOccurrences(vector<int>& arr) {
    unordered_map<int, int> nums;
    vector<int> appear;
    bool check = true;
     for(auto e: arr) {
        nums[e]++;
     }

    int prev = 0;
    int temp = 0; 

     for(auto const& x: nums) {
        // cout << x.first << ":" << x.second << endl;
        appear.push_back(x.second);
     }

     sort(appear.begin(), appear.end());

     for(auto const& i: appear) {
        if(temp == 0) {
            prev = i;
            temp++;
            continue;
        }
        if(i == prev) {
            return false;
        }
        else {
            check = true;
            prev = i;
        }
     }
     return check;   
}

int main() {
    vector<int> arr = {4, 4, 4, 4, 4};    
    bool res = uniqueOccurrences(arr);
    cout << res << endl;
    return 0;
}