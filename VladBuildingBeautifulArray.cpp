#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void all_even_or_odd() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a.begin(), a.end());
    if (a[0] % 2 == 1) {
        cout << "YES" << endl;
        return;
    }
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 1) {
            cout << "NO" << endl;
            return;
        }
    }
    cout << "YES" << endl;
}

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        all_even_or_odd();
    }
}
