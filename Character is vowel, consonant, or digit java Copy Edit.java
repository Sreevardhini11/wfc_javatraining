public class VowelConsonantDigit {
    public static void main(String[] args) {
        char ch = '9';
        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if ("aeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Special Character");
        }
    }
}
