import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bakiye = 1000;
		int islem;

		System.out.println("1: Bakiye G�r�nt�le");
		System.out.println("2: Para Yat�rma");
		System.out.println("3: Para �ekme");
		System.out.println("4: Sistemden ��k��");

		System.out.println("Yapmak istedi�iniz i�lemin numaras�n� tu�lay�n�z: ");
		islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");
			break;

		case 2:
			System.out.println("Yat�rmak istedi�iniz para miktar�n� giriniz: ");
			int miktar = scan.nextInt();

			bakiye = bakiye + miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");
			break;

		case 3:
			System.out.println("�ekmek istedi�iniz para miktar�n� giriniz: ");
			int miktar2 = scan.nextInt();

			bakiye = bakiye - miktar2;
			if (bakiye < 0)
				System.out.println("Yetersiz Bakiye!");
			else
				System.out.println("Bakiyeniz: " + bakiye + " TL'dir.");

			break;

		case 4:
			System.out.println("Sistemden ��k�� yapt�n�z.");
			break;

		default:
			System.out.println("Hatal� tu�lama yapt�n�z.");
			break;

		}
	}

}
