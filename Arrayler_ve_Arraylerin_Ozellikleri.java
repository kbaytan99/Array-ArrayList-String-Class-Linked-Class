import java.util.Scanner;

public class Arrayler_ve_Arraylerin_Ozellikleri {

	public static void main(String[] args) {
		int[] a = new int[6]; //ARRAYDE 10 TANE BILGI DEPOLANACAK YER AÇILDI
		double[] b = new double[10];
		float[] c = new float[10];
		byte[] d = new byte [10];
		String[] e = new String[1];
		
		//EGER BI SAYI VERDIGIN ARRAYDAN BUYUKSE HATA OLUSUR 
		
		//int[] aa = {1,2,3,4,5,6,7,8,9};
		//System.out.println(aa[0]);
		//System.out.println(aa[5]);
		//ARRAYLER GENISLETEMIYOR
			// INDEX 0 DAN BASLIYOR
			// ORNEK 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		
		for(int i = 0;i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			a[i] = scanner.nextInt();
		}
		
		for(int i = 0;i < 5; i++) {
			System.out.println(a[i]);
		}

	}

}
