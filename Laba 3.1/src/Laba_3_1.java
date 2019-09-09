import java.util.Scanner; 
import java.util.regex.Pattern;

public class Laba_3_1 {
	static String MyWords;
	static String text[];
	static char newChar;
	static char word[];
	static int k;
	
	public void Vvod()
	{
		Scanner sc = new Scanner(System.in);
		MyWords = sc.nextLine();
	}
	
	public void Zamena(int k, char newChar)
	{
		this.k = k;
		this.newChar = newChar;
		text = MyWords.split("[\\s,.:!?]+");
		char[] word;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= k) {
                word = text[i].toCharArray();
                word[k-1] = newChar;
                text[i] = String.copyValueOf(word);
            }
        }
        for (String s : text) {
            System.out.println(s);
        }
	}
	
	
	public static void main(String[] args) {
		Laba_3_1 lab3 = new Laba_3_1();
		System.out.println("Введите строку - > ");
		lab3.Vvod();
		System.out.println("Строка после замены - > ");
		lab3.Zamena(3,'*');
	}

	}
