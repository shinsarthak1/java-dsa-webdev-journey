#include <iostream>
using namespace std;

int main() {
    long long n;
    cin >> n;

    long long reverse = 0;

    if (n == 0) {
        cout << 0;
        return 0;   // fixed: must return an int
    }

    while (n != 0) {
        reverse = reverse * 10 + n % 10;
        n /= 10;
    }

    cout << reverse;

    return 0;
}