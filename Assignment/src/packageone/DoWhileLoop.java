//*A do-while loop that asks the user to enter two numbers
package packageone;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       int sum=0;
       char option;
       do {
    	   System.out.println("Enter the two numbers:");
    	   int num1=scanner.nextInt();
    	   int num2=scanner.nextInt();
    	   sum=sum+num1+num2;
    	   
    	   System.out.println("Do you wish to perform another oeration,Y/N:");
    	   option=scanner.next().charAt(0);
          }while(option=='Y' || option=='y');
       System.out.println("sum"+sum);
       
	}

}
