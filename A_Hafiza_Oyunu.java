package Array;

import java.util.Scanner;

public class A_Hafiza_Oyunu {
	private static A_Hafiza_Kart[][] kartlar = new A_Hafiza_Kart[4][4];
	public static void main(String[] args) {
		

		
	kartlar[0][0] = new A_Hafiza_Kart('A'); //
	kartlar[0][1] = new A_Hafiza_Kart('B');	//
	kartlar[0][2] = new A_Hafiza_Kart('C');	//
	kartlar[0][3] = new A_Hafiza_Kart('D');	//
	
	kartlar[1][0] = new A_Hafiza_Kart('E');	//
	kartlar[1][1] = new A_Hafiza_Kart('A');	//
	kartlar[1][2] = new A_Hafiza_Kart('F'); //	
	kartlar[1][3] = new A_Hafiza_Kart('G');	//
	
	kartlar[2][0] = new A_Hafiza_Kart('G');	//
	kartlar[2][1] = new A_Hafiza_Kart('B');	//
	kartlar[2][2] = new A_Hafiza_Kart('E');	//
	kartlar[2][3] = new A_Hafiza_Kart('C'); //	
	
	kartlar[3][0] = new A_Hafiza_Kart('H');	//
	kartlar[3][1] = new A_Hafiza_Kart('H');	//
	kartlar[3][2] = new A_Hafiza_Kart('D'); //	
	kartlar[3][3] = new A_Hafiza_Kart('F');	//
		
		while (oyunBittimi() == false) {
			oyuntahtasi();
			tahminEt();
		}
	}
	public static void tahminEt() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci Tahmin(i ve j degerlerini bir bosluklu giriniz....)");
		int i1 = scanner.nextInt();
		int j1 = scanner.nextInt();
		
		kartlar[i1][j1].setTahmin(true);
		oyuntahtasi();
		
		System.out.println("Ikinci Tahmin(i ve j degerlerini bir bosluklu giriniz....)");
		int i2 = scanner.nextInt();
		int j2 = scanner.nextInt();
		
		if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
			kartlar[i1][j1].setTahmin(true);
			System.out.println("Dogru Tahmin");
		}
		else {
			kartlar[i1][j1].setTahmin(false);
			System.out.println("Yanlis Tahmin");
		}
		
	}
	public static boolean oyunBittimi() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(kartlar[i][j].isTahmin() == false) {
					return false;
				}
			}
		}
		return true;
	}
	public static void oyuntahtasi() {
		
		for(int i = 0; i < 4; i++) {
			System.out.println(" ___________________");
			for(int j = 0;j < 4; j++) {
				
				if(kartlar[i][j].isTahmin()) {
					System.out.print(" |" + kartlar[i][j].getDeger() + "|");
				}
				else {
					System.out.print(" | | ");
					
				}
			}
			System.out.println("");
		}
		System.out.println(" ___________________");
	}
}
