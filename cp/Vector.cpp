/* 
Added a concept of vector which is mostly used in cp

 */
#include <bits/stdc++.h>
using namespace std;
void printVec(vector<int> v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;
}
/*
By Sonali Rao
*/

int main()
{
    vector<int> v;
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
    int x;
    cin>>x;
    v.push_back(x);    
    }
    printVec(v);
}