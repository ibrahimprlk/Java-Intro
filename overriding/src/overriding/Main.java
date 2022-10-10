package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManager=new BaseKrediManager[] {
				new TarimKrediManager(),new OgretmenKrediManager(),
				new OgrenciKrediManager()
		};
		for(BaseKrediManager kredi:krediManager) {
			System.out.println(kredi.hesapla(1000));
		}
	}

}
