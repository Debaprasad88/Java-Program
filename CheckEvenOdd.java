import java.util.Scanner;
class CheckEvenOdd
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter an Integer number:");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num%2 == 0)
			System.out.println("Entered number is Even");
		else
		    System.out.println("Entered number is Odd");
	}
}
