#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
       unordered_set<int> s1(nums1.begin(), nums1.end());
       unordered_set<int> s2(nums2.begin(), nums2.end());
       vector<vector<int>> res {{},{}};
       
       for(auto e: s1) {
            if(s2.count(e) == 0) {
                res[0].push_back(e);
            }
       }
       for(auto j: s2) {
            if(s1.count(j) == 0) {
                res[1].push_back(j);
            }
       }
    return res;
}

int main() {
    vector<int>nums1 = {1,2,3,3}, nums2 = {1,1,2,2};
    vector<vector<int>>res = findDifference(nums1, nums2);

    for(int i = 0; i < res.size(); ++i) {
        for(int j = 0; j < res[i].size(); ++j) {
            cout << "The different values are: " << res[i][j] << endl;
        }
    }

    return 0;
}