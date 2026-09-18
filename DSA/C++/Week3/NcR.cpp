#include <iostream>
using namespace std;
long long factorial(int n){
    long long ans = 1;
    for (int i = 1; i <= n; i++)
    {
        ans *= i;
    }
    return ans;
}
int main(){
    int n,r;
    cin >> n >> r;
    int nfact = factorial(n);
    int rfact = factorial(r);
    int nrfact = factorial(n-r);
    cout << nfact / (rfact * nrfact) << endl;
    return 0;
}