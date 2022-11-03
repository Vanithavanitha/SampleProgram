//* Write a program to prime number
package packageone;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the positive integer:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int c=0;
		for(int i=2;i<number;i++)
		{
			if(number % i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(number+" -- is a prime number");
		}
		else {
			System.out.println(number+" -- is a not prime number");
	}
	}
}
