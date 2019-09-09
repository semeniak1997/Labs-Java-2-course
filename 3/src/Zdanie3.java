
import java.util.ArrayList;
import java.util.Scanner;


public class Zdanie3 {
	
	private int n;
	private String[]mass;	
	
	public Zdanie3(int n,String[]mass)
	{
		this.n=n;
		this.mass=mass;
	}
	
	public void ReadFromUser(String [] mass)//заполнение одномерного массива с клавиатуры
	{			
		Scanner in=new Scanner(System.in);
		
			for(int i=0;i<mass.length;i++)
	        {
				System.out.println(i+"= ");					            
	            
				mass[i]=in.nextLine();	            
	        }			
	}
			
						
			public void prost (String[]mass)
			{
				int counter=0;
				ArrayList<String> list = new ArrayList<String>();
				
				for(int j=0;j<mass.length;j++)
				{
					char[]array = mass[j].toCharArray();
					for(int i=1;i<mass[j].length();i++)
					{						
						if(array[i]>array[i-1])
						{
							counter++;
						}				
					}
					
					if(counter!=0)
					{
						list.add(mass[j]);
					}					
				}
				
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i));
				}
				//return list;
			}
			
				
			public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				System.out.print("¬ведите количество вводимых чисел ");
				int n = in.nextInt();
				String [] mass = new String[n];
				Zdanie3 b = new Zdanie3(n, mass);
				b.ReadFromUser(mass);
				b.prost(mass);

			}


}
