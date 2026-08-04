import java.util.Scanner;
public class EV{
	public static void main(String[] args){
		EV L1 = new EV();
		System.out.println("Enter Number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = a%2;
		if(b==0)
			System.out.println("The");
		else
			System.out.println("The Given Number Is Odd");
	}
}