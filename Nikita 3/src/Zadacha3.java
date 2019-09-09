import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.regex.*;
import java.io.InputStream;
import java.text.DateFormatSymbols;
import java.util.Map.Entry;
public class Zadacha3 {
	 public static int[] toIntArray(String[] sourceStrings) {
	        List<Integer> numbers = new ArrayList<Integer>();
	        for (int i = 0; i < sourceStrings.length; i++) {
	            if (isNumericWord(sourceStrings[i])) {
	                numbers.add(Integer.parseInt(sourceStrings[i]));
	            }
	        }
	        int[] result = toIntArray(numbers);
	        return result;
	    }
	public static int countDifferentSymbolsInWord(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }
	public static void findWordWithMinDifferentSymbols(String[] sourceWords) {
        final String message = "Число, в котором число различных символов минимально (число различных символов): ";
        if (sourceWords.length == 0) {
           System.out.println(message + "Нет слов");
            return;
        }
        String result = sourceWords[0];
        for (int i = 1; i < sourceWords.length; i++) {
            if (countDifferentSymbolsInWord(result) > countDifferentSymbolsInWord(sourceWords[i])) {
                result = sourceWords[i];
            }
        }
       System.out.println(message + result + "(" + countDifferentSymbolsInWord(result)
                + ")");
    }
 
    public static List<String> findWordsInLatin(String[] sourceWords) {
        Pattern latinPattern = Pattern.compile("[0-9]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            Matcher latinMatcher = latinPattern.matcher(word.toLowerCase());
            if (latinMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }

public static void main(String[] args) {
	String[] sourceWords = toStringArray(findWords(sourceStrings));
    findWordWithMinDifferentSymbols(sourceWords);
}
}