package sayıBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,3,5,7,9,0};
		Scanner oku=new Scanner(System.in);
		int aranacak;
		while(true) {
			System.out.println("Sayi Gir :");
			aranacak=oku.nextInt();
			
			boolean varMi=false;
			
			for(int sayi:sayilar) {
				if(sayi==aranacak) {
					varMi=true;
					break;
				}
			}
			if(varMi) {
				System.out.println("Sayi mevcuttur");
			}
			else {
				System.out.println("sayi mevcut degildir");
			}	
		}
		
	}

}
