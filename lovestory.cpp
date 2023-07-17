#include <iostream> 



using namespace std; 

int main() {
    int t;
    cin >> t;

    while (t-- > 0) { 
        string codeforces = "codeforces";
        string test_str;
        int differences = 0; 
        cin >> test_str;

        if (test_str.compare(codeforces) == 0) { cout << 0 << endl; continue; }

        for (int i = 0; i < test_str.size(); i++) { if (test_str[i] != codeforces[i]) { differences++; }}
        cout << differences << endl; 
    }
}