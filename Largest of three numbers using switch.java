public class LargestUsingSwitch {
    public static void main(String[] args) {
        int a = 20, b = 40, c = 30;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        switch (max) {
            case 20:
                System.out.println("Largest is: " + a);
                break;
            case 30:
                System.out.println("Largest is: " + c);
                break;
            case 40:
                System.out.println("Largest is: " + b);
                break;
        }
    }
}
