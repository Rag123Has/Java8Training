package HomeTask1;

public class TestPalindromeStringJavaEight_1 {

    public static void main(String[] args) {

        PalindromeInterface_1 pl = (str) -> {
            String strRev = "";
            int length = str.length();
            for (int i = (length - 1); i >= 0; i--) {
                strRev = strRev + str.charAt(i);
            }
            if (str.toLowerCase().equals(strRev.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            } else {
                System.out.println(str + " is not a Palindrome String.");
            }
        };

        pl.palindromeString("redivider");


    }
}
