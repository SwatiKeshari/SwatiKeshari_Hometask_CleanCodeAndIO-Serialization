package interest;

import java.io.IOException;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.write("Enter the principal:".getBytes());
		int p = sc.nextInt();	
		System.out.write("Enter time:".getBytes());
		int t = sc.nextInt();	
		System.out.write("Enter rate of interest:".getBytes());
		int r = sc.nextInt();	
		
		SimpleInterest Si = new SimpleInterest(p,t,r);
		System.out.write("Enter number of time it is compounded:".getBytes());
		int n = sc.nextInt();
		CompoundInterest Ci = new CompoundInterest(p,t,r,n);
		}

}
