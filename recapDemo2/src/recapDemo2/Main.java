package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList= {1.2,6.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		for(double sayi:myList) {
			if(max<sayi){
				max=sayi;
			}
			total=total+sayi;
			System.out.println(sayi);
		}
		System.out.println("Toplam :"+total);
		System.out.println("En buyk sayi  :"+max);
	}

}
