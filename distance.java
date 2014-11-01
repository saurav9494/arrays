import java.util.*;
class distance
{
public static void main(String s[])
{
int a[]={1,4,5,3,2,7,6,1,3,2};
int i,j,n1,n2;
System.out.println("enter 2 numbers for distance..");
Scanner sn=new Scanner(System.in);
n1=sn.nextInt();
n2=sn.nextInt();
for(i=0;i<10;i++)
{


if(a[i]==n1)
{
for(j=i+1;j<10;j++)
{
if(a[j]==n2)
{
System.out.println("found...distance="+(j-i-1)+" at position "+(i+1)+" and "+(j+1));
break;
}
}
}
else if(a[i]==n2)
{
for(j=i+1;j<10;j++)
{
if(a[j]==n1)
{
System.out.println("found...distance="+(j-i-1)+" at position "+(i+1)+" and "+(j+1));
break;
}
}
}

}
}
}