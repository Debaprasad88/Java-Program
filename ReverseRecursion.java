import java .util.Scanner;
class  ReverseRecursion
{
	public static void reverseMethod(int number) 
	{
		if(number<10){
		System.out.println("number");
		return;
	}
else {
	System.out.print(number%10);
	reverseMethod(number/10);
}
	}
	public static void main(String args[])
	{
		int num=0;
		System.out.println("input u r number and presss enter:");
		Scanner in = new Scanner(System.in);
		num= in.nextInt();
		System.out.print("Reverse of the input no. is:");
		reverseMethod(num);
		System.out.println();
	}
}
