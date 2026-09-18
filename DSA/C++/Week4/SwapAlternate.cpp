#include <iostream>
using namespace std;

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {

    int t;
    cin >> t;

    while (t--) {

        int n;
        cin >> n;

        int arr[n];

        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }

        // Swap alternate elements
        for (int i = 1; i < n; i += 2) {
            swap(arr[i], arr[i - 1]);
        }

        // Print array
        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }

        cout << endl;
    }

    return 0;
}