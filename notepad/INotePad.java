package notepad;

public interface INotePad {
	void addText(int pageNumber, String newText);

	void replaceTextInPage(int pageNumber, String newText);

	void deleteText(Page selectedPage);

	void viewPages();

	void searchWord(String word);

	void printAllPagesWithDigits();
}
