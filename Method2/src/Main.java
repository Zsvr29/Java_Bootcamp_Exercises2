
public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugun hava cok guzel";
		String yenimesaj=sehir();          //mesaj.substring(0,2); // g ye kadar degerlerı alır.
		
		System.out.println(yenimesaj);
		int sayi=Topla(5,7);
		System.out.println(sayi);
		int toplam=Topla2(1,2,3,4,5,6);// arka planda diziye cevırıryo
		System.out.println(toplam);
	}
	public static void Ekle() {
		
	}
	public static void Sil() {
		
	}
	public static void Güncelle() {
		
	}
	public static int Topla(int a,int b) {
		return a+b;
		
	}
	public static int Topla2(int...sayilar) {
		int toplam=0;
		
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
		
	}
	public static String sehir() {
		return "Ankara";
	}
}
