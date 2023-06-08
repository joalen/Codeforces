#include <iostream>
#include <set> 

using namespace std; 

int main() {
    int t; 

    cin >> t; 

    while (t-- > 0) { 
        set<string> combinations;
        int length;
        cin >> length;

        string s;
        cin >> s; 

        for (int i = 1; i < s.length(); i++) {
            int p = i - 1;
            combinations.insert(s.substr(p, 2));
            combinations.insert(s.substr(i, 2));
        }

        cout << combinations.size() - 1 << endl;
    }
}