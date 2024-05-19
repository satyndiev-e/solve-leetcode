#include <iostream>
#include <vector>

using namespace std;

int largestAltitude(vector<int>& gain) {
    int beg = 0;

    int max = 0;
    for(int i = 0; i < size(gain); ++i){
        beg += gain[i];
        if(max < beg) max = beg;
    }
    return max;   
}

int main() {
    vector<int> gain = {-5,1,5,0,-7};

    int res = largestAltitude(gain);

    cout << "The largest altitude is: " << res << endl;
    return 0;
}