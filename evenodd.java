import java.util.Scanner;
public class EO{
	public static void main(String[] args){
		EO L1 = new EO();
		System.out.println("Enter Number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = a%2;
		if(b==0)
			System.out.println("The Given Number Is Even");
		else
			System.out.println("The Given Number Is Odd");
	}
}
