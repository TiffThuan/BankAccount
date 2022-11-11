/**
* Name: Thanh Thuan Thi Nguyen
* File: BankAccount
* Description: Assignment
*/

/**
 * @author Tiff
 *
 */
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CheckingAccount account = new CheckingAccount();	
		String uniID;
		double initialBal;
		double intRte;
		double depAmt;
		int selectNum;
		boolean repeat=true;
	 	
	 	System.out.println("MidFirst Banking App");
	 	System.out.print("Enter the unique ID: ");
	 	uniID = input.nextLine();
	 	account.setUniqueID(uniID);
		 	
	 	System.out.print("Enter the initial balance: $");
	 	initialBal = input.nextDouble();
	 	account.setAcctBalance(initialBal);
		 	
	 	System.out.print("Enter the annual interest rate as a percentage: ");
	 	intRte = input.nextDouble();
	 	account.setAnnualInterestRate(intRte);	
	 	System.out.println();
		 
	 	do {	
	 		if (repeat) {
	 			System.out.println("=============================================");	
			 	System.out.println("=               OPTIONS BELOW               =");
			 	System.out.println("=============================================");
		        System.out.println("1. Deposit ");
		        System.out.println("2. View Daily Interest Rate");
		        System.out.println("3. View Account Details");
		        System.out.println("4. Exit");
	 		}
		 	System.out.print("Enter your selection: ");
		 	selectNum = input.nextInt();
		 	System.out.println();
	       
		 	if (selectNum==1){
	        	System.out.print("Enter your deposit amount: $");
	        	depAmt= input.nextDouble();
	        	while (depAmt <= 0){
	        		System.out.println("!!!ERROR: deposits must be great than $0!!! ");
	        		System.out.println("Enter your deposit amount: ");
	        		depAmt= input.nextDouble();
	        	}
	        	account.depositCash(depAmt);
	        	System.out.print("New Balance: $");
	        	System.out.println(account.getAcctBalance());
	        	repeat = true;
	        }
		 	
	        else if (selectNum==2){
	        	System.out.println("Your Daily Interest Amount is: ");
	        	System.out.printf("$ %.2f\n",account.getDailyIntRate()*account.getAcctBalance());
	        	repeat = true;
	        }
	        else if (selectNum==3){
	        	System.out.println(account.toString());
	        	repeat = true;
	        } 
	        else if (selectNum==4){
	        	System.out.println("Program exiting…");
	        }
	        else{
	        	System.out.println("INVALID SELECTION - TRY AGAIN!");
	        	repeat=false;
	        }
	 	}while(selectNum!=4);
		 	
	 	input.close();
		}
	}
