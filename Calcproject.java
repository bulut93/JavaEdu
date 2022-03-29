import java.util.Objects;
import java.util.Scanner;

public class Calcproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("First number: ");
		int operand1 = scanner.nextInt();

		System.out.print("Operator: ");
		String operator = scanner.next();

		System.out.print("Second number: ");
		int operand2 = scanner.nextInt();

		scanner.close();

		if (Objects.equals("+", operator)) {
			System.out.println("Your answer is " + (operand1 + operand2));
		} else if (Objects.equals("-", operator)) {
			System.out.println("Your answer is " + (operand1 - operand2));
		} else if (Objects.equals("/", operator)) {
			System.out.println("Your answer is " + (operand1 / operand2));
		} else if (Objects.equals("*", operator)) {
			System.out.println("Your answer is " + (operand1 * operand2));
		} else if (Objects.equals("^", operator)) {
			System.out.println("Your answer is " + Math.pow(operand1, operand2));
		} else {
			System.out.println("Wrong Operator. Please use one of the followings; " + "+ " + "- " + "/ " + "* " + "^ ");
		}

	}

}
