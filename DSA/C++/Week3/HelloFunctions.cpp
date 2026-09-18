#include <iostream>
using namespace std;
void greet(int n){
    for (int i = 1; i <= n;i++){
        cout << "I am learning functions" << endl;
    }
}
int main(){
    int n;
    cin >> n;
    greet(n);
    return 0;
}