import java.util.Scanner; 
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Laba_3_2 {
static String str;
static String start;
static String end;
static String word;


public void Vvod()
{
	Scanner sc = new Scanner(System.in);
	 str = sc.nextLine();
}

public void Sorted()
{
	
	String start = str.substring(0, str.indexOf("."));   //первое предложение
    String end = str.substring(str.indexOf(".")+1); //остальная часть без первого предложения

    String[] word = start.replaceAll(",|:|\\(|\\)", "").split(" "); //разбиваем первое предложение на слова
    ArrayList<String> yesWord = new ArrayList<String>();//Хранилище для слов которые есть в тексте
    ArrayList<String> noWord = new ArrayList<String>(); // Хранилище для слов которые не встречаются в тексте

    for (String s : word){
        if (end.contains(s)){//если есть слово из первого предложения в остальном тексте
            yesWord.add(s);      
        }
        else {
            noWord.add(s);
            System.out.println(s);
        }
        
}
   
}
	public static void main(String[] args) {
		Laba_3_2 lab32 = new Laba_3_2();
		System.out.println("Введите строку, состоящую из нескольких предложений: ");
		lab32.Vvod();
		System.out.println("Отсортированная: ");
		lab32.Sorted();
		

	}

}
