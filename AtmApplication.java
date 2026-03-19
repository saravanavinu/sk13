import java.util.Scanner;
class AtmApplication
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		AtmApplication n=new AtmApplication();
		n.menu();
	}
	void menu()
	{
		int initial=500;
		int deposit=initial;
		boolean exit=true;
		do
		{
			System.out.println("*****WELCOME*****");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.print("Enter your Option :");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
				{
					deposit=deposit(deposit);
					break;
				}
				case 2:
				{
					deposit=withdraw(deposit);
					break;
				}
				case 3:
				{
					int a=checkBalance(deposit);
					System.out.println("Balance amount is rupees "+a);
					break;
				}
				case 4:
				{
					exit=false;
					break;
				}
				default :
				{
					System.out.println("Press the valid Key");
				}
			}
		}while(exit);
	}
	int deposit(int d)
	{
		System.out.print("Enter your deposit amount :");
		int amount=sc.nextInt();
		if(amount>=500 && amount<=10000)
		{
			d=d+amount;
		}
		else 
		{
			System.out.println("Minimum 500 and Maximum 10000 can be Deposited ");
		}
		return d;
		
	}
	int withdraw(int d)
	{
		System.out.print("Enter your Withdraw amount :");
		int withdraw=sc.nextInt();
		if(withdraw>d)
		{
			System.out.println("No Sufficient Balance");
		}
		else if(withdraw>=500 && withdraw<=10000)
		{
			d=d-withdraw;
			System.out.println("Your withdrew rupess "+withdraw);
		}
		else
		{
			System.out.println("Minimum 500 and Maximum 10000 can be Deposited ");
		}
		return d;
	}
	int checkBalance(int d)
	{
		return d;
	}
}