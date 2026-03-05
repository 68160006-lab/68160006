package lab11_2;

public class GameSevenNotOOP {

	public static void main(String[] args) {
		int score1,score2,total;
		
		score1 = (int)(Math.random() * 6) + 1;
		score2 = (int)(Math.random() * 6) + 1;
		
		System.out.println(score1 + " " + score2);
		
		total = score1 + score2;
		
		if (total == 7)
			System.out.println("You win.");
		else
			System.out.println("You lose.");			

	}

}
