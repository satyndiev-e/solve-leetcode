#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_set>

using namespace std;

int maxVowels(string s, int k) {

    /*First approach*/
    
        /*string vowels = "aeiou";
        int max_count = 0;

        int beg = 0;
        int end = k;

        bool isFirst = false;
        
        for(int i = 0; i < k; ++i) {
            size_t found = vowels.find(s[i]);
            if(found != string::npos) {
                max_count++;
                if(i == 0) {
                    isFirst = true;
                }
            }
        }

        int temp_count = max_count;
        while(end < size(s)) {
            beg++;
            if(isFirst) {
                temp_count--;
                isFirst = false;
            }
            
            size_t found = vowels.find(s[end]);
            if(found != string::npos){
                temp_count++;
            }
            size_t vow = vowels.find(s[beg]);
            if(vow != string::npos) isFirst = true;
            max_count = max(temp_count, max_count);
            end++;
        }
    return max_count;*/

    /*Second approach*/

    unordered_set vowels{'a', 'e', 'i', 'o', 'u'};
    int max_count = 0;

    for(int i = 0; i < k; ++i) {
        if(vowels.count(s[i]))
            max_count++;
    }

    int temp_count = max_count;
    for(int i = k; i < s.size(); ++i) {
        if(vowels.count(s[i - k])) {
            temp_count--;
        }

        if(vowels.count(s[i])) {
            temp_count++;
        }
        max_count = max(temp_count, max_count);
    }
    return max_count;
}

int main()
{
    string s = "abciiidef";
    int k = 3;

    int res = maxVowels(s, k);

    cout << "The result is " << res << "\n";
}