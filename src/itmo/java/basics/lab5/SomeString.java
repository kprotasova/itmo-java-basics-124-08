package itmo.java.basics.lab5;

import java.util.Arrays;

public class SomeString {

    public static String theLongestWord (String text) {

        String longestWord = "";
        String[] words = text.split("[\\s,.?!;:\\-]+");
        for (String w : words) {
            if (w.length() > longestWord.length() ) {
                longestWord = w;
            }
        }
        return longestWord;
    }

    public static boolean isPalindrome (String word) {
        word = word.toLowerCase();
        boolean isPalindrome = true;
        String[] characters = word.split("");
        String[] newCharacters = new String[characters.length];
        for (int i = 0; i < characters.length; i++) {
            newCharacters [i] = characters [(characters.length -1) - i];
        }
        for (int i = 0; i < characters.length; i++) {
            if (!characters[i].equals(newCharacters[i])) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static String toCensored(String text, String find, String replacement) {
        String newText = text;
        if (text.contains(find)) {
            newText = text.replace(find, replacement);
        }
        return newText;
    }

   public static int howManyTimes (String text, String subtext) {
        text = text.toLowerCase();
        int count = 0;
        int currentIndex = 0;
        while (text.indexOf(subtext, currentIndex) != -1) {
            currentIndex = text.indexOf(subtext, currentIndex);
            count++;
            currentIndex += subtext.length();
        }
        return count;
   }

   public static void reverse (String text) {
        System.out.println("The given string is: " + text);
        String [] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversed.append(reversedWord);
            reversed.append(" ");
        }
        System.out.println("The string reversed word by word is: " + reversed);
   }

    public static void main(String[] args) {
        System.out.println (isPalindrome("Потоп"));
        System.out.println(theLongestWord("Написать метод для поиска самого длинного слова в тексте. Hello word! London is the capital of Great Britain. yrasextdcrfzvtgubhnjmk?"));
        String words = "faghf, wadesfdgh, sawdfg";
        String words2 = "faghf,wadesfdgh,sawdfg";
        System.out.println(Arrays.toString(words.split(",")));
        System.out.println(Arrays.toString(words2.split(",")));
        System.out.println(howManyTimes("abcabaaaaacabbbcab, ab ab. Abc cba, ab c!", "ab"));
        reverse("This is a test string");
    }
}
