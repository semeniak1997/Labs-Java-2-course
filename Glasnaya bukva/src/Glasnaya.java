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
    Pattern pattern = Pattern.compile("^[àîıèóûå¸şÿ].*[àîıèóûå¸şÿ]$");
    for (String word : wordArray) {
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            System.out.println("Âàøè ñëîâà: " + word);
        }
        }	
}
	public static void main(String[] args) {
		System.out.println("Ââåäèòå ñòğîêó - >");
		Glasnaya glasnaya = new Glasnaya();
		glasnaya.Vvod();
		glasnaya.Poisk();

	}

}
