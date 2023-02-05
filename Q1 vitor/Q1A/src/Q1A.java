import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra com cinco letras:");
        String word = sc.next();
        sc.close();
        Set<String> threeLetterWords = new HashSet<>();
        for (int i = 0; i < word.length() - 2; i++) {
            threeLetterWords.add(word.substring(i, i+3));
        }
        System.out.println(threeLetterWords);
    }
}