package notepad;

import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad implements ISecureNotepad {
	private String password;

	public SecureNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		if (validatePass(password) && password != null) {
			this.password = password;
		} else {
			throw new IllegalArgumentException("Invalid password!");
		}

		// if (password != null && password.length() >= 1) {
		// this.password = password;
		// } else {
		// System.out.println("The password must be at least 1 symbool!");
		// }
	}

	private boolean validatePass(String password) {
		boolean length = (password.length() >= 5 ? true : false);
		boolean lowerCaseLetter = (password.matches(".*[a-z]+.*") ? true
				: false);
		boolean upperCaseLetter = (password.matches(".*[A-Z]+.*") ? true
				: false);
		boolean digit = (password.matches(".*[A-Z]+.*") ? true : false);

		if (length && lowerCaseLetter && upperCaseLetter && digit) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (getPassword()) {
			super.addText(pageNumber, newText);
		}
	}

	@Override
	public void replaceTextInPage(int pageNumber, String newText) {
		if (getPassword()) {
			super.replaceTextInPage(pageNumber, newText);
		}
	}

	@Override
	public void deleteText(Page selectedPage) {
		if (getPassword()) {
			super.deleteText(selectedPage);
		}
	}

	@Override
	public void viewPages() {
		if (getPassword()) {
			super.viewPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (getPassword()) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (getPassword()) {
			super.printAllPagesWithDigits();
		}
	}

	public boolean getPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String pass = sc.nextLine();
		return this.password.equals(pass);
	}

}
