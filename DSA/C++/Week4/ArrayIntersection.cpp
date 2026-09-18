#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    for (int i = 0; i <= t;i++){
        int n;
        cin >> n;
        int a[1000];
        for (int i = 0; i < n;i++){
            cin >> a[i];
        }
        int m;
        cin >> m;
        int b[1000];
        for (int i = 0; i < m; i++){
            cin >> b[i];
        }

        for (int i = 0; i < n;i++){
            bool isFound = false;

            for (int j = 0; j < m;j++){
                if(a[j]==b[j]){
                    isFound = true;
                    break;
                }
            }

            if(isFound){
                cout << a[i] << " ";

            }
        }
        cout << endl;
    }
    return 0;
}