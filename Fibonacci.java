# Fibonacci
import java.io.*;
import java.util.*;
public class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//System.out.println("Enter the numbers");
int n=sc.nextInt();
int n1=0,n2=1,n3;
int count=10;
System.out.println(n1+" "+n2);
for(int i=2;i<count;++i)
{
n2=n1+n2;
System.out.println(""+n3);
n1=n2;
n2=n3;
}
}
}
