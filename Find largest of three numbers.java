public class LargestOfThree {
    public static void main(String[] args) {
        int a = 30, b = 50, c = 40;
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest: " + largest);
    }
}
