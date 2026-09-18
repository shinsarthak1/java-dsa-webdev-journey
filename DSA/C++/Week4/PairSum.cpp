#include <iostream>
using namespace std;

int main() {

    int t;
    cin >> t;

    while (t--) {

        int n;
        cin >> n;

        int a[1000];

        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }

        int x;
        cin >> x;

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (a[i] + a[j] == x) {
                    count++;
                }
            }
        }

        cout << count << endl;
    }

    return 0;
}