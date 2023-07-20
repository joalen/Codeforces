#include <iostream> 
#include <vector> 
#include <cmath> 

using namespace std;

int main() { 
    int t;
    cin >> t;

    while (t-- > 0) { 
        long long n;
        long long sum = 0; 
        cin >> n;

        while (n >= 1) { 
            sum += n;

            if (n % 2 == 0) { 
                n = floor(n/2);
                
            } else { 
                n -= 1; 
                n = floor(n/2);
            }
        }

        cout << sum << endl;
    }
}