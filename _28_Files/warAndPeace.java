package _28_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WarAndPeace {
	private static final String FILE_DIR = "src\\_28_Files\\";
	private static final String FILE_NAME = "war_peace.txt";

	public static void main(String[] args) {
		File warAndPeace = new File(FILE_DIR + FILE_NAME);
		try {
			System.out.println("Number of comas in \"War and Peace\": "
					+ countComas(warAndPeace));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static int countComas(File file) throws FileNotFoundException {
		int counter = 0;
		try (Scanner cs = new Scanner(new FileInputStream(file))) {
			String line = "";
			while (cs.hasNextLine()) {
				line = cs.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ',') {
						counter++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			throw e;
		}

		return counter;
	}
}
