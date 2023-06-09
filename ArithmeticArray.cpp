#include <iostream> 

using namespace std;

int minOperations(int &sum, int &n) {
    int x = 1;
    while (++n - sum < 0) {
        x++;
    }

    return x;
}

int main() {
    int t; 
    cin >> t;

    while (t-- > 0) {
        int n;
        cin >> n;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = 0;
            cin >> num;
            sum += num;
        }

        if ((double) sum / n == 1.0) {
            cout << 0 << endl;
        } else { 
            cout << minOperations(sum, n) << endl;
        }
    }
}