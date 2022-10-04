
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,25,7,9,0};
		int aranacak=6;
		boolean varMı=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMı=true;
				break;
				
			}
			
			}
		String mesaj="";
		if(varMı) {
			mesaj="Sayı mevcuttur:"+aranacak;
			System.out.println("Sayı mevcuttur:"+aranacak);
			mesajVer(mesaj);
		}
		else {
			mesajVer("Sayı mevcuttur:"+aranacak);
		}
		
		

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	

}



