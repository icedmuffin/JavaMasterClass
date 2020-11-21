//16 november 2020 Malam

package lagibelajar;

public class My43KeywordAndExpression {

	public static void main(String[] args) {
		//43
		
		//1. keyword - kosa kata yang sudah ada "terdaftar"	
		
		//2. expressi - terdiri dari variable, value dan operators

		String variabel = "value";
		int value = 12;
		
		//keywords - string dan int
		//expressi - variabel = "value" dan value = 12
		
		
		//44 java statement
	
		System.out.println("hello world");
		//1. ini semua adalah statement
		
		/*44 java statement
		 * 
		 * 1. white space - spasi antara kode
		 * 2. indintation - mengatur blok kode biar rapi - kayak tab
		 * tujuan biar mudah di baca
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println();
		System.out.println("44. white space and indintation");
		System.out.println();
		
		int nilai = 100;
		if (nilai < 100 && nilai >50) {
			System.out.println("ini adalah code block, dan nilai < 100 dan nilai > 50");
		}
		else if (nilai < 50 ) {
			System.out.println("ini adalah code block, dan nilai < 50");
			
		}
		else {
			System.out.println("ini adalah code block, dan nilai >=100");
		}
		
		
		/*45 code block, if else control statement
		 *  1. code block - { ini code block }
		 *  
		 *  2. if else statement
		 *  code block bisa akses variable di luar, tapi kode di luar tidak bisa
		 *  karena variable code block di hapus. variable di dalam codeblock dinamakan scope
		 *  		 	
		 */
		
		System.out.println();
		System.out.println("45. code block, if else control statement");
		System.out.println();
		System.out.println("challange");
		//challange
		
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("your final score is " + finalScore);
		}
	}

}
