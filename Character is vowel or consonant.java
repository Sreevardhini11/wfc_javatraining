public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 's';
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
