#include <iostream>
using namespace std;

bool isPrime(int n) {
    if (n < 2) {
        return false;
    }

    int count = 0;

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            count++;
        }
    }

    return (count == 0);
}

int main() {
    int n;
    cin >> n;

    // Print all primes from 1 to N
    for (int i = 1; i <= n; i++) {
        if (isPrime(i)) {
            cout << i << " ";
        }
    }

    return 0;
}