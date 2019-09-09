
import java.util.*;
public class Chislo {
static int i;
	public static void main(String[] args) {
		do{
		System.out.print("Введите число от 1 до 12, чтобы узнать месяц: ");
		Scanner s = new Scanner(System.in);
        i = s.nextInt();
       
      if(i == 1)
      {
    	  System.out.println("Январь");      	
      }
      if(i == 2)
      {
    	  System.out.println("Февраль");
      }
      if(i == 3)
      {
    	  System.out.println("Март");
      }
      if(i == 4)
      {
    	  System.out.println("Апрель");
      }
      if(i == 5)
      {
    	  System.out.println("Май");
      }
      if(i == 6)
      {
    	  System.out.println("Июнь");
      }
      if(i == 7)
      {
    	  System.out.println("Июль");
      }
      if(i == 8)
      {
    	  System.out.println("Август");
      }
      if(i == 9)
      {
    	  System.out.println("Сентябрь");
      }
      if(i == 10)
      {
    	  System.out.println("Октябрь");
      }
      if(i == 11)
      {
    	  System.out.println("Ноябрь");
      }
      if(i == 12)
      {
    	  System.out.println("Декабрь");
      }
      if(i<=0 || i >=13)
      {
    	  System.out.println("В году 12 месяцев, повторите попытку!");
      }
		} while(i <= 0 || i >=13);
	}
	}