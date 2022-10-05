package HomeTask1;

import javax.swing.*;
import java.util.Locale;

public class Plindrome_Normal_1 {

    public void checkPalindrome(String str)
    {
        String strRev="";
        int length= str.length();
        for(int i= (length-1);i>0;i--){
            strRev= strRev + str.charAt(i);
        }
        if(str.toLowerCase().equals(strRev.toLowerCase())){
            System.out.println(str + " is a Palindrome String.");}
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

    }

    public static void main(String[] args){
        Plindrome_Normal_1 p = new Plindrome_Normal_1();
       p.checkPalindrome("Teacher");
    }
}




