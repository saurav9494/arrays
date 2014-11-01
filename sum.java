import java.util.*;
class sum
{
public static void main(String s[])
{
int i,j,r;
int a[]={2,4,1,3,3,5,7,9,4,8,7};
Scanner sn=new Scanner(System.in);
System.out.println("enter required sum...");
r=sn.nextInt();
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]+a[j]==r)
{
System.out.println(a[i]+"+"+a[j]);
}
}
}
}
}

