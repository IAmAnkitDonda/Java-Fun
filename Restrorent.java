import java.util.*;

public class Restrorent
{
	public static void main(String args[])
	{
		Person ankit= new Person();
	}
}
class Person
{
	Person()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String sname=s.nextLine();
		int sum =menuList();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print(sname+ " your bill is Rs."+sum);
	}
	public static int menuList()
	{
		Scanner scan=new Scanner(System.in);
		int opt=0,sum=0,f=0;
		do{
			System.out.println("1. Vadapav\t\t=Rs.15");
			System.out.println("2. Dabeli\t\t=Rs.15");
			System.out.println("3. Pizza\t\t=Rs.70");
			System.out.println("4. Bhel\t\t\t=Rs.50");
			System.out.println("5. Barger\t\t=Rs.40");
			System.out.println("6. Sandwitch\t\t=Rs.60");
			if(f==0){
				System.out.println("0. Exit");
			}
			else{
				System.out.println("0. Payout");
			}
			f++;
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("Choose valid Option : ");
			opt=scan.nextInt();
			sum=choose(opt,sum);
		}while(opt!=0);
		return sum;
		
	}
	public static int choose(int opt,int sum)
	{
		Scanner scan=new Scanner(System.in);
		switch(opt){
			case 1:{
				System.out.print("Enter the quantity of Vadapav : ");
				int q=scan.nextInt();
				sum=sum+q*15;
				break;
			}
			case 2:{
				System.out.print("Enter the quantity of Dabeli : ");
				int q=scan.nextInt();
				sum=sum+q*15;
				break;
			}
			case 3:{
				System.out.print("Enter the quantity of Pizza: ");
				int q=scan.nextInt();
				sum=sum+q*70;
				break;
			}
			case 4:{
				System.out.print("Enter the quantity of Bhel : ");
				int q=scan.nextInt();
				sum=sum+q*50;
				break;
			}
			case 5:{
				System.out.print("Enter the quantity of Barger : ");
				int q=scan.nextInt();
				sum=sum+q*40;
				break;
			}
			case 6:{
				System.out.print("Enter the quantity of Sandwitch : ");
				int q=scan.nextInt();
				sum=sum+q*60;
				break;
			}
			default:{
				System.out.println("Please choose Valid option ");
			}
		}
		return sum;
	}
}