
import java.lang.Math;
import java.util.Scanner;

public class BaiToanLaiSuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    System.out.println("numberOfYears: ");
    int n = scan.nextInt();
    System.out.println("monthlyInterestRate: ");
    double x = scan.nextDouble();
    System.out.println("loanAmount: ");
    long y = scan.nextLong();
    double monthlyPayment = (x * y)/(1-(1/Math.pow((1+x),(n*12))));
    System.out.println(monthlyPayment);
    
	}

}
