package construction_cost;

import java.util.Scanner;

public class Construction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the area of the house:");
		float area = sc.nextFloat();
		System.out.println("Type '1' for fully automated:");
		int fa = sc.nextInt();
		
		System.out.println("Materials Required : \n 1.Standard Materials \n 2. Above Standard Materials \n 3. High Standard Materials");
		System.out.println("Enter the material standard you want :");
		int ch = sc.nextInt();
		
		float total;
		switch(ch) {
		case 1: total = 1200*area;
				System.out.println("Total construction cost by using standard materials is Rs:" + total);
				break;
		case 2: total = 1500*area;
				System.out.println("Total construction cost by using above standard materials is Rs:" + total);
				break;
		case 3: 
				if(fa==1) {
					total = 2500*area;
					System.out.println("Total construction cost by using high standard materials and fully automated home is Rs:" + total);
				}
				else
					System.out.println("Total construction cost by using high standard materials only is Rs:" + 1800*area);
			    break;
		}

	}

}
