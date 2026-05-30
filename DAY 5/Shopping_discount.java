import java.util.Scanner;
public class Shopping_discount {

	double discountSystem(double bill,double discount)
	{
		double dis_bill= bill* (discount/100);
		return bill-dis_bill;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount (in Rs.):");
		double bill = sc.nextDouble();
		System.out.println("Enter discount in percentage:");
		double discount = sc.nextDouble();
		Shopping_discount new_bill = new Shopping_discount();
		
		System.out.println("The new bill amount is Rs."+new_bill.discountSystem(bill,discount));
		sc.close();
	}

}
