import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Zd5 {
	private int [][] matr;
	private int temp;
	public Zd5(int N){
		this.matr = new int[N][N];
	}	   		  
	public void InPutMatrix()
	{
         for(int i = 0; i < matr.length; i++){
             for(int j = 0; j < matr.length; j++){
              matr[i][j] = (int)(Math.random()*100);
             }
         
         }}
	public void OutPutMatrix()
	{
		for(int i = 0; i < matr.length; i++){   
            for(int j = 0; j < matr[i].length; j++){
                System.out.print(matr[i][j] + "\t");
            }
        System.out.println();
	}
		}
	
	public void Sortirovka()
	{ Scanner br = new Scanner(System.in);
		System.out.print("Выбирайте строку: ");
       int k = br.nextInt();
       Arrays.sort(matr[k-1]);
        System.out.println("Итог:");      
            }       	

	public static void main(String[] args) {	
		Zd5 zd5 = new Zd5(5);	
		zd5.InPutMatrix();
		zd5.OutPutMatrix();		
		zd5.Sortirovka();
		zd5.OutPutMatrix();
		
	}
	
}
