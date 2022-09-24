

import java.util.Scanner;

public class CipherText {

	// Encrypts text using a shift by 3 position
	//main login implemented in this method 
	public static StringBuffer encrypt(String text) {

		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {
				char ch = (char) (((int) text.charAt(i) + 3 - 97) % 26 + 97);
				result.append(ch);
		}
		return result;
	}

	//main  method 
	//here we input the text and take the expected output
	public static void main(String[] args) {
		//TAKE INPUT FROM USER
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input Text ");
		String text = scanner.nextLine();

		System.out.println("Input  : " + text);
		System.out.println("Output : " + encrypt(text));
	}
}