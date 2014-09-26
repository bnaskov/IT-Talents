package _08_09_Exam;

public class _08_ {

	public static void main(String[] args) {
		String[] words = { "Hello", "World", "in", "a", "frame" };

		printFrame(words);
	}

	private static void printFrame(String[] words) {
		int maxLength = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
			}
		}
		printTopBottom(maxLength);
		for (int i = 0; i < words.length; i++) {
			System.out.print("* ");
			System.out.print(words[i]);
			for (int j = words[i].length(); j < maxLength; j++) {
				System.out.print(' ');
			}
			System.out.print(" *");
			System.out.println();
		}
		printTopBottom(maxLength);
	}

	private static void printTopBottom(int maxLength) {
		for (int i = 0; i < maxLength + 4; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

}
