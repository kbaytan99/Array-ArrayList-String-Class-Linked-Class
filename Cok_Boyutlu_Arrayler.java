import java.util.Scanner;

//ÇOK BOYUTLU ARRAY
		// 		INDEX
		// 	| 0 ,  1
		// 	|-------|
		// 0| 1 , 2 |
		// 1| 3 , 4 |
		// 	|-------|
		// ORNEK 1 I SEÇMEK IÇIN 0 VE 0 RI BULMALISIN
		// YADA 4 BULMAK ICIN 1 VE 1 SEÇMELISIN.
public class Cok_Boyutlu_Arrayler {
	public static void main(String[] args) {

		
		//int[] array = {1,2,3,4,5,6}; // NORMAL ARRAY
		
		//int[][] array2 = new int [2][2]; //ÇOK BOYUTLU
		
		int [][] array2 = {{10,20,},{50,60}};	
		System.out.println(array2[0][1]); // ARRAYIN BOYUTUNU CAGRIMAK
		System.out.println(array2[1][1]);
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0;j < 5; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("*-*-*-*--*-*-*-*-*-*-");
		
		/*array2[0][0] = 10;
		array2[0][1] = 20;
		array2[1][0] = 30;
		array2[1][1] = 40; */
		// 	| 0  	1
		// 	|---------|
		// 0| 10 , 20 |
		// 1| 30 , 40 |
		// 	|---------|
		
	}

}
