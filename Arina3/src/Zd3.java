import java.util.*;
public class Zd3 {
static int k;
static int n;
static int m;
public Zd3(int n, int m)
{
	this.n = n;
	this.m = m;
if (k > n && k <=m )
{
	System.out.println("����������� ���������� (n,m]");
}
else 
{
System.out.println("�� ����������� ���������� (n,m]");
}
if (k >= n && k <m)
{
	System.out.println("����������� ���������� [n,m)");
}
else
{
	System.out.println("�� ����������� ���������� [n,m)");
}
if (k > n && k <m)
{
	System.out.println("����������� ���������� (n,m)");
}
else
{
	System.out.println("�� ����������� ���������� (n,m)");
}
if (k >= n && k <=m)
{
	System.out.println("����������� ���������� [n,m]");
}
else
{
	System.out.println("�� ����������� ���������� [n,m]");
}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������� ����� k, ����� ��� �������������� � ���������: ");		
		 k = s.nextInt();
		Zd3 zd3 = new Zd3(5, 10);
	}
}
