package notepad;

public class SimpleNotepad implements INotePad {
	private Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			pages = new Page[numberOfPages];
			for (int i = 0; i < pages.length; i++) {
				pages[i] = new Page(String.valueOf(i + 1));
			}
		} else {
			System.out.println("Wrong input");
			System.exit(0);
		}
	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (validatePage(pageNumber)) {
			pages[pageNumber - 1].addText(newText);
		}
	}

	private boolean validatePage(int pageNumber) {
		return pageNumber > 0 && pageNumber <= pages.length;
	}

	@Override
	public void replaceTextInPage(int pageNumber, String newText) {
		if (validatePage(pageNumber)) {
			pages[pageNumber - 1].deleteText();
			pages[pageNumber - 1].addText(newText);
		}

	}

	@Override
	public void deleteText(Page selectedPage) {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].equals(selectedPage))
				selectedPage.deleteText();
		}
	}

	@Override
	public void viewPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].getPageInfo());
		}

	}

	@Override
	public void searchWord(String word) {
		boolean containsWord = false;
		for (int i = 0; i < this.pages.length; i++) {
			if (pages[i].searchWord(word)) {
				System.out.printf("You can find the word '%s' on page: %d.%n",
						word, i + 1);
				containsWord = true;
			}
		}

		if (!containsWord) {
			System.out.printf("The notepad doesn't contain the word '%s'.%n",
					word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < this.pages.length; i++) {
			if (pages[i].containsDigits()) {
				System.out.println(pages[i].getPageInfo());
			}
		}
	}

}
