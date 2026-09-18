#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int positive = 0;
    int negative = 0;
    int even = 0;
    int odd = 0;

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;

        // Positive / Negative
        if (num > 0) {
            positive++;
        } else if (num < 0) {
            negative++;
        }

        // Even / Odd
        if (num % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }

    cout << positive << endl;
    cout << negative << endl;
    cout << even << endl;
    cout << odd << endl;

    return 0;
}