
public class Videoplayer extends Player implements ITechnik{

	public Videoplayer(String Type, String Naznachenie, String Manufacturer, String Model, String Date)
	{
		this.Type = Type;
		this.Naznachenie = Naznachenie;
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.Date = Date;
	}
	
	
	@Override
	public void Information() {
		System.out.println("���: "+ Type);
		System.out.println("����������: "+ Naznachenie);
		System.out.println("�������������: "+ Manufacturer);
		System.out.println("������: "+ Model);
		System.out.println("���� ������ �� �����: "+ Date);
	}
	
	public void	DopSvoistva(String Srok, String Podderzhka, String Color)
	{
		System.out.println("C��� ������: " + Srok);
		System.out.println("��������� MP4: " + Podderzhka);
		System.out.println("����: " + Color);
		
		
	}
public static void main(String[] args) {
		Videoplayer videoplayer = new Videoplayer("����������", "������������ �����", "Sony", "DVP-SR320", "2012");
		videoplayer.Information();
		videoplayer.DopSvoistva(Srok, Podderzhka, Color);

	}

}
