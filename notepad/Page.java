package notepad;

public class Page {
	private final String title;
	private String text = "";

	Page(String title) {
		if (title == null) {
			System.out.println("Wrong title format! Plese reset the app!");
			this.title = "";
		} else
			this.title = title;
	}

	void addText(final String addedText) {
		if (addedText != null)
			this.text = this.text + "\n" + addedText;
		else
			System.out.println("Wrong text input! Must not be null");
	}

	void deleteText() {
		this.text = "";
	}

	String getPageInfo() {
		return title + text;
	}

	public boolean searchWord(String word) {
		boolean containsWord = this.text.contains(word);
		return containsWord;
	}

	public boolean containsDigits() {
		return this.text.matches("\\n*.*\\d.*");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Page) {
			return ((Page) obj).title.equals(this.title);
		} else
			return false;
	}

}
