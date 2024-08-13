package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImplement impl=new AtmOperationImplement();
		Scanner scan=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=1234;
		System.out.println("Welcome to ATM Machine");
		System.out.println("Enter the ATM Number");
		int atmnumber2=scan.nextInt();
		System.out.println("Enter the ATM Pin");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnumber2 && atmpin==atmpin2){
			while(true) {
			System.out.println(" 1.viewAvailable\n 2.withdrawAmount\n 3.depositAmount\n 4.viewMiniStatement\n 5.exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			if(choice==1) {
				impl.viewBalance();
			}
			else if(choice==2) {
				System.out.println("Enter the amount to withdraw");
				double withdrawAmount=scan.nextDouble();
				impl.withdrawAmount(withdrawAmount);
		}
			else if(choice==3) {
				System.out.println("Enter the amount to deposit");
				double depositAmount=scan.nextDouble();
				impl.depositAmount(depositAmount);
			}
			else if(choice==4) {
				impl.viewMiniStatement();
			}
			else if(choice==5) {
				System.out.println("Please collect your ATM card \n Thank you");
				System.exit(status);

			}
		}
		}
		else {
			System.out.println("Incorrect ATM Number or Pin");
		}
	}

}
