package BankingApplication;
import java.util.Scanner;
public class BankingApplication
{
	public static void main(String[] args) 
	{
		BankAccount obj1 = new BankAccount( "Javan",98745);
		obj1.showMenu();

	}
}



class BankAccount
{
	int balance;
	int previousTransaction;
	int  CustomerID;
	String CustomerName;
	
BankAccount(String cname,int cid)
{
	CustomerName = cname;
	CustomerID = cid;
}

	
	void deposit(int amount)
	{
		if(amount!=0)
			balance = balance+  amount;
		previousTransaction =  amount;
	}
	
	
	
	void withdrawal(int amount)
	{
		if(amount !=0)
			balance =balance - amount;
		previousTransaction = -amount;
	}
	
	
	void getPreviousTransaction()
	{
		if(previousTransaction >0)
		{
			System.out.println("Deposited  "+ previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn  "+ Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction recorded");
		}
	}
	
	
	void showMenu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome "+ CustomerName);
		System.out.println("Your ID is "+ CustomerID);
		System.out.println("\n");
		
		
		
		System.out.println("A.Check balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Previous Transaction");
		System.out.println("E.Exit");
		
		char option ='\0';
		
		do
		{
			System.out.println("===========================================");
			System.out.println("Enter an option");
			System.out.println("===========================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("---------------------------------------");
				System.out.println("Balance= "+ balance);
				System.out.println("---------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("---------------------------------------");
				System.out.println("Please enter the Deposit amount");
				System.out.println("---------------------------------------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("---------------------------------------");
				System.out.println("Please enter the  withdrawal amount");
				System.out.println("---------------------------------------");
				int amount2 = sc.nextInt();
				withdrawal(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------------");
				getPreviousTransaction();
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("=======================================");
				break;
				
			default:
				System.out.println("Invalid option!Please enter a valid option");
				break;
			}	
		}
		while(option != 'E');
		{
			System.out.println("Thanks for using our services");
		}
		
		
	}
	
}