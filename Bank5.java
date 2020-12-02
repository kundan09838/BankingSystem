import java.util.Scanner;
interface Bank
{
	int x=500;
	public void Account();
	public void information();
	public void withdraw();
	public void deposit();
}
interface Bank1
{
	public void transction();
	//public void loan();
}
//import java.util.Scanner;
abstract class Process implements Bank
{
	//int x=500;
String add,name,name1,branch;
	
	
	public void Account()
	{
		System.out.println("....Cretria for opeing the Bank account");
		Scanner obj=new Scanner (System.in);
        System.out.println("Enter  the name of Bank");
		name=obj.nextLine();
		System.out.println("Enter the branch of the Bank");
		branch=obj.nextLine();
		System.out.println("...Minimum amount for opening the account:"+x);
		System.out.println("Enter the name of applicant");
		name1=obj.nextLine();
		System.out.println("Enter the address of the applicant");
		add=obj.nextLine();
	}
	public void information()
	{
		System.out.println("Account holder detail ");
		System.out.println("_____________________");
		System.out.println("Name of the Bank:"+name);
		System.out.println("Name of Branch :"+branch);
		System.out.println("Name of account holder:"+name1);
		System.out.println("address of the account holder:"+add);
		System.out.println("Balance in  the account :"+x);
		
		
	}
	
}
 class Process1 extends Process implements Bank,Bank1
{
	int y,z;
	int tr,am;
	int a;
	public void deposit()
	{
		Scanner obj2=new Scanner (System.in);
		System.out.println("Account holder name:"+name1);
		System.out.println("Enter the amount you wnt to deposit");
		y=obj2.nextInt();
		a=y+x;
		System.out.println("current Balance in the account::"+a);
		
	}
	
	public void withdraw()
	{
		
		Scanner obj3=new Scanner (System.in);
		System.out.println("Account holder name::"+name1);
		System.out.println("Enter the amount you want to withdraw");
		z=obj3.nextInt();
		a=a-z;
		System.out.println("current balance in the account::"+a);
		
		
	}
	public void transction()
	{
		Scanner obj4=new Scanner (System.in);		
		System.out.println("Account holder name:"+name1);
		System.out.println("Enter the bank account for the transction");
		tr=obj4.nextInt();
		System.out.println("Enter the amount for transction");
		am=obj4.nextInt();
		a=a-am;
		System.out.println("current balance in the account::"+a);
	}
	
	
}
class Bank5
{
	public static void main(String[]args)
	{		
	int ch;
	int ch1;
	Process1 ob=new Process1();
	do
	{
	System.out.println("press 1: for account opening detail");
    System.out.println("press 2 : for account information");
    System.out.println("press 3: for deposit");
	System.out.println("pree 4: for withdraw");
	System.out.println("press 5 for transction");
	System.out.println("enter your choice");
	Scanner obj1=new Scanner(System.in);
	ch=obj1.nextInt();
	switch(ch)
	{
		case 1:
		      ob.Account();
			  break;
	    case 2:
			ob.information();
			break;
		case 3:
			ob.deposit();
			break;
		case 4:
			ob.withdraw();
			break;
		case 5:
		    ob.transction();
			break;
		default:
	     System.out.println("sorry you have enter wrong choice");
	}
	System.out.println("do you want to continue (1/0)");
	ch1=obj1.nextInt();
	}
	while(ch==1);
	}
}


