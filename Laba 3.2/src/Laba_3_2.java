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
	
	String start = str.substring(0, str.indexOf("."));   //������ �����������
    String end = str.substring(str.indexOf(".")+1); //��������� ����� ��� ������� �����������

    String[] word = start.replaceAll(",|:|\\(|\\)", "").split(" "); //��������� ������ ����������� �� �����
    ArrayList<String> yesWord = new ArrayList<String>();//��������� ��� ���� ������� ���� � ������
    ArrayList<String> noWord = new ArrayList<String>(); // ��������� ��� ���� ������� �� ����������� � ������

    for (String s : word){
        if (end.contains(s)){//���� ���� ����� �� ������� ����������� � ��������� ������
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
		System.out.println("������� ������, ��������� �� ���������� �����������: ");
		lab32.Vvod();
		System.out.println("���������������: ");
		lab32.Sorted();
		

	}

}
