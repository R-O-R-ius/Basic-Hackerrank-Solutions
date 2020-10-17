import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter upto what number sum is required");

int x = sc.nextInt();
int sum = 0;

int a=0;
int b=1;
for(int i = 1; i<=x;i++)
{sum = a+b;
System.out.print( a + "  ");

a=b;
b=sum;
}




}
}
