package HomeTask1;

public class RotationOfString_Normal_3 {

    public static void check(String s1, String s2) {
        if (s1.length() == s2.length()) {
            String concatenatedString = s1 + s1;
            if (concatenatedString.contains(s2)){
                System.out.println(s1 + " and " + s2 + " are rotation of each other");}
                else
                {
                    System.out.println(s1 + " and " + s2 + " are not rotation of each other");
                }
            }
        else
        {
            System.out.println(s1 + " and " + s2 + " are not rotation of each other");
        }
        }

        public static void main(String[] args){
           check("helloeducative","educativehello");
        }
    }


