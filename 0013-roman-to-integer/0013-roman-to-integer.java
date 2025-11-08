class Solution {
    public int romanToInt(String s) {
int pos=0,pos1=0,pos2=0,l,i,x,j,num=0;
char c=' ',c1=' ';
char ar[]={'I','V','X','L','C','D','M'};
int n[]={1,5,10,50,100,500,1000};
l=s.length();
if(l==1)
{
c1=s.charAt(0);
for(j=0;j<ar.length;j++)
{
if(ar[j]==c1)
num=num+n[j];
}
}
else
{
for(x=0;x<l-1;x++)
{
c=s.charAt(x);
for(i=0;i<ar.length;i++)
{
if(ar[i]==c)
pos=i;
if(ar[i]==s.charAt(x+1))
pos1=i;
if(ar[i]==s.charAt(l-1))
pos2=i;
}
if(pos<pos1)
num=num-n[pos];
if(pos>pos1)
num=num+n[pos];
if(pos==pos1)
num=num+n[pos];
}
num=num+n[pos2];
}

return num;
}
}