package repl;

import java.util.Scanner;

public class Repl32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int quarters, dimes, nickels, itemPrice;
		int result;
		
		System.out.println("Enter price in cents:");
		itemPrice = scan.nextInt();
		boolean quarter = false, dime = false;
		quarters = (100 - itemPrice) /25;
		dimes = ((100 - itemPrice) %25 )/10;
		nickels = (((100 - itemPrice) %25 )% 10)/5;
		
		if ((itemPrice<25 ) || (itemPrice>100) || (itemPrice%5!=0)) {
			System.out.println("Invalid price!");
		}else if (quarter) {
				result = quarters;
		}else if (dime) {
				result = dimes;
		}else {
				result = nickels;
			
		System.out.println("Your chance is " + quarters + " quarters, "+ dimes + " dimes, and " + nickels + " nickels");
		}
	}
	
	}

//result = "Invalid price!";
//System.out.println(result);
//result = 
//Otomatik satış makinesinden dağıtılacak değişikliği belirleyen bir program yazın. Makinedeki bir ürün, 5 kuruşluk artışlarla 
//(25, 30, 35,., 90, 95 veya 100) 25 kuruş ve 1 dolara mal olabilir ve makine, ödemesi için yalnızca bir dolarlık banknot kabul eder. eşya.
//- int değişkeni itemPrice
//- int değişkenler çeyrek, dimes, nikel
//- Tarayıcı nesnesi
//
//Program, satın almak istediğiniz ürünün fiyatı olan itemPrice'ı kabul eder.
//Olumlu davranış:
//Lütfen resimdeki örneği takip edin. noktalar boş alan demektir.
//-Öğe fiyatı 95'e girildiğinden beri değişiklik 1 nikeldir.
//Olumsuz davranış:
//İtemPrice 25'ten az veya 100 kuruştan fazlaysa, hata mesajını görüntüleyin:
//Geçersiz fiyat!
//İtemPrice 5 ile bölünemezse, hata mesajını da göster:
//Geçersiz fiyat!
//5 ile bölünebilir olduğunu bulmak için (itemPrice% 5 == 0) ifadesini kullanın.
//
//Başka hiçbir şey göstermeyin.