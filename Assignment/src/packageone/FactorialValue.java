package packageone;
import java.util.Scanner;
public class FactorialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int num=4;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);

	}

}
