import java.util.Scanner;
class Prog75
{
public static void main(String ar[])
{
int i,pos,j;
int a[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter 10 numbers");
for(i=0;i<10;i++)
a[i]=s.nextInt();
System.out.println("Enter the position which is to be deleted");
pos=s.nextInt();
for(i=0;i<10;i++)
{
if(i==pos)
{
for(j=i;j<9;j++)
a[j]=a[j+1];
}
}
for(i=0;i<9;i++)
System.out.println(a[i]);
}
}