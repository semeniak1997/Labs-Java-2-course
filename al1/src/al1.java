
import java.util.Scanner;

public class al1 {
    public static void main(String[] args) {
        int password = 12345;
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите пароль: ");
        int input = in.nextInt();
        while (password!=input){
            System.out.println ("Пароль неверный. Попробуйте еще раз.");
            input = in.nextInt();
        }
        System.out.println("Пароль верный.");
    }
}