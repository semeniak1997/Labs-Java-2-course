
import java.util.Scanner;

public class al3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        int l = in.nextInt();
        String[]arr = new String[l];
        System.out.println ("������� ������:");
        for (int i=0;i<arr.length; i++)
            arr[i]=in.next();
        for (int i=0; i<arr.length;i++)
            System.out.print (arr[i]+" ");

    }
}