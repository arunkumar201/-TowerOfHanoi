#include <bits/stdc++.h>
using namespace std;
void Tower_Of_Hanoi(int n,char A,char C,char B)//A=source  B=median C=destination
 {
   if(n==0)
   {
     return ;
   }
   else
   {
     Tower_Of_Hanoi(n-1,A,B,C);
     cout<<"move disk 1 from rod "<<A<<" to rod "<<C<<endl;
     Tower_Of_Hanoi(n-1,B,C,A);
   }
 }
int main()
{   int n;
  cout<<"enter the number of disks:";
  cin>>n;
 Tower_Of_Hanoi(n,'A','C','B');
  return 0;

}
 
