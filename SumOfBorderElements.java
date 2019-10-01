import java.util.Scanner;
class Prog87
{
public static void main(String ar[])
{
int a,b,i,j,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no. of rows and coloumns");
a=s.nextInt();
b=s.nextInt();
int arr[][]=new int[a][b];
System.out.println("Enter "+a*b+" number");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
arr[i][j]=s.nextInt();
}
}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(i==0||j==0||j==b-1||i==a-1)
sum+=arr[i][j];
}
}
System.out.println("Sum of border elements is"+sum);
}
}