import java.util.Scanner;

import javax.swing.JOptionPane;

public class HesapMakinesi {
	public void islem() {
		System.out.println("****Dort Islem Hesap Makinesi***");
		Scanner scanner = new Scanner(System.in);
				System.out.print("Sayi giriniz : ");
				int a = scanner.nextInt();
				System.out.print("Sayi giriniz : ");
				int b = scanner.nextInt();
				System.out.println("****Islem Turu Giriniz.****\n"+
				"Toplama (T)\n"+"Cikarma (C)\n"+"Carpma (X)\n"+"Bolme (B)");
				String Tur = scanner.nextLine();
				Tur = scanner.nextLine();
				
				System.out.println("Sonuc:"+sayi(a,b,Tur));
		

	}
   static int sayi(int a,int b,String Tur) {
	   int s = 0;
	   if(Tur.equals("T") || Tur.equals("t"))
		 s =  a + b;
	   else if(Tur.equals("C") || Tur.equals("c"))
			 s =  a - b;
	   else if(Tur.equals("X") || Tur.equals("x"))
			 s =  a * b;
	   else if(Tur.equals("B") || Tur.equals("b"))
			 s =  a / b;
	   else {
		 JOptionPane.showMessageDialog(null,"Hatali islem turu girdiniz.");
	}
	   	   	return s;
	}
}
