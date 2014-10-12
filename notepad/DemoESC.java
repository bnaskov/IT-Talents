package notepad;

public class DemoESC {

	public static void main(String[] args) {
		// ElectronicSecuredNotepad electronicSecuredNotepad = new
		// ElectronicSecuredNotepad(
		// 4, "asd");
		// electronicSecuredNotepad.addText(1,
		// "Electronic Secured Notepad is not started");
		// electronicSecuredNotepad.start();
		// electronicSecuredNotepad.addText(2, "Java rocks!");
		// electronicSecuredNotepad.addText(3, "JavaScript is number 1!");
		// electronicSecuredNotepad.viewPages();
		//
		// electronicSecuredNotepad.searchWord("Java");
		// electronicSecuredNotepad.addText(1, "Number 8!");
		//
		// electronicSecuredNotepad.printAllPagesWithDigits();
		// electronicSecuredNotepad.searchWord("C#");
		// electronicSecuredNotepad.isStarted();

		try {
			ElectronicSecuredNotepad electronicSecuredNotepad = new ElectronicSecuredNotepad(
					4, "asd");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ElectronicSecuredNotepad electronicSecuredNotepad = new
		// ElectronicSecuredNotepad(
		// 4, "aS456");
		// electronicSecuredNotepad.start();
		// electronicSecuredNotepad.viewPages();
	}

}
