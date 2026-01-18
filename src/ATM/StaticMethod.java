package ATM;

import java.util.Scanner;

public class StaticMethod {
	
	private static final int PinVerify = 0;

//static is non access modifier 
	//static is not an object member 
	//static is a class member 
static	Scanner sc=new Scanner(System.in);

static double balance=0.0; 

public static void Deposit()
{
	System.out.println("Enter the amt to deposit:-");
	double dep=sc.nextDouble(); //50
	
	if(dep>=100)
	{
		balance=balance+dep;
		System.out.println(dep+" has been deposited successfully");
	}
	else
	{
		System.out.println("Please enter the amt greater than or equal to Rs.100");
		Deposit();
		
	}
	
}



public static void Withdraw()
{
	System.out.println("Enter the amt to withdraw:-");
	double wit=sc.nextDouble(); //50
	
	if(wit>=100)
	{
		balance=balance-wit;
		System.out.println(wit+" HAS BEEN WITHDRAW SUCCESSFULLY");
		
	}
	else
	{
		System.out.println("Please enter the amt greater than or equal to Rs.100");
		Withdraw();
	}
	
}



public static void Choice()
{
	
	System.out.println("Enter your choice \n1.DEPOSIT \n2.WITHDRAW \n3.Check balance");
	int a=sc.nextInt();
	
	switch(a)
	{
	case 1:
	Deposit();
	break;
	
	case 2:
		Withdraw();
		break;
		
	case 3:
		System.out.println("Your current balance is "+balance);
		break;
		
		default:
			System.out.println("Invalid Choice..");
			Choice();
			break;
		
	}
	
	
	
	
}


public static void Trans()
{
	Choice();
	System.out.println("Do you want to continue yes/no");
	String n=sc.next();
	
	if(n.equalsIgnoreCase("yes"))
	{
		Trans();
	}
	else if(n.equalsIgnoreCase("no"))
	{
		System.out.println("Thank you for using our service..");
	}
	
}


	public static void PinVerify()
	{
		System.out.println("Enter the pin number");
		String p=sc.next(); //678
		
		
		for (int i = 1 ; i<=4; i++)
		{
			if(i<=3)
			{
				if(p.equals("123456"))
				{
					System.out.println("PIN IS VALID");
				
			break;
				
				
				
		         }
				
				else
				{
					System.out.println("please enter pin again");
					p=sc.next();		
					}
			}
				
				else 
					if(i==4)
				{
					System.out.println("Account is blocked");
				
					PinVerify();
					break;
					
										
						
				}
				
			}
			
		}
		
	
	
	
	/*System.out.println("Enter the pin number");
	String p=sc.next(); //678
	
	if(p.equals("123456"))
	{
		System.out.println("Pin is valid");
		Trans();
	}
	else
	{
		System.out.println("Pin is invalid");
		PinVerify();
	}
	
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PinVerify();
		Trans();
		//StaticMethod.PinVerify();
		
		
	}

}


