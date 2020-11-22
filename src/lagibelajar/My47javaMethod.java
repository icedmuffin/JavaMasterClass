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
		
		System.out.println();
		System.out.println("48. java method part 1");
		
		//metode 1, metode ribet - perulangan kode, menimbulan kan peluang terjadi error
		System.out.println();
		System.out.println("metode 1");
		
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
		System.out.println();
		System.out.println("metode 2");
		
		calculateScore(true, 800, 5, 100 );
		calculateScore(true, 10000, 8, 200);
		
		//metode 3, metode lain, biar kode mudah di baca
		System.out.println();
		System.out.println("metode 3");
		
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
		
		
		//48. java method part 2 , menggunakan fungsi return
		System.out.println();
		System.out.println("48. java method part 2");
		
		
		/*hasil perhitungan dari codeblock pada method endScore di simpan
		 * dalam varibale int finalScore.
		*/
		int highScore = endScore(gameOver, score, levelCompleted, bonus);
		System.out.println("ini adalah hasil return dari method endScore " + highScore);
		
		
	}
	
	//ini method yang di buat. satu kode bisa dieksekusi berkali kali
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("your final score is " + finalScore);
		}
	}
	
	/*ini method yang di buat untuk return sesuatu, dalam kasus ini
	 * value yang return adalah int, hasil dari perhitungan finalScore.
	 * */
	
	
public static int endScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	
}
