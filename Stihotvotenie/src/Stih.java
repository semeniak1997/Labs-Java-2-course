import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Stih {
	static String text;
	String[] wordArray;

		public void Vvod()
		{
			Scanner sc = new Scanner(System.in);
			text = sc.nextLine();
		}
		public void Poisk()
		{
			
			String[] wordArray = text.split("[\\s,.:!?]+");
		    Pattern pattern = Pattern.compile("^[��������������������][�-�]+?$");
		    for (String word : wordArray) {
		        Matcher matcher = pattern.matcher(word);
		        if (matcher.find()) {
		        	if(word.length() == 6)
		            text = text.replace(word, "");
		            System.out.println(text);
		        }
		        }	
		}
			public static void main(String[] args) {
				Stih stih = new Stih();
				System.out.println("������� ������ - >");
				stih.Vvod();
				System.out.println();
				System.out.println("������ � ������� ������� ����� -> ");
				stih.Poisk();
				
			}}
