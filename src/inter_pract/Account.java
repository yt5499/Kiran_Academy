//Design banking system, where user can credit, debit and display account balance;

package inter_pract;

import java.util.Scanner;

public class Account {
//	Scanner sc = new Scanner(System.in);
	
	private int mainBal;
	
	// getter method to display main balance
	public int getMainBal() {
		return mainBal;
	}
	
	// method to credit amount in main account
	public void toCredit(int amount) {
//		System.out.print("Enter amount you want to deposit to your bank account: ");
		mainBal = mainBal + amount;
		System.out.println("Amount "+amount+" has been successfully credited to your account");
		System.out.print("Account Balance: "+getMainBal());
		System.out.println();
		System.out.println();
	}
	
	// method to debit amount from main account
	public void toDebit(int amount) {
		if(mainBal>=amount) {
			System.out.println("Amount "+amount+" has been successfully debited from your account");
			mainBal = mainBal - amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
		System.out.print("Account Balance: "+getMainBal());
		System.out.println();
		System.out.println();
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account obj = new Account();
		
		for(int i=0 ; i<10 ; i++) {			
			System.out.print("Do you want to credit or debit, Enter 'C' for credit & 'D' for debit: ");
			char ch = sc.next().charAt(0);
			if(ch == 'C' || ch == 'c') {
				System.out.print("Enter amount to credit: ");
				int amt = sc.nextInt();
				obj.toCredit(amt);
			}
			else if(ch == 'D' || ch == 'd') {
				System.out.print("Enter amount to debit: ");
				int amt = sc.nextInt();
				obj.toDebit(amt);
			}
			else {
				System.out.println("Invalid Input!");
			}
		}
		System.out.println("Transaction successfully completed!");
	}

}
