#include<iostream>
using namespace std;
int main()
{
    int r,c;
    cout<<"enter the dimension of the arrays"<<endl;
    cout<<"enter rows"<<endl;
    cin>> r;
    cout<<"enter columns"<<endl;
    cin>> c;
    cout<<"First array of numbers:"<<endl;
    int first[r][c], second[r][c];
    int i,j;
    for( i=0;i<r;i++)
        {
        cout<<"Enter two integers: "<<endl;
        for( j=0;j<c;j++)
            {
            cin>>first[i][j];
            }
        }
    cout<<"\n\n\nSecond array of numbers:"<<endl;
    for( i=0;i<r;i++)
        {
        cout<<"Enter two more integers: "<<endl;
        for( j=0;j<c;j++)
            {
            cin>>second[i][j];
            }
        }
    for( i=0;i<r;i++)
        {
        for( j=0;j<c;j++)
            {
            first[i][j]=first[i][j]+second[i][j];
            }
        }
    cout <<"first array"<<"\n";
    for(i=0;i<r;i++)
        {
        cout<<"\n";
        for(j=0;j<c;j++)
            {
            cout <<first[i][j]<<ends;
            }
        }
        cout<<"\n"<<"second array"<<"\n";
    for(i=0;i<r;i++)
        {
        cout<<"\n";
        for(j=0;j<c;j++)
            {
            cout <<second[i][j]<<ends;
            }
        }
    return 0;
}
