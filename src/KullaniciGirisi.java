import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String kullaniciAdi, sifre, yeniSifre, hatirlatma;
		
		String id,pass;
		
		id = "patika";
		pass = "java123";
		
	    Scanner input = new Scanner(System.in);

		  
	    System.out.println("\n\nHoşgeldiniz! Kullanıcı bilgilerini giriniz. \n\n");
		
		System.out.print("Kullanıcı adı : ");
		kullaniciAdi = input.nextLine();
		
		System.out.print("Şifre : ");
		sifre = input.nextLine();
		
		if(kullaniciAdi.equals(id) && sifre.equals(pass)) System.out.println("Giriş başarılı, hoşgeldiniz!");
		else System.out.println("Giriş bilgileri hatalı, şifre yenilemek ister misiniz? E/H");
		
		hatirlatma = input.nextLine();
				
		if (hatirlatma.equals("E")) {
			
			System.out.print("Yeni şifrenizi giriniz : ");
			yeniSifre=input.nextLine();
			
			while(yeniSifre.equals(pass)) {
				System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
				yeniSifre = input.nextLine();				
			}
			if (!sifre.equals(yeniSifre)) {
				
				pass=yeniSifre;
				System.out.println("Şifre oluşturuldu");
			}
		}				
	}
}



