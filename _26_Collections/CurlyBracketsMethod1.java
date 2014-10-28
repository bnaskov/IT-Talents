package _26_Collections;

import java.util.Stack;

public class CurlyBracketsMethod1 {

	public static void main(String[] args) {
		String correctBrackets = "{{}}{}{{{}}}";
		String uncorrectBrackets = "{{{}}{}";

		try {
			chechForCorrectCurlyBrackets(null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		chechForCorrectCurlyBrackets(correctBrackets);
		chechForCorrectCurlyBrackets(uncorrectBrackets);
	}

	static void chechForCorrectCurlyBrackets(String brackets) {
		if (brackets == null) {
			throw new NullPointerException("Please enter a valid string.");
		}

		Stack<Integer> stack = new Stack<Integer>();
		boolean correctCurlyBrackets = true;
		for (int i = 0; i < brackets.length(); i++) {
			char ch = brackets.charAt(i);
			if (ch == '{') {
				stack.push(i);
			} else if (ch == '}') {
				if (stack.isEmpty()) {
					correctCurlyBrackets = false;
					break;
				}

				stack.pop();
			}
		}

		if (!stack.isEmpty()) {
			correctCurlyBrackets = false;
		}

		System.out.println("Correct use of curly brackets? "
				+ correctCurlyBrackets);
	}
}
