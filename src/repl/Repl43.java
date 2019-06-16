package repl;

import java.util.Scanner;

public class Repl43 {

	public static void main(String[] args) {

		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		
//		String s1 = "single family home";
//		String s2 = "Single Family Home";
		
		System.out.println("Enter your property type:" );
			houseType = scan.nextLine();

		if ( houseType.equalsIgnoreCase("condo") ) {
			propertyPrice += 50000 ;
		}else if ( houseType.equalsIgnoreCase("Townhouse" )) { 
			propertyPrice += 75000;
		}else if (houseType.equalsIgnoreCase("Single Family Home"))
			propertyPrice += 95000;
	
		System.out.println("How many bedrooms do you have?" );
			numberOfBedrooms = scan.nextInt();
			propertyPrice += numberOfBedrooms * 30000;
		
		System.out.println("Do you have a backyard?" );
			boolean backyards = scan.nextBoolean();
		
		if (backyards == false) {
			propertyPrice += 0 ;
		}else if (houseType.equalsIgnoreCase("condo")) {
				System.out.println("Backyard is not available for condo!");
				propertyPrice += 0 ;
		}else 
				propertyPrice += 5000 ;
		
		 System.out.println("Do you have garage?");
         	garage = scan.nextBoolean();
         if (garage == true) {
             System.out.println("How many spots?");
             garageSpots = scan.nextInt();
         if (garageSpots > 10) {
              System.out.println("Pardon, it's not a public parking!");
              propertyPrice += 0 ;  
         }else if (garageSpots <= 10) {
                 propertyPrice += garageSpots * 20000;
         }
 }
		  System.out.println("How close is metro station?" );
		  metroAccessibility = scan.nextFloat();
			
		  if (metroAccessibility <= 1 ) {
			  propertyPrice += 10000 ;
			}else if((metroAccessibility > 1) && (metroAccessibility <= 3) ) {
				propertyPrice += 5000 ;
			}else 
				propertyPrice += 0 ;
			
		  
		  System.out.println( "How close is highway?" );
		  	highwayAccessibility = scan.nextFloat();
			
		  if (highwayAccessibility <= 1 ) {
			  propertyPrice += 15000 ;
			}else if((highwayAccessibility > 1) && (highwayAccessibility <= 5) ) {
				propertyPrice += 8000 ;
			}else if((highwayAccessibility > 5) && (highwayAccessibility <= 20) ) {
				propertyPrice += 4000 ;
			}else
				propertyPrice  += 0 ;
			
		  System.out.println( "What's the rating of nearest school?" );
		  	schoolScore = scan.nextFloat();
			
		  if (( schoolScore <= 10 ) && ( schoolScore >= 8 )){
			  propertyPrice += 45000 ;
			}else if((schoolScore < 8 ) && (schoolScore >= 4)  ) {
				propertyPrice += 20000 ;
			}else
				propertyPrice += 5000 ;
			
		  	System.out.println( "Does any of your family members smoking?");
		  	smoking = scan.nextBoolean();
		  	
		  	if (smoking == false) {
				propertyPrice += 0 ;
			}else 
					propertyPrice -= 5000 ;

		  	System.out.println("Market report has been generated.");
		  	System.out.println("Your estimate market price is: " + propertyPrice + "$");
		
	} 
}
//boolean type1 = scan.equalsIgnoreCase("Condo");
//boolean type2 = scan.equalsIgnoreCase("Town House");
//boolean type3 = scan.equalsIgnoreCase("Single Family Home");

//boolean condo = scan.equals("condo");
//boolean townHouse = scan.equals("townHouse");
//boolean singleFamilyHome = scan.equals("singleFamilyHome");
//String condo = houseType ;
//String townHouse = houseType;
//String singleFamilyHome = houseType ;
//int type1 = 50000 ;
//int type2 = 75000 ; 
//int type3 = 95000 ; 
//System.out.println("Do you have garage?" );
//garage = scan.nextBoolean();
//
//if (garage == false) 
//	propertyPrice = propertyPrice ;
//else if (garage == true )
//
//		System.out.println("Have many spots?" );
//	 	garageSpots = scan.nextInt();
//if ((garageSpots >0) && (garageSpots <= 10) ) 
//		propertyPrice = propertyPrice + garageSpots *20000;
//else if (garageSpots > 10)
//		System.out.println("Pardon,  it's not a public parking!");
//	    propertyPrice = propertyPrice + ( 10 *20000);
//
	    
//Mülkünüzün fiyatını tahmin edecek bir program yazın.
//Bu program 3 ev tipinde çalışmalıdır: Daire, Şehir Evi ve Tek Ailelik Ev. 
//Kiralık daire = 50000, Şehir evi = 75000, Müstakil aile evi = 95000. 
//Yatak odası sayısına göre, her yatak odası için mülkünüzün fiyatı 30000 ekleyin.
//O zaman mülkün arka bahçesinde olup olmadığını sorman gerekiyor. Doğru ise, emlak fiyatına 5000 ekleyin.
//Backyard, Condo için mevcut olmamalıdır, bu nedenle, birisinin ev için arka bahçeyi seçmeye çalışması durumunda 
//"Backyard konut için uygun değil!", (Mülk fiyatını artırmayın!) Mesajı görüntülenir.
//Sonra kullanıcıdan garaj varlığını isteyin. Mülkiyet garaj varsa, her yer için mülk fiyatına 20000 ekleyin.
//Garaj noktalarının miktarı 10 lekeyi aşarsa (10'dan sonra rendeleyin), şu mesajı görüntüleyin: 
//		"Pardon, halka açık park yeri değil!" ve emlak fiyatını artırmayın.
//		Ardından, metro erişilebilirliği için kullanıcıdan bilgi isteyin.
//		Metro 1 milden (dahil) daha yakınsa, 10000 mülk fiyatına ekleyin. 
//		Metro yarıçap 1 mil ila 3 mil arasındaysa, mülk fiyatı 5000'e ekleyin.
//		Ardından, kullanıcıya karayoluna erişim izni verin. Otoyol 1 milden (dahil) daha yakınsa, mülk fiyatına 15000 ekleyin. 
//		Otoyol yarıçapı 1 ile 5 mil arasındaysa, mülk fiyatına 8000 ekleyin. 
//		Otoyol yarıçapı 5 mil ile 20 mil arasındaysa (dahil), mülk fiyatına 4000 ekleyin. 
//		O zaman programınız en yakın okul değerlendirmesi hakkında sormalıdır. 
//		Okulun notu 10 (dahil) ile 8 puan arasındaysa, 45000 emlak fiyatına ekleyin.
//		Okulun notu 8 puandan küçük veya daha fazla veya 4 puana eşitse, mülk fiyatına 20000 ekleyin.
//		Aksi takdirde, 5000 emlak fiyatına. Ardından, kullanıcıya sigara içen aile üyelerinden herhangi birini sorun.
//		Öyleyse, 5000 için emlak fiyatını düşürün. Sonunda, şu mesajı görüntüleyin: 
//			"Piyasa raporu oluşturuldu." Ve altında: "Tahmini piyasa fiyatınız: propertyPrice $"
//
//Verilen:
//
//-int özellikFiyat = 0;
//-Bir sayıdaki yatak odası, garajSpots;
//-float metro Erişilebilirlik, okulScore, otoyol Erişilebilirlik;
//-bool bahçe, sigara içme, garaj;
//
//Örnek 1:
//
//-Ekran istemi: Mülkünüzü giriniz
//konut
//-Ekran istemi: Kaç tane yatak odanız var?
//3
//-Ekran istemi: "Bir arka bahçen var mı?
//doğru
//-Ekran istemi: Arka bahçe konut için uygun değil!
//-Ekran istemi: Garajınız var mı?
//doğru
//-Ekran istemi: "Kaç nokta var?
//2
//-Ekran istemi: "Metro istasyonu ne kadar yakın?
//0.5
//-Ekran istemi: "Otoyol ne kadar yakın?
//1.5
//-Ekran istemi: "En yakın okulun derecesi nedir?
//9
//-Ekran istemi: "Ailenizden herhangi biri sigara içiyor mu?
//doğru
//-Ekran istemi: "Piyasa raporu oluşturuldu.
//-Ekran istemi: "Tahmini piyasa fiyatınız: 238000 $
