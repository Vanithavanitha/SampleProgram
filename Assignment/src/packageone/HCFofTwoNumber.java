//* To calculate HCF of two numbers
package packageone;

public class HCFofTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12,num2=15,hcf=0;
		
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1 % i==0 && num2 % i==0)
				hcf=i;
		}
		System.out.println("the HCF is:"+hcf);

	}

}
