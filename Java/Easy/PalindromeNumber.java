public class PalindromeNumber {

    public static void main(String[] args) {

        int z = 77977;
        int w = 1445442;
        System.out.println(solve(z));
        System.out.println(solve(w));
    }

    public static boolean solve(int number) {

        if (number < 0 || number % 10 == 0 && number != 0)
            return false;

        int reversed = 0;
        int original = number;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }
        return original == reversed;

    }

}
