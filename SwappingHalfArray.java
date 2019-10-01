import java.util.Scanner;
class Prog72
{
public static void main(String ar[])
{
int a[]=new int[12],k,i,j,l;
System.out.println("Enter 12 number");
Scanner s=new Scanner(System.in);
for(i=0;i<12;i++)
a[i]=s.nextInt();
j=a.length;
for(i=0;i<6;i++)
{
k=a[i];
a[i]=a[j-i-1];
a[j-i-1]=k;
}
System.out.println("New array is");
for(int x:a)
System.out.print(x+"\t");
}
}