import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Glasnaya {
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
    Pattern pattern = Pattern.compile("^[���������].*[���������]$");
    for (String word : wordArray) {
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            System.out.println("���� �����: " + word);
        }
        }	
}
	public static void main(String[] args) {
		System.out.println("������� ������ - >");
		Glasnaya glasnaya = new Glasnaya();
		glasnaya.Vvod();
		glasnaya.Poisk();

	}

}
