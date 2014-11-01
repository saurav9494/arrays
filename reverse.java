import java.util.*;
class reverse
{
public static void main(String s[])
{
int n,k,i,j,temp;
int a[]={1,2,3,4,5,6,7,8,9,10,11};
j=10;
while(j>=5)
{
for(i=0;i<=5;i++)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
j--;
}
}
for(i=0;i<11;i++)
{
System.out.println(a[i]);
}
}
}
