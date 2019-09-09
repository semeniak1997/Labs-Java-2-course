import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Zadachaaa_3 {
static int min, col, number, i, j, answer;

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		min = Integer.MAX_VALUE;
		while(i < number)
		{
			number = br.nextInt();
			col = 0;
			for (i = 0; i < number; i++)
				for( j = 0; j <number; j++)
				{
					
					if (number.charAt(i) != number.charAt(j) && i!=j)
						col++;
				}
			if(col < min)
			{
				min = col;
				answer = number;
			}
		}

	}

}
