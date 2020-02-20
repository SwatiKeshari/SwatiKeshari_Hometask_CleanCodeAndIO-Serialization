package interest;

public class CompoundInterest {

	CompoundInterest(int p, int t, int r, int n) {
		
		double amount = p*Math.pow(1+r/n, n*t);
		double CI = amount - p;
		System.out.println("Compound interest is:"+ CI);
	}
}
