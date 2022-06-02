import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bakiye = 1000;
		int islem;

		System.out.println("1: Bakiye Görüntüle");
		System.out.println("2: Para Yatýrma");
		System.out.println("3: Para Çekme");
		System.out.println("4: Sistemden Çýkýþ");

		System.out.println("Yapmak istediðiniz iþlemin numarasýný tuþlayýnýz: ");
		islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");
			break;

		case 2:
			System.out.println("Yatýrmak istediðiniz para miktarýný giriniz: ");
			int miktar = scan.nextInt();

			bakiye = bakiye + miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");
			break;

		case 3:
			System.out.println("Çekmek istediðiniz para miktarýný giriniz: ");
			int miktar2 = scan.nextInt();

			bakiye = bakiye - miktar2;
			if (bakiye < 0)
				System.out.println("Yetersiz Bakiye!");
			else
				System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");

			break;

		case 4:
			System.out.println("Sistemden çýkýþ yaptýnýz.");
			break;

		default:
			System.out.println("Hatalý tuþlama yaptýnýz.");
			break;

		}
	}

}
