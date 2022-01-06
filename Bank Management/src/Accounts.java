import java.util.*;
public class Accounts 
{
	private Double acc_num;
	private String acc_name;
	private String acc_type;
	private Double initial_deposit;
	private Double balance;

	public Accounts(Double f1, String text, Double f3)
	{
		this.acc_num =f1;
		this.acc_name = text;
		this.initial_deposit = f3;
		this.balance = f3;
		if(this.initial_deposit<15000)
		{
			this.acc_type = "Junior Account";
		}
		else if(this.initial_deposit<50000)
		{
			this.acc_type = "Standard Account";
		}
		else if(this.initial_deposit<100000)
		{
			this.acc_type = "Executive Account";
		}
		else
		{
			this.acc_type = "Premium Account";
		}
	}
	Double get_acc_num()
	{
		return this.acc_num;
	}

	
	void deposit(Double num)
	{
		this.balance = this.balance + num;
		System.out.println("Balance Successfully Updated");
		this.show_account();
	}
	boolean withdraw(Double num)
	{
		if(this.balance < num)
		{
			System.out.println("InSufficient Balance");
			this.show_account();
			return false;
		}
		else
		{
			this.balance = this.balance - num;
			System.out.println("Balance Successfully Updated");
			this.show_account();
			return true;
		}
	}

	void show_account() 
	{
		System.out.println("Account Holder: "+this.acc_name);
		System.out.println("Account Number: "+this.acc_num);
		System.out.println("Account Type: "+this.acc_type);
		System.out.println("Total Balance: "+this.balance);
		System.out.println();
	}
}

