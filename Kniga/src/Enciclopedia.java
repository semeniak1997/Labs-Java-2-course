
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
		System.out.println("Тип: " + Type);
		System.out.println("Название: " + Name);
		System.out.println("Автор: " + Autor);
		System.out.println("Количество томов: " + Tom);
		
	}
	public void DopSvoistva(String Izdatelstvo, String Pages, String God, String Tirage, String Language)
	{
		System.out.println("Издательство: " + Izdatelstvo);
		System.out.println("Количество страниц: " + Pages);
		System.out.println("Год издания: " + God);
		System.out.println("Тираж: " + Tirage);
		System.out.println("Язык: " + Language);
	}
	public static void main(String[] args) {
		
		Enciclopedia enc = new Enciclopedia("Книга", "ASP.Net для профессионалов", "Андерсон Р.", '2');
		enc.Information();
		enc.DopSvoistva(Izdatelstvo, Pages, God, Tirage, Language);

	}
}
