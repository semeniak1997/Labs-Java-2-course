
import java.util.Scanner;

public class al2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("¬ведите элементы массива:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < arr.length-1; i++){
            if (arr[i] == (arr[i-1]+arr[i+1])/2){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
