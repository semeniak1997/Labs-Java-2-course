import java.util.Scanner;

import Store.Shop.Tovar;

import java.util.*;
public class Store {

	 String otdel = "������ -> ";
	 String tovar= "������ -> ";
	 String usluga= "������ -> ";
	 static String s;
	 static String t;
	 
	class Information
	{		
		String[] otd = {"������� -> ", "���� -> ", "�������� -> ", "������� ����� -> "};
		
	    String[] tovVyp = new String[] {"����", "�����", "�����", "�����"};
		String[] tovMias = new String[] {"�������", "��������", "������", "��������"};
		String[] tovAlc = new String[] {"�����", "������", "�����", "����", "�������", "����"};
		String[] tovHim = new String[] {"�������", "������", "����������", "����"};
		
		Shop.Tovar[] tovars = new Shop.Tovar[tovVyp.length+tovMias.length+tovAlc.length+tovHim.length];
		//for(int i = 0; i < tovars.length; i++)
		
		//Shop shop = new Shop(otd, );
					
		public Shop.Tovar[] Peredacha(String[] tovs, String otdel) {
			Shop.Tovar[] tovars = new Shop.Tovar[tovs.length];
			for(int i = 0; i < tovs.length; i++)
				tovars[i] = new Shop.Tovar(tovs[i], otdel);			
			return tovars;
		
		}
		
		public void Svedenia(){
			
		for(int j = 0; j < otd.length; j++)
		{
			s = otdel + otd[j];
			break;		
		}
		
	}
		}
	public static void main(String[] args) {
		

	}
	
	public class Shop{
		
		private String[] otdel;
		private Tovar[] tovar;
		private String[] usluga;
		
		public Shop(String[] otdel, Tovar[] tovar, String[] usluga){
			this.otdel = otdel;
			this.tovar = tovar;
			this.usluga = usluga;
		}
		
		public String[] getOdel(){
			return this.otdel;
		}
		
		public Tovar[] getTovar(){
			return this.tovar;
		}
		
		public String[] getUsluga(){
			return this.usluga;
		}
			 
		public class Tovar{
			private String tovarName;
			private String tovarOtdel;
			
			public Tovar(String tovarName, String tovarOtdel){
				this.tovarName = tovarName;
				this.tovarOtdel = tovarOtdel;
			}
			
			public String getTovarName(){
				return this.tovarName;
			}
			
			public String getTovarOtdel(){
				return this.tovarOtdel;
			}		
		
		}
		
	}


}