package _28_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsInSeparateFiles {
	private static final String FILE_DIR = "src\\_28_Files\\WordsInSeparateFiles\\";
	private static final String BASE_FILE_NAME = "baseFile.txt";

	public static void main(String[] args) {
		try {
			File baseFile = new File(FILE_DIR + BASE_FILE_NAME);
			Map<Integer, ArrayList<String>> wordsMap = new TreeMap(
					createMapOfWords(baseFile));
			createSeparateFilesWithWords(wordsMap);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Map<Integer, ArrayList<String>> createMapOfWords(File file)
			throws FileNotFoundException {

		Map<Integer, ArrayList<String>> map = new TreeMap();

		try (Scanner cs = new Scanner(new FileInputStream(file))) {
			String patternString = "[A-Za-z]+";
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher("");
			String word = "";
			String textLine = "";
			int wordLenght = 0;

			while (cs.hasNextLine()) {
				textLine = cs.nextLine();
				matcher = pattern.matcher(textLine);
				while (matcher.find()) {
					word = matcher.group();
					wordLenght = word.length();
					if (!map.containsKey(wordLenght)) {
						map.put(wordLenght, new ArrayList<String>());
					}

					map.get(wordLenght).add(word);
				}
			}
		} catch (FileNotFoundException e) {
			throw e;
		}

		return map;
	}

	private static void createSeparateFilesWithWords(
			Map<Integer, ArrayList<String>> map) throws FileNotFoundException {

		ArrayList<String> wordsWithEqualLenghtArrayList = null;
		for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			String fileName = "";
			if (entry.getKey() == 1) {
				fileName = String.format("%d_letter.txt", entry.getKey());
			}
			fileName = String.format("%d_letters.txt", entry.getKey());

			try (PrintWriter writer = new PrintWriter(FILE_DIR + fileName)) {
				wordsWithEqualLenghtArrayList = new ArrayList<String>(
						entry.getValue());
				for (int i = 0; i < wordsWithEqualLenghtArrayList.size(); i++) {
					writer.print(wordsWithEqualLenghtArrayList.get(i));
					if (i != wordsWithEqualLenghtArrayList.size() - 1) {
						writer.print(", ");
					}
				}
				writer.print(". Total words = " + entry.getValue().size());
			} catch (FileNotFoundException e) {
				throw e;
			}
		}
	}
}
