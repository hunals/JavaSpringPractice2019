package repl2;

import java.util.Scanner;

public class repl51 {

	public static void main(String[] args) {
		
		
		double amount = 0,  tip = 0, pay ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split:");
		String split = scan.next();
		
		System.out.println("Number of people:" );
		int people = scan.nextInt() ;
		String mark = "&";
		
		switch (people) {
		
        case 1 : mark = "&";
            break;            
        case 2 : mark = "&&";
            break;            
        case 3 : mark = "&&&";
            break;            
        case 4 : mark = "&&&&";
            break;            
        case 5 : mark = "&&&&&";
            break;            
        default: System.out.println("Please enter max 5 people");
            break;
		}
		
		System.out.println("Check amount:" );
			amount= scan.nextDouble() ;
			
		System.out.println("Service Quality:" );
			String quality = scan.next() ;
			
			
		if ( quality.equalsIgnoreCase("Poor") ) {
			tip = (amount*0.05) ;
		}else if ( quality.equalsIgnoreCase("Fair")) { 
			tip = (amount*0.10);
		}else if (quality.equalsIgnoreCase("Good")) {
			tip = (amount*0.15);
		}else if ( quality.equalsIgnoreCase("Great")) { 
			tip = (amount*0.20);
		}else if (quality.equalsIgnoreCase("Excellent"))
			tip = (amount*0.25);
		
		if (split.equalsIgnoreCase("Yes")) {
			System.out.println("Number of people entered: " + mark );
			System.out.println("Total to pay: " + (amount + tip));
			System.out.println("Total tip: " + tip);
			System.out.println("Total per person: " +(amount + tip )/people );
			System.out.println("Tip per person: " + tip/people);
		
		}else if(split.equalsIgnoreCase("Yes")) {
			System.out.println("Number of people entered: " + mark );
			System.out.println("Total to pay: " + (amount + tip));
			System.out.println("Total tip: " + tip);
			
		}
	}

}


//
//Write your code inside the method.
//Use the values given as method parameters.
//Assign final values.
//Then user should select service quality that will correspond to tip percent.
//Poor = 5%
//Fair = 10%
//Good = 15%
//Great = 20%
//Excellent = 25% 
//The program should display the following information based on the user input: 
//Split or No split
//Number of people entered: &&&&
//Service Quality: 
//Total to pay:
//Total tip:
//Total per person:
//Tip per person:
//https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
//
//Input: 
//Split:Yes
//Number of people:4
//Check amount:476.0
//Service Quality:Excellent
//
//Output:
// 
//Number of people entered: &&&&
//Total to pay: 595.0
//Total tip: 119.0
//Total per person: 148.75
//Tip per person: 29.75


//Kodunuzu yöntemin içine yazın.
//Yöntem parametreleri olarak verilen değerleri kullanın.
//Son değerleri atayın.
//Ardından kullanıcı, uç oranına karşılık gelecek hizmet kalitesini seçmelidir.
//Zayıf =% 5
//Adil =% 10
//İyi =% 15
//Harika =% 20
//Mükemmel =% 25
//Program kullanıcı girişi temelinde aşağıdaki bilgileri göstermelidir:
//Böl veya Böl
//Girilen kişi sayısı: &&&&
//Servis kalitesi:
//Ödenecek toplam:
//Toplam ipucu:
//Kişi başı toplam:
//Kişi başı ipucu:
//https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
//
//Giriş:
//Bölünmüş: Evet
//Kişi sayısı: 4
//Çek miktarı: 476.0
//Hizmet Kalitesi: Mükemmel
//
//Çıktı:
// 
//Girilen kişi sayısı: &&&&
//Toplam ödeme: 595.0
//Toplam ipucu: 119.0
//Kişi başı toplam: 148.75
//Kişi başı ipucu: 29.7