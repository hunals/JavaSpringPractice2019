package repl2;

import java.util.Scanner;

public class Repl54 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
		String name1 = "Max Payne" ;
		String name2 = "Alan Wake" ;
		
		System.out.println("Enter full name:");
		String name = scan.nextLine();

		if (name.equalsIgnoreCase(name1)) {
			System.out.println( "User found!" );
		}else if (name.equalsIgnoreCase(name2)) {
			System.out.println( "User found!" );
		} else  
			System.out.println( "User not found!" );
	
	
	}

}

//Assume that you have only 2 users: Max Payne and Alan Wake. 
//First, ask user to enter full name. Display message: "Enter full name:". 
//Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!".
//Otherwise,  display message: "User not found!". Please make your search case insensitive!

//Yalnızca 2 kullanıcınız olduğunu varsayalım: Max Payne ve Alan Wake. İlk önce, kullanıcıdan tam adını girmesini isteyin. 
//Ekran mesajı: "Tam adı girin:". Ardından kullanıcıdan giriş yapın. Eğer isim "Max Payne" veya "Alan Wake" e eşitse, şu mesajı göster:
//	"Kullanıcı bulundu!". Aksi takdirde, şu mesajı görüntüleyin: "Kullanıcı bulunamadı!". Lütfen arama durumunuzu duyarsız hale getirin!