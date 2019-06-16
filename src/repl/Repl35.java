package repl;

import java.util.Scanner;

public class Repl35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
	    int coupons = input.nextInt();
	
	    int candies = coupons/10 ;
		int gumballs = (coupons%10) / 3 ;

		System.out.println("Number of Candies: " + candies +"\n" + "Number of Gumballs: "+ gumballs);
	}
		
		
}


//System.out.println("Enter Item1 and its price:" );
//String item1 = input.next();
//int price1 = input.nextInt();
//
//System.out.println("Enter Item2 and its price:");
//String item2 = input.next();
//int price2 = input.nextInt();
//

//Yerel arcade çıkış kuponlarınızdaki video oyunu makineleri oyuna ne kadar iyi oynadığınıza göre çıkar. 
//Bir şeker çubuğu için 10 kupon veya bir sakız için 3 kupon kullanabilirsiniz.
//Şeker çubuklarını sakızlara tercih edersin. İlk başta kazandığınız kupon sayısına atanmış bir değişkeni tanımlayan bir program yazın.
//Daha sonra program, kuponlarınızın hepsini şeker çubukları üzerinde, 
//kalan kuponları ise sakız toplarında geçirirseniz kaç tane şeker çubuğu ve şeker çubuğu alabileceğinizi göstermelidir.
//Örnek:
//İstemi görüntüle: "Kupon sayısını girin:"
//13
//İstemi görüntüle: "Şekerleme Sayısı: 1"
//Istemi görüntüle: "Gumballs sayısı: 1"
//
//Örnek:
//
//İstemi görüntüle: "Kupon sayısını girin:"
//23
//İstemi görüntüle: "Şekerleme Sayısı: 2"
//Istemi görüntüle: "Gumballs sayısı: 1"