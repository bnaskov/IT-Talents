package _28_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WarAndPeace {
	private static final String FILE_DIR = "src\\_28_Files\\";
	private static final String FILE_NAME = "war_peace.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File warAndPeace = new File(FILE_DIR + FILE_NAME);
			System.out.println(countComas(warAndPeace));
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
	}

	private static int countComas(File file) throws FileNotFoundException {
		Scanner cs = new Scanner(new FileInputStream(file));
		String line = "";
		int counter = 0;
		while (cs.hasNextLine()) {
			line = cs.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == ',') {
					counter++;
				}
			}
		}

		cs.close();
		return counter;
	}
}
