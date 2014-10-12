package notepad;

public class ElectronicSecuredNotepad extends SecureNotepad implements
		IЕlectronicDevice {
	private boolean started;

	public ElectronicSecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages, password);
	}

	@Override
	public void addText(int pageNumber, String newText) {
		if (this.isStarted() == true) {
			super.addText(pageNumber, newText);
		}
	}

	@Override
	public void replaceTextInPage(int pageNumber, String newText) {
		if (this.isStarted() == true) {
			super.replaceTextInPage(pageNumber, newText);
		}
	}

	@Override
	public void deleteText(Page selectedPage) {
		if (this.isStarted() == true) {
			super.deleteText(selectedPage);
		}
	}

	@Override
	public void viewPages() {
		if (this.isStarted() == true) {
			super.viewPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (this.isStarted() == true) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.isStarted() == true) {
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void start() {
		if (getPassword()) {
			this.started = true;
		}
	}

	@Override
	public void stop() {
		if (getPassword()) {
			this.started = false;
		}
	}

	@Override
	public boolean isStarted() {
		return this.started;
	}
}
