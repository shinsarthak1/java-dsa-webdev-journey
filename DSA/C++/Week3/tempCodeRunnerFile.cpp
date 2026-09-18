#include <iostream>
using namespace std;
void countFactors(int n){
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        if(n%i==0){
            count++;
        }
    }
}
int main(){
    int n;
    cin >> n;
    countFactors(n);
    return 0;
}