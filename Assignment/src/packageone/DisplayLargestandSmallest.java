//* The program should display the largest and smallest numbers entered
package packageone;
import java.util.Scanner;
public class DisplayLargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
		int num;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		char choice;
		do {
			System.out.println("enter the number:");
			num=scanner.nextInt();
			if(num > max)
			{
				max=num;
			}
			if(num<min) {
				min=num;
			}
			System.out.println("Do you want to continue Y/N ?");
			choice=scanner.next().charAt(0);
			}while(choice=='Y'||choice=='y');
		System.out.println("Largest Number:"+max);
		System.out.println("Smallest Number:"+min);
	}
}
