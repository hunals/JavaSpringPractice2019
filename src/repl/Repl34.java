package repl;

import java.util.Scanner;

public class Repl34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle's year:" );
		int vehicleYear = scan.nextInt();
		
		if ((vehicleYear >= 1995) && (vehicleYear <= 1998) ) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if((vehicleYear >= 2001) && (vehicleYear <= 2002) ) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if((vehicleYear >= 2004) && (vehicleYear <= 2006) ) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if ((vehicleYear >= 2015) && (vehicleYear <= 2017) ) {
			System.out.println("Your vehicle needs to be recalled!");
		}else
		
		System.out.println("Your vehicle is fine, enjoy!");
		
		}

}

//SDET Motors Inc. 1995-1998, 2001-2002, 2004-2006 ve 2015-2017 model yıllarındaki tüm araçları geri çağırıyor.
//
//Bu ödevde geri çağırma için aracı bulan bir program yazacaksınız.
//-Bir tarayıcı nesnesi oluşturun
//-Create int değişken vehicleYear adında
//
//-Ekran istemi: "Aracın yılını girin:"
//giriş: 1996
//
// modelYear'ın değeri dört hatırlama aralığına girerse, ekran çıktısını alın:
//"Aracınızın geri çağrılması gerekiyor!"
//
//Aksi takdirde, mesajı görüntüle:
//"Aracınız iyi, tadını çıkarın!"