package _28_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class warAndPeace {

	public static void main(String[] args) throws FileNotFoundException {
		File warAndPeace = new File("src\\_28_Files\\war_peace.txt");
		System.out.println(countComas(warAndPeace));

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
