public class ToggleCase {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isUpperCase(ch))
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        else
            System.out.println("Not a letter");
    }
}
