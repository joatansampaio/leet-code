class MergeStringsAlternately {

    public static void main(String[] args) {
        String result = mergeAlternately("abc", "pqr");

        System.out.println(result);

    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int len = word1.length() > word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < len; i++) {
            if (!(i >= word1.length()))
                result += (word1.charAt(i));
            if (!(i >= word2.length()))
                result += (word2.charAt(i));
        }

        return result;

    }
}