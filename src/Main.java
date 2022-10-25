import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Word> words = new ArrayList<>();
	private static int LIFE = 6;

	public static void main(String[] args) {
		Word w1 = new Word("GÝTAR");
		Word w2 = new Word("TELEFON");
		Word w3 = new Word("POLONYA");
		Word w4 = new Word("AVUSTURYA");
		Word w5 = new Word("AVAKADO");
		words.add(w1);
		words.add(w2);
		words.add(w3);
		words.add(w4);
		words.add(w5);
		
		int rand = (int) (Math.random() * words.size());
		Word w = words.get(rand);
		w.splitWord();
		
		while(LIFE > 0) {
			System.out.println("Remaning Life : " + LIFE);
			System.out.print("Enter a letter that you want to try : ");
			
			char c = scan.nextLine().toUpperCase().charAt(0);
			if(!w.guessCheck(c)) {
				LIFE--;
			}
			
			w.print();	
			System.out.println();
			
			if(w.gameCheck()) {
				System.out.println("YOU WIN!");
				return;
			}
		}

		System.out.println("YOU LOSE!");
		System.out.println("The word was : " + w.getWord()); 
	}

}
