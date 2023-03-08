package task3;

import java.util.Scanner;

public class ATM2 {
	

	public static void main(String[] args) {

		String userID;
        String password;
        int balance = 40000;
        int withdraw=0;
        int deposit=0;
        int transfer;
        int Account;
        int transaction=0;
        

        //login of the user with username and password
        //reading the input from the user

                boolean flag = true;
                while (flag) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter your credentials to proceed");
                    System.out.println("\nEnter the User Id :");
                    int ID = sc.nextInt();
                    System.out.println("Enter the PIN :");
                    int pass=sc.nextInt();
                    if (ID==9999 && pass==1111){
                        System.out.println("logged successfully");
                    }else {
                        System.out.println("no records found");
                    }
                    flag=false;

                while (true) {

                    System.out.println("----Welcome to the Bank----");
                    System.out.println(" 1 For Withdraw");
                    System.out.println(" 2 For Deposit");
                    System.out.println(" 3 For Transfer");
                    System.out.println(" 4 For check balance");
                    System.out.println(" 5 Transaction history");
                    System.out.println(" 6 For EXIT");
                    System.out.println("---Select the option you want to---");
                    System.out.println();

                    //Getting the choice from the user
                    int UserChoice = sc.nextInt();
                    
                    ATM2 a1 = new ATM2();
                    
                    //We can use the switch case to be performed the above operations
                    switch (UserChoice) {
                        case 1:
                            System.out.println("Enter the amount to withdraw:");
                            withdraw = sc.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("\nPlease collect your card and money");
                                System.out.println("Remaining balance is :" + balance);
                                System.out.println("Transaction History of withdrawn :" + withdraw);
                                transaction=1;
                            } else {
                            System.out.println("\nInsufficient balance are available");
                        }
                        System.out.println();

                        break;
                    case 2:
                        //If we deposit the money to our bank account
                        System.out.println("\nEnter the money to be deposited:");
                        deposit = sc.nextInt();
                        if (deposit <= balance) {
                            balance = deposit + balance;
                            System.out.println("\nYour money has been successfully deposited");
                            System.out.println("Remaining balance is :" + balance);
                            String trans2 = "\tRs deposited - " + balance;
                            System.out.println("Transaction history of deposit :" + deposit);
                            transaction=-1;
                        } else {
                            System.out.println("\nEnter the minimum deposit balance to get deposited ");}
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Enter the amount you want to transfer :");
                        transfer = sc.nextInt();
                        System.out.print("Enter a account number of Beneficiary :");
                        Account = sc.nextInt();
                        if (transfer <= balance) {
                            balance -= transfer;
                            System.out.println("\nyour money has been successfully transferred");
                            System.out.println("After transfer remaining balance is :" + balance);
                            String trans3 = "\tRs Transferred - " + balance;
                            System.out.println("Transaction history of Transfer :" + transfer);
                        }
                        System.out.println();
                        break;
                    case 4:
                        //so the remaining and total balance will be displaying
                        System.out.println("\nTotal balance after all the transaction is:" + balance);
                        System.out.println();
                        break;
                        
                    case 5:
                    	if (transaction == -1)
                            System.out.println("You deposited Rs." + deposit);
                        else if (transaction == 1)
                            System.out.println("You withdrawn Rs." + withdraw);
                        else
                            System.out.println("You have not done any transaction yet");
                    	break;
                    	
                    case 6:
                        // EXIT MENU
                    	System.out.println("Thank you.");
                    	System.exit(0);                }
                    
                    
                    
                    
                    
                    
            }
        }
	}
	
	

}