//* the user to input an integer and then output the number with the digits reversed
package packageone;
import java.util.Scanner;
public class ReverseDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int reversenum=0;
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is: "+reversenum);

	}

}
