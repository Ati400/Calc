import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner scrn = new Scanner(System.in);
		System.out.print("enter the first number:");
		int x = scrn.nextInt();
		System.out.print("enter the second number:");
		int y = scrn.nextInt();
		
		System.out.print("choose operation +,-,*,/:");
		char operation = scrn.next().charAt(0);
		  if (operation == '+') {
            System.out.println("Result: " + (x + y));
        } else if (operation == '-') {
            System.out.println("Result: " + (x - y));
        } else if (operation == '*') {
            System.out.println("Result: " + (x * y));
        } else if (operation == '/') {
            if (y != 0) {
                System.out.print("Result:" +String.format("%.2f",(double) x / y));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        scrn.close();
	}
}