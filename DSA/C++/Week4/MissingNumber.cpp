#include <iostream>
using namespace std;
 
int main() {
 
    int t;
    cin >> t;
 
    for (int i = 0; i < t; i++) {
 
        int n;
        cin >> n;
 
        int arr[n];
        int ans;
 
        for (int j = 0; j < n; j++) {
            cin >> arr[j];
        }
 
        for (int j = 0; j < n; j++) {
 
            int target = arr[j];
            int count = 0;
 
            for (int k = 0; k < n; k++) {
 
                if (arr[k] == target) {
                    count++;
                }
 
            }
 
            if (count == 1) {
                ans = arr[j];
                break;
            }
        }
 
        cout << ans << endl;
    }
 
    return 0;
}