
public class Zd1 {
static int i;
	public static void main(String[] args) {
		for (i = 1; i <= 20; i++)
		{
			System.out.print(" " + i);
		}
		System.out.println();
		for( i = 1; i <= 20; i++)
		{			
			if ( i % 2 > 0)
			{
				System.out.println("число нечетное " + i);
			}
			else{
			 System.out.println("число четное " + i);}
			}
		
	}

}
