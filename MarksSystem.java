import java.util.Scanner;
class MarksSystem
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		MarksSystem n=new MarksSystem();
		n.menu();
	}
	void menu()
	{
		System.out.print("Enter the number of subjects :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean exit=true;
		do
		{
			System.out.println("*****MENU*****");
			System.out.println("1.Enter Marks");
			System.out.println("2.Calculate Total");
			System.out.println("3.Calculate Average");
			System.out.println("4.Find Grade");
			System.out.println("5.Exit");
			System.out.print("Enter your option :");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
				{
					getMarks(ar);
					break;
				}
				case 2:
				{
					int a=total(ar);
					System.out.println("The Total marks is "+a);
					break;
				}
				case 3:
				{
					double b=average(ar);
					System.out.println("The average of the entered marks is "+b);
					break;
				}
				case 4:
				{
					String c=grade(ar);
					System.out.println(c);
					break;
				}
				default:
				{
					exit=false;
				}
			}
		}while(exit);
	}
	void getMarks(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" subject mark :");
			arr[i]=sc.nextInt();
		}
	}
	int total(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	double average(int[] arr)
	{
		return ((double)total(arr))/arr.length;
	}
	String grade(int arr[])
	{
		double avg=average(arr);
		if(avg>=90 && avg<=100)
		{
			return "Your Grade is A";
		}
		else if(avg>=70 && avg<=89)
		{
			return "Your Grade is B";
		}
		else if(avg>=50 && avg<=69)
		{
			return "Your Grade is C";
		}
		else if(avg>=35 && avg<=49)
		{
			return "Your Grade is D";
		}
		else
		{
			return "FAIL";
		}
	}
}