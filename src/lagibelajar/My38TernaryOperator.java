//14 november 2020
//udemy java masterclass by iced fin	

package lagibelajar;

public class My38TernaryOperator {

	public static void main(String[] args) {
		
		boolean isCar = true;
		
		//38 ternary operator 
		//isCar - cek kondisi apakah isCar benar
		//true - jika benar maka eksekusi 
		//false - jika salah eksekusi  
		
		boolean wasCar = isCar ? true : false;
		
		//coba selain boolean
		int hasil = isCar ? 12 : 13 ;
		
		if(isCar) {
			System.out.println("isCar is true");
		}
		if(wasCar) {
			System.out.println("wasCar is true");	
		}
		System.out.println(hasil);
		
		// ternary operator adalah shortcut dari if dan else statement.
		// syntax - boolean = (kondisi) ? (jikaBenar) : (jikaSalah) ;
		
		//39 operator challange
		
		double one = 20.00d;
		double two = 80.00d;
		
		double result1 = (one+two)*100.00d;
		double result2 = result1%40.00d;
		
		boolean result3 = result2==0 ? true : false ;
		
		System.out.println("result3 is " + result3);
		
		if(!result3) {
			System.out.println("got some reminder");
		}
	
	}

}
