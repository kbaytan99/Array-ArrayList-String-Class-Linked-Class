import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayleri_Siralamak_Kopyalamak_Arrays_Sinifi_ve_Ek_Detaylar {

	public static int [] arrayi_doldur(int sayi){
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int [sayi];
		
		for(int i = 0; i < sayi; i++) {
			cikti[i] = scanner.nextInt();
		}
		return cikti;
	}
	
	public static void arrayi_bastir(int [] array) {
		for(int i = 0;i < array.length;i++) {
			System.out.println("ELEMENT: " + (i+1) + ": " + array[i]);
		}
	}
	public static void array_sort(int [] array) {
		//ARRAYS SINIFI
		
		Arrays.sort(array);
		arrayi_bastir(array);
		
	}

	public static void main(String[] args) {
	
		int[] a = arrayi_doldur(5);
		//arrayi_bastir(a);
		//array_sort(a); //SORT
		
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {1,2,3,4,5,6};
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Esitler");
		}
		else {
			System.out.println("Esit Degil");
		}
		//ESIT DEGILER CUNKU FARKLI YONLERI GOSTERIYORLAR
		//EGER == SE ESIT DEGIL, EGER EQUALS SE ESIT
	} 
}
