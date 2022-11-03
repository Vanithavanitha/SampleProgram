package packageone;
import java.util.Scanner;
public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,countPositive = 0,countNegative = 0,countZero = 0;
		char choice;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.print("Enter the number:");
			num=scanner.nextInt();
			if(num>0)
			{
				countPositive++;
			}else if(num<0)
			{
				countNegative++;
			}else
			{
				countZero++;
			}
			System.out.println("Do you want to continue y/n ? ");
			choice=scanner.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		System.out.println("Positive Numbers: "+countPositive);
		System.out.println("Negative Numbers: "+countNegative);
		System.out.println("Zero Numbers: "+countZero);
		}
}
