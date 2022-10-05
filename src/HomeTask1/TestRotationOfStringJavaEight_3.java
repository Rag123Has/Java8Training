package HomeTask1;

public class TestRotationOfStringJavaEight_3 {
  public static void main(String[] args){
      RotationOfStringInterface_3 r = (String s1,String s2)->{
          if (s1.length() != s2.length()) return false;
          String concatenatedString = s1 + s1;
          return concatenatedString.contains(s2);
      };

      String s1 = "helloeducative";
      String s2 = "educativehello";
      boolean flag = r.check(s1,s2);
      if(flag) System.out.println(s1 + " and " + s2 + " are rotation of each other");
      else System.out.println(s1 + " and " + s2 + " are not rotation of each other");
  }
  }

