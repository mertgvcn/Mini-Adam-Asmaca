import java.util.ArrayList;

public class Word {
	private String word;
	private int size;
	private char[] letters;
	private boolean[] visibility;
	
	Word(String word) {
		this.word = word.toUpperCase();
		size = word.length();
		letters = new char[size];
		visibility = new boolean[size];
	}
	
	public void splitWord() {
		for (int i = 0; i < size; i++) {
			letters[i] = word.charAt(i);
			visibility[i] = false;
		}
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			if(visibility[i]) {
				System.out.print(letters[i]);
			}else {
				System.out.print("_");
			}
		}	
		System.out.println();
	}
	
	public boolean guessCheck(char c) {
		int counter = 0;
		
		for(int i = 0; i < size; i++) {
			if(letters[i] == c) {
				visibility[i] = true;
				counter++;
			}
		}
		
		if(counter != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean gameCheck() {
		int counter = 0;
		
		for (int i = 0; i < size; i++) {
			if(visibility[i]) {
				counter++;
			}
		}
		
		if(counter == size) {
			return true;
		}
		
		return false;
	}
	
	//GETTER-SETTERS
	public String getWord() {
		return this.word;
	}

	public char[] getLetters() {
		return letters;
	}
	
	public boolean[] getVisibility() {
		return visibility;
	}	
}
