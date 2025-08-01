public class GreaterNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}