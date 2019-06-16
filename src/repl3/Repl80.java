package repl3;

import java.util.Scanner;

public class Repl80 {

	public static void main(String[] args) {
		
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    
	    if (isPremiumCustomer ==true) {
	    	if ((nbooksPurchased>=5) && (nbooksPurchased<8)) {
	    		freeBooks += (nbooksPurchased /5);
	    	}else if ((nbooksPurchased>=8) && (nbooksPurchased%8>=0)) 
	    		freeBooks += (nbooksPurchased /8)*2 ;	
	    }
		if (isPremiumCustomer != true) {
	    	if ((nbooksPurchased>=7) && (nbooksPurchased<12)) {
	    		freeBooks += (nbooksPurchased /7);
	    	}else if ((nbooksPurchased>=12) && (nbooksPurchased%12>=0)) 
	    		freeBooks += (nbooksPurchased /12)*2 ;	
	    	
		}
			System.out.println(freeBooks);
			
	    

	}
}
//Çevrimiçi Kitap Satıcıları, 5 veya daha fazla kitap alımında birinci sınıf müşterilere 1 ücretsiz kitap sunar ve
//Her 8 veya daha fazla kitap satın alındığında 2 ücretsiz kitap sunar. Düzenli müşterilere 1 ücretsiz kitap sunuyor
//Her 7 veya daha fazla kitap alımında ve her 12 veya daha fazla kitap alımında 2 ücretsiz kitap sunar.
//Boolean değişkeninin değerlerine göre freeBook'lara uygun değeri atanan bir program yazın
//isPremiumCustomer ve int değişkeni nbooksPurchased. Konsolda serbest kitap miktarını yazdırın.

//Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books and 
//offers 2 free books with every purchase of 8 or more books. It offers regular customers 1 free book 
//with every purchase of 7 or more books, and offers 2 free books with every purchase of 12 or more books. 
//Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable
//isPremiumCustomer and the int variable nbooksPurchased. Print amount of freeBooks into the console. 


//while(isPremiumCustomer ==true){
//    if(nbooksPurchased>0 && nbooksPurchased%5 >=0){
//     System.out.println((nbooksPurchased + nbooksPurchased/5)*1);
//    }else if(nbooksPurchased>0 && nbooksPurchased%8 >= 0){
//      System.out.println((nbooksPurchased + nbooksPurchased/5)*2);
//    }else if(nbooksPurchased>0 && nbooksPurchased%7 >= 0){
//      System.out.println(nbooksPurchased + (nbooksPurchased/7)*1);
//    }else if(nbooksPurchased>0 && nbooksPurchased%12 >= 0)
//    System.out.println(nbooksPurchased + (nbooksPurchased/12)*2);
//  }
//   }
//}
