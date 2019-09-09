
import java.lang.reflect.Array;
import java.util.Scanner;
public class Zadanie5 {
	static int pi;
    static int pj;
    private int mass[][];
    static int n;
    public Zadanie5(int n)
    {
    	this.n= n;
    	this.mass = new int [n][n];
    }
    public void InPutMatrix()
    {
    	 for(int i = 0; i < mass.length; i++){
             for(int j = 0; j < mass.length; j++){
              mass[i][j] = (int)(Math.random()*(2+ n));
             }}
    }
    public void OutPutMatrix()
    {
    	for(int i = 0; i < mass.length; i++){   
            for(int j = 0; j < mass[i].length; j++){
                System.out.print(mass[i][j] + "\t");
            }
        System.out.println();
	}
    }
    public void Sdvig()
    
    {
    	pi=0;
	pj=0;	
    	
    	  Scanner in = new Scanner(System.in);
    	int min = mass[0][0];
        
        for (int i = 0;i < mass.length;i++)
        {
       for (int j = 0;j < mass.length;j++)
       {
           if (mass[i][j] < min)
           {
               min = mass[i][j];
            pi = i;
            pj = j;
           }
       }
   }
    
   System.out.println("min: " + min + ", " + pi+1 + "," + pj+1);
   int row, col, tmp;
   System.out.print("Введите строку заданного элемента: ");
   row = in.nextInt();
   System.out.print("Введите столбец заданного элемента: ");
   col = in.nextInt();
   
   for (int i = 0; i < mass.length; i++) {
       tmp = mass[pi][i];
       mass[pi][i] = mass[row][i];
       mass[row][i] = tmp;
   }
   
   for (int i = 0; i < mass.length; i++)
   {
       tmp = mass[i][pj];
       mass[i][pj] = mass[i][col];
       mass[i][col] = tmp;
   }  	
    }
	public static void main(String[] args)
	{
	
		Zadanie5 zadacha5 = new Zadanie5(4);
		zadacha5.InPutMatrix();
		zadacha5.OutPutMatrix();
        zadacha5.Sdvig();
        zadacha5.OutPutMatrix();  
}
}
