class Prog43v
{
public static void main(String ar[])
{
int a=0,b=1,c;
c=a+b;
System.out.print(a+"\t"+b+"\t");
while(c<=200)
{
System.out.print(c+"\t");
a=b;
b=c;
c=a+b;
}
}
}