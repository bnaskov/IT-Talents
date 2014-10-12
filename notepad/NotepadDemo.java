package notepad;

public class NotepadDemo {

	public static void main(String[] args) {
		SimpleNotepad simpleNotepad = new SimpleNotepad(4);
		Page page1 = new Page("Java is very old programming language!");
		Page page2 = new Page("C# rules!");
		page1.addText("Not true");
		// System.out.println(page1.getPageInfo());
		// simpleNotepad.addText(2, " Really?!");
		simpleNotepad.addText(1, "Java is very old programming language!");
		simpleNotepad.addText(2, "C# rules!");
		simpleNotepad.viewPages();
		simpleNotepad.replaceTextInPage(2, "Replaced page!");
		simpleNotepad.viewPages();
		
		SecureNotepad secNotepad = new SecureNotepad(3, "potato");
		secNotepad.addText(1, "Hello");
		secNotepad.replaceTextInPage(2, "What a wonderful night!");
		secNotepad.viewPages();
		
		ISecureNotepad secNot = new SecureNotepad(3, "123");
		secNot.getPassword();
	}

}
