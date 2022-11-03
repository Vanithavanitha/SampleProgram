package packageone;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a Number:");
		int num=scanner.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(num + " x " + (i+1)+ " = " + (num * (i+1)));
		}

	}

}
