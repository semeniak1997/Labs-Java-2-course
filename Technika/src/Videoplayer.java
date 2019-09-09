
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
		System.out.println("Тип: "+ Type);
		System.out.println("Назначение: "+ Naznachenie);
		System.out.println("Производитель: "+ Manufacturer);
		System.out.println("Модель: "+ Model);
		System.out.println("Дата выхода на рынок: "+ Date);
	}
	
	public void	DopSvoistva(String Srok, String Podderzhka, String Color)
	{
		System.out.println("Cрок службы: " + Srok);
		System.out.println("Поддержка MP4: " + Podderzhka);
		System.out.println("Цвет: " + Color);
		
		
	}
public static void main(String[] args) {
		Videoplayer videoplayer = new Videoplayer("Видеоплеер", "Проигрывание видео", "Sony", "DVP-SR320", "2012");
		videoplayer.Information();
		videoplayer.DopSvoistva(Srok, Podderzhka, Color);

	}

}
