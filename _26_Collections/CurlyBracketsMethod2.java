package _26_Collections;

public class CurlyBracketsMethod2 {
	public static void main(String[] args) {
		String correctBrackets = "{{}}{}{{{}}}";
		String uncorrectBrackets = "{{{{{{}}{}";

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

		int counterLeftCurlyBrackets = 0;
		int counterRightCurlyBrackets = 0;
		int curlyBracketsDifference = 0;
		boolean correctCurlyBrackets = true;

		for (int i = 0; i < brackets.length(); i++) {
			char ch = brackets.charAt(i);
			if (ch == '{') {
				counterLeftCurlyBrackets++;
			} else if (ch == '}') {
				counterRightCurlyBrackets++;
			}

			curlyBracketsDifference = counterLeftCurlyBrackets
					- counterRightCurlyBrackets;
			if (curlyBracketsDifference < 0) {
				correctCurlyBrackets = false;
				break;
			}
		}

		if (curlyBracketsDifference != 0) {
			correctCurlyBrackets = false;
		}

		System.out.println("Correct use of curly brackets? "
				+ correctCurlyBrackets);
	}
}
