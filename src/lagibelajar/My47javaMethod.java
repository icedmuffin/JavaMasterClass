/*
 * 21 november 2020 20:05
 * 
 *
 * */
package lagibelajar;

public class My47javaMethod {

	public static void main(String[] args) {
	
		/*47. java method part 1 
		 * method membuat kode lebih mudah di mantain dan menghindari duplikasi.
		 * 
		 * */
		
		
		
		//metode 1, metode ribet - perulangan kode, menimbulan kan peluang terjadi error
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("your final score is " + finalScore);
		}
		
		gameOver = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("your final score is " + finalScore);
		}
		
		//metode 2, menggunakan java method
		
		calculateScore(true, 800, 5, 100 );
		calculateScore(true, 10000, 8, 200);
		
		//metode 3, metode lain, biar kode mudah di baca
		
		gameOver = true;
		score = 800;
		levelCompleted = 5;
		bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus );
		
		gameOver = true;
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		calculateScore(gameOver, score, levelCompleted, bonus );
	}
	
	//ini method yang di buat. satu kode bisa dieksekusi berkali kali
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("your final score is " + finalScore);
		}
	}
}
