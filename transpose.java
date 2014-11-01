class transpose
{
public static void main(String s[])
{
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{0,0,0},{0,0,0},{0,0,0}};
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=a[j][i];
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]);
}
System.out.println();
}
}
}