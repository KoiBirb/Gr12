public class Main {
    public static void main(String[] args) {

        String string = "skibity";

        System.out.println(reverseString(string));

        print(5);

        System.out.println(power(2,3));

        System.out.println(numDigits(12345));

    }

    public static String reverseString(String str) {

        if (str == null || str.length() <= 1)
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void print(int n) {
        if (n == 1)
            System.out.println(n);
        else {
            print(n - 1);
            System.out.println(n);
        }
    }

    public static int power (int n, int pow){
       if (pow == 0) {
           return 1;
       }else {
           return n * power(n, pow - 1);
       }
    }

    public static int numDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + numDigits(n/10);
        }
    }
}