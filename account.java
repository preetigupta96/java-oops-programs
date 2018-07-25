import java.util.*;
class Bank
{
   int id;
  String name,bName,bAddress;
  double tot;
  void accept()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("\n enter details of Account");
           System.out.println("\n Enter Account Id:");
	   id=sc.nextInt();
	   System.out.println("\n Enter Account Name:");
	   name=sc.next();
	   System.out.println("\n Enter Account Branch name:");
	   bName=sc.next();
 	   System.out.println("\n Enter Account Branch Address:");
	   bAddress=sc.next();
	   System.out.println("\n Enter Account Total Balance :");
	   tot=sc.nextDouble();
	 
	}
   void display()
	{
		System.out.println("\n Account Id:"+id);
		System.out.println("\n Account Name:"+name);
		System.out.println("\n Account Branch name:"+bName);
		System.out.println("\n Account Branch Address:"+bAddress);
		System.out.println("\n Account total balance is:"+tot);
	
	}
}
class Driver 
{
 public static void main(String sa[])
{
 Bank b=new Bank();
 b.accept();
 b.display();
}
}