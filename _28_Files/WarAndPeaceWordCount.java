package _28_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeaceWordCount {
	private static final String FILE_DIR = "src\\_28_Files\\";
	private static final String FILE_NAME = "war_peace.txt";
	private static final int NUMBER_OF_TOP_RESULTS = 10;

	public static void main(String[] args) {
		File warAndPeace = new File(FILE_DIR + FILE_NAME);

		Map<String, Integer> map;
		try {
			map = new HashMap<String, Integer>(wordsMap(warAndPeace));
			// System.out.println("Word : occurrences");
			// for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + " : " + entry.getValue());
			// }
			// System.out.println("----------------");

			System.out
					.printf("Top %d most frequently occurring words in \"War and Peace\":%n",
							NUMBER_OF_TOP_RESULTS);
			Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>(
					sortedByValues(map));
			int counter = 0;
			for (HashMap.Entry<String, Integer> entry : sortedMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
				counter++;
				if (counter == NUMBER_OF_TOP_RESULTS) {
					break;
				}
			}
			System.out.println("----------------");

			System.out
					.println("Number of occurrences of words \"war\" and \"peace\":");
			System.out.println("war: " + map.get("war"));
			System.out.println("peace: " + map.get("peace"));

			// Creates a file with all unique words and the number of their
			// occurrences in the text
			createFileWithAllOccurrencesOfWords(sortedMap);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static Map<String, Integer> wordsMap(File file)
			throws FileNotFoundException {
		Map<String, Integer> map = new HashMap();
		try (Scanner cs = new Scanner(new FileInputStream(file))) {
			String patternString = "[A-Za-z]+";
			Pattern pattern = Pattern.compile(patternString);

			Matcher matcher = pattern.matcher("");
			String word = "";
			String textLine = "";
			while (cs.hasNextLine()) {
				textLine = cs.nextLine();
				matcher = pattern.matcher(textLine);
				while (matcher.find()) {
					word = matcher.group().toLowerCase();
					if (map.containsKey(word)) {
						int numOfOccurrences = map.get(word) + 1;
						map.put(word, numOfOccurrences);
					} else {
						map.put(word, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			throw e;
		}

		return map;
	}

	private static <K extends Comparable, V extends Comparable> Map<K, V> sortedByValues(
			Map<K, V> map) {
		List<Map.Entry<K, V>> entries = new LinkedList<Map.Entry<K, V>>(
				map.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		Map<K, V> sortedMap = new LinkedHashMap<K, V>();

		for (Map.Entry<K, V> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	private static void createFileWithAllOccurrencesOfWords(
			Map<String, Integer> map) throws FileNotFoundException,
			UnsupportedEncodingException {

		try (PrintWriter writer = new PrintWriter(FILE_DIR
				+ "war_peace_word_count.txt", "UTF-8")) {

			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				writer.println(entry.getKey() + " : " + entry.getValue());
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (UnsupportedEncodingException e) {
			throw e;
		}
	}
}
