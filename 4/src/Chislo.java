
import java.util.*;
public class Chislo {
static int i;
	public static void main(String[] args) {
		do{
		System.out.print("������� ����� �� 1 �� 12, ����� ������ �����: ");
		Scanner s = new Scanner(System.in);
        i = s.nextInt();
       
      if(i == 1)
      {
    	  System.out.println("������");      	
      }
      if(i == 2)
      {
    	  System.out.println("�������");
      }
      if(i == 3)
      {
    	  System.out.println("����");
      }
      if(i == 4)
      {
    	  System.out.println("������");
      }
      if(i == 5)
      {
    	  System.out.println("���");
      }
      if(i == 6)
      {
    	  System.out.println("����");
      }
      if(i == 7)
      {
    	  System.out.println("����");
      }
      if(i == 8)
      {
    	  System.out.println("������");
      }
      if(i == 9)
      {
    	  System.out.println("��������");
      }
      if(i == 10)
      {
    	  System.out.println("�������");
      }
      if(i == 11)
      {
    	  System.out.println("������");
      }
      if(i == 12)
      {
    	  System.out.println("�������");
      }
      if(i<=0 || i >=13)
      {
    	  System.out.println("� ���� 12 �������, ��������� �������!");
      }
		} while(i <= 0 || i >=13);
	}
	}