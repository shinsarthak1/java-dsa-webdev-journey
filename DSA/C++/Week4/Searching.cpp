#include <iostream>
using namespace std;
int main(){
    int n;
    cin >> n;

    int target;
    cin >> target;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    bool flag = false;
    for (int i = 0; i < n; i++)
    {
        if(arr[i]==target){
            flag = true;
            break;
        }
    }
    if(flag){
        cout << "YES" << endl;
    } else{
        cout << "NO" << endl;
    }
    return 0;
}