#include <iostream>
using namespace std;
int main(){
    long long n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        // n - i spaces
        for (int j = 1; j <=n-i; j++)
        {
            cout << " ";
        }
        // i stars
        for (int j = 1; j <= i;j++){
            cout << "*";
        }
            cout << endl;
    }
    return 0;
}