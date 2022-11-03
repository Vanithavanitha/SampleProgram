package packageone;
import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scanner.nextInt();
        
        for(int i=1;i<=n;i++)
        {
        	if(i%2!=0)
        	{
        		sum=sum+1;
        	}
        }
        System.out.println("Sum Of The Odd Number:"+n+ "=" +sum);
	}

}
