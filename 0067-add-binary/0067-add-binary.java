class Solution {
    public String addBinary(String a, String b) {
char d,c;
int d1,a1,v=0,c1,x=0,add=0,s;
String sum="";
int l=a.length();
int l1=b.length();
if(l<l1)
{
v=l1-l;
for(int i=0;i<v;i++)
{
a="0"+a;
}
l=a.length();
}
if(l>l1)
{
x=l-l1;
for(int j=0;j<x;j++)
{
b="0"+b;
}
l1=b.length();
}
for(int m=l-1;m>=0;m--)
{
c=a.charAt(m);
c1=c-'0';
d=b.charAt(m);
d1=d-'0';
add=add+c1+d1;
s=add%2;
sum=s+sum;
add=add/2;
}
if(add==1)
sum=add+sum;
else
sum=sum;
return sum;
}
}