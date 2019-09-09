
import java.util.ArrayList;
import java.util.Scanner;


public class Task_3 {
	
	private int n;
	private String[]mass;	
	
	public Task_3(int n,String[]mass)
	{
		this.n=n;
		this.mass=mass;
	}
	
	public void ReadFromUser(String [] mass)//заполнение одномерного массива с клавы
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
			
				
	

}