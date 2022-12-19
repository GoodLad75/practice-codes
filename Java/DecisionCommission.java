//LEWIS,PAOLO 	ICT 101//
import java.util.Scanner;
public class DecisionCommission
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String applianceType;
		String a = "a"; String b = "b"; String c = "c"; String d = "d"; 
		double salePrice;
		double commissionA; double commissionB; double commissionC;

		System.out.println("Please enter appliance type: "); applianceType = input.nextLine().toUpperCase();
		System.out.println("Please enter sale price: "); salePrice = input.nextDouble();
		input.close();

		if(applianceType .equals(a) || salePrice >= 15000 && salePrice <= 30000){
			commissionA = salePrice * 0.10;
			if (commissionA <= 2500){
				System.out.println("Commission is: 2500");
			}
			else if (commissionA >= 2500){
				System.out.println("Commission is " + commissionA);
			}
		}

		else if(applianceType .equals(b) || salePrice >= 10000 && salePrice <= 14999){
			commissionB = salePrice * 0.05;
			if (commissionB <= 600){
				System.out.println("Commission is: " + commissionB);
			}
			else if (commissionB >= 600){
				System.out.println("Commission is 600");
			}
		}

		else if(applianceType .equals(c) || salePrice >= 5000 && salePrice <= 9999){
			commissionC = salePrice * 0.03;
				System.out.println("Commission is: " + commissionC);
		}

		else if(applianceType .equals(d) || salePrice >= 1000 && salePrice <= 4999){
				System.out.println("Commission is: 100");
		}
		else{
			System.out.println("Please enter a valid appliance type:");
		}
		}
}