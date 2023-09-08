public class PalindromeNumber {
    
    public static void main(String[] args) {
        int x = 121;
        int y = 5554455;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
        
        int z = 77977;
        int w = 1445442;
        System.out.println(isPalindrome_NotString(z));
        System.out.println(isPalindrome_NotString(w));
    }

    public static boolean isPalindrome(int x){
        StringBuilder s = new StringBuilder(Integer.toString(x));

        int j = s.length()-1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(j))
                return false;
            j--;
        }

        return true;
    }


    public static boolean isPalindrome_NotString(int x){
    
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;

    }
}
