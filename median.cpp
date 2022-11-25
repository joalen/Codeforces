#include <iostream> 
#include <algorithm> 
#include <vector> 
#include <string> 
#include <sstream> 


using namespace std;

int main() {
    vector<int> nums; 

    int t;
    cin >> t;

    while (t-- > 0) {
        int n;
        cin >> n; 
        nums.push_back(n); 
        cin >> n;
        nums.push_back(n); 
        cin >> n; 
        nums.push_back(n); 
        
        sort(nums.begin(), nums.begin()+(int) nums.size()); 

        cout << nums[1] << endl; 
        nums.clear(); 
    }
}