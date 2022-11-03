package packageone;
import java.util.Scanner;
public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=1;
       int rsize;
       System.out.println("enter row number:");
       Scanner scanner=new Scanner(System.in);
       rsize=scanner.nextInt();
       for(int r=1;r<=rsize;r++)
       {
       	for(int space=1;space<=rsize;space++)
       		System.out.print("");
       	for(int c=1;c<=r;c++) {
       		System.out.print(" *");
       	}
       	System.out.println();
       }
       }
	

}
