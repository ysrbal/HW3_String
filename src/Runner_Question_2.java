import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {
        System.out.print("Lütfen bir kelime giriniz ........ : ");
        String word = new Scanner(System.in).nextLine();
        String reverseWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            reverseWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println(word + " Kelimesi Palindrom bir kelimedir.");
        } else {
            System.out.println(word + " Kelimesi Palindrom bir kelime değildir.");
        }
    }
}
