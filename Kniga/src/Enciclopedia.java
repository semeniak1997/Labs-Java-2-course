
public class Enciclopedia extends Kniga implements IIzdanie {
	public Enciclopedia(String Type, String Name, String Autor, char Tom)
	{
		this.Type = Type;
		this.Name = Name;
		this.Autor = Autor;
		this.Tom = Tom;
	}


	@Override
	public void Information() {
		System.out.println("���: " + Type);
		System.out.println("��������: " + Name);
		System.out.println("�����: " + Autor);
		System.out.println("���������� �����: " + Tom);
		
	}
	public void DopSvoistva(String Izdatelstvo, String Pages, String God, String Tirage, String Language)
	{
		System.out.println("������������: " + Izdatelstvo);
		System.out.println("���������� �������: " + Pages);
		System.out.println("��� �������: " + God);
		System.out.println("�����: " + Tirage);
		System.out.println("����: " + Language);
	}
	public static void main(String[] args) {
		
		Enciclopedia enc = new Enciclopedia("�����", "ASP.Net ��� ��������������", "�������� �.", '2');
		enc.Information();
		enc.DopSvoistva(Izdatelstvo, Pages, God, Tirage, Language);

	}
}
