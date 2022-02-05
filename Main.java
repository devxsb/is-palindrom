import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("kelime girin");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < string.length() / 2; i++) {
			stack.add(string.charAt(i));
		}

		if (isPalindrom(string, stack)) {
			System.out.println("palindromdur");
		} else {
			System.out.println("palindrom degil");
		}
	}

	public static boolean isPalindrom(String string, Stack<Character> stack) {

		if (string.length() % 2 != 0) {
			for (int i = (string.length() / 2) + 1; i < string.length(); i++) {
				if (stack.pop() != string.charAt(i)) {
					return false;
				}
			}
			return true;

		} else {
			for (int i = string.length() / 2; i < string.length(); i++) {
				if (stack.pop() != string.charAt(i)) {
					return false;
				}
			}
			return true;
		}
	}
}
//safa